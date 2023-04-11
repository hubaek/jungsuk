package ch7;

public class Ex7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Tv2());
        b.buy(new Audio2());
        b.buy(new Computer2());
        b.buy(new Computer2());
        b.buy(new Computer2());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product2[] cart = new Product2[3];  // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product배열 cart에 사용될 index

    void buy(Product2 p){
        /** 지정된 물건을 구입한다.
         * 가진 돈(money)에서 물건의 가격을 빼고
         * 장바구니(cart)에 담는다
         * 만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
         **/
        if (money < p.price) {
            System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다.");
            return;    // 1번 만약 가진 돈이 물건의 가격보다 적다면 바로 종료
        }
        money -= p.price;               // 2번 가진 돈에서 물건의 가격을 뺀다
        add(p);                         // 장바구니에 구입한 물건을 담는다 add 메서드 호출
    }
    void add(Product2 p){
        /** 지정된 물건을 장바구니에 담는다. 만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배늘린 다음에 담는다.
         *  i의 값이 장바구니의 크기보다 같거나 크면
         *  기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
         *  기존의 장바구니의 내용을 새로운 배열에 복사한다.
         *  새로운 장바구니와 기존의 장바구니를 바꾼다
         *  물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
         **/
        if (i >= cart.length) { // i의 값이 장바구니의 크기보다 같거나 크면
            Product2[] tmp = new Product2[cart.length*2];// 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
            System.arraycopy(cart,0,tmp,0,cart.length);// 기존 내용 새로운 배열에 복사 arraycopy
            cart = tmp;
        }
        cart[i++] = p;

    }
    void summary(){
        // 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
        // 1. 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
        // 2. 장바구니에 담긴 물건들의 가격을 모두 더해서 출력하낟.
        // 3. 물건을 사고 남은 금액(money)를 출력한다.
        // 목록,, 물건 가격 sum
        int sum = 0;
        String list ="";
        for (int i = 0; i < cart.length; i++) {
            if (cart[i]==null) break;
            list += cart[i]+", ";
            sum += cart[i].price;
        }
        System.out.println("구입하신 물건 : "+list);
        System.out.println("사용한 금액 : "+sum);
        System.out.println("남은 금액 : "+money);

    }
}
class Product2 {
    int price;  // 제품의 가격
    Product2(int price){
        this.price = price;
    }
}
class Tv2 extends Product2 {
    Tv2(){super(100);}
    public String toString() { return "Tv2"; }
}
class Computer2 extends Product2 {
    Computer2(){super(200);}
    public String toString() { return "Computer2"; }
}
class Audio2 extends Product2 {
    Audio2(){super(50);}
    public String toString() { return "Audio2"; }
}
