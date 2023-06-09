package ch7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM]; // cards[] = {20개 배열}

    SutdaDeck(){
        for (int i = 0; i < cards.length; i++) {
            int num = i+1;
            boolean isKwang = false;  // boolean isKwang = num==1 || num==3 || num==8
            if (num == 1 || num == 3 || num ==8)
                isKwang = true;
            if (i>9){
                num = i-9;
            }
            cards[i] = new SutdaCard(num,isKwang);
        }
    }
}
class SutdaCard{
    int num;
    boolean isKwang;
    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString(){
//        if (isKwang = true) return "K";
//        boolean kwang=isKwang;
        return num + (isKwang ? "K" : "");
    }

}

public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }
}
