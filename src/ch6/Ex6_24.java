package ch6;

public class Ex6_24 {
    /**
     * 메서드명 : abs
     * 기능    : 주어진 값의 절대값을 반환한다.
     * 반환타입 : int
     * 매개변수 : int value
     *
     * 생각정리
     * 절대값 구하는 방법??
     * Math.abs(타입) - 절대값구하는 함수
     */
    static int abs(int value){
        // 절대값
        if (value>=0)
            return value;
        else
            return -value;
//        return Math.abs(value);
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값 : "+abs(value));
        value = -10;
        System.out.println(value+"의 절대값 : "+abs(value));
    }
}
