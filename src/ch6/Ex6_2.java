package ch6;

class  Ex6_2 {
    public static void main(String[] args) {
        SutdaCard2 card1 = new SutdaCard2(3, false);
        SutdaCard2 card2 = new SutdaCard2();

        System.out.println(card1.info());
        System.out.println(card2.info());


    }
}

class SutdaCard2 {
    int num;        // 카드의 숫자 (1~10사이의 정수)
    boolean isKwang; // 광 이면 true 아니면 false

    SutdaCard2(){
        this(1,true);
    }
    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
     String info() {
        if (isKwang==true){
            return num+"K";
        }else {
            return num+"";
        }
//        return num+"";
    }

}