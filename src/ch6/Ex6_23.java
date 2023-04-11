package ch6;

import java.util.Arrays;

public class Ex6_23 {

    static int max(int[] arr){
        /**
         * 문제
         * 메서드명 : max
         * 기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
         *       만일 주어진 배열이 null이거나 크기가 0인 경우 => -999999 반환
         * 반환타입 : int
         * 매개변수 : int[] arr - 최대값을 구할 배열
         **/
        
        /** 
         * 최대값 변수 : num선언 
         * 배열 최대값 = arr[0]보다 높으면 num에 대입
         * 먼저 유효성 검사로 null이거나 크기 0인경우 부터 조건문 작성 
         * 배열의 크기? 배열.length??
         * 최대값 찾을려면 반복문 사용 [0]~[끝] [0]자리에서 큰값 계속 대입
         **/
        
        if (arr == null || arr.length==0)
            return -999999;
        
        int num = arr[0];
        for (int i=1; i<arr.length; i++){
//            num=arr[0];  // 반복문 안에 이 문장이 있으면 마지막에 [0]과 인덱스 마지막꺼만 비교하는 꼴이 됨
            if (arr[i]>num){
                num = arr[i];
//                return num;
            }
        }
//        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : "+max(data));
        System.out.println("최대값 : "+max(null));
        System.out.println("최대값 : "+max(new int[]{}));
    }

}
