package ch7;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM]; // SutdaCard객체 배열 new SutdaCard[20] 생성

    SutdaDeck2(){
        for (int i = 0; i < cards.length; i++) {
            int num = i+1;
//            boolean isKwang = num==1 || num==3 || num==8;
            boolean isKwang = false;  // boolean isKwang = num==1 || num==3 || num==8;
            if (num == 1 || num == 3 || num ==8)
                isKwang = true;
            if (i>9){
                num = i-9; // 인덱스가 10이 넘을때(num = 11) 1에서 시작
            }
            cards[i] = new SutdaCard2(num,isKwang); // cards[0] = new SutdaCard(); 배열의 요소에 저장
        }
    }
    void shuffle(){
//        int j = (int)(Math.random()*20)+1;
//        int tmp;
//        SutdaCard2[] tmp = new SutdaCard2[CARD_NUM];

        for (int i = 0; i <cards.length; i++) {
            int j = (int)(Math.random()*20);
//            int tmp = 0;
//            SutdaCard2[] tmp = new SutdaCard2[CARD_NUM];
//            SutdaCard2 j = new SutdaCard2();
//            SutdaCard2 j = (int) (Math.random() * 20) + 1;

            SutdaCard2 tmp = cards[i];  // SutdaCard2 tmp << SutdaCard2를 붙여야하는지 이유 // cards[]배열의 타입 SutdaCard
            cards[i] = cards[j];
            cards[j] = tmp;
//            System.out.print(cards[i]);
        }
    }
    SutdaCard2 pick(int index){

        return cards[index];    // 리턴 값이 cards[index] 생각 x
    }
//
    SutdaCard2 pick(){
        int j = (int) (Math.random()*20); // 리턴값 pick()으로 생각 x , 어떻게 이렇게??
        return pick(j);
    }
}
class SutdaCard2{
    int num;
    boolean isKwang;
    SutdaCard2(){
        this(1, true);
    }
    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString(){
        return num + (isKwang ? "K" : "");
    }

}

public class Ex7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck2 = new SutdaDeck2();
        System.out.println(deck2.pick(0));
        System.out.println(deck2.pick());

        deck2.shuffle();
        for (int i = 0; i < deck2.cards.length; i++) {
            System.out.print(deck2.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck2.pick());

    }
}
