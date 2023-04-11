package ch5;

import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i=0; i<ballArr.length; i++){
            int j = (int)(Math.random()*ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];       // 빈 공간에 ballArr배열의 i 인덱스를 저장한다.
            ballArr[i]=ballArr[j];  // tmp에 저장했었던 i자리에 랜덤으로 받은 j를 저장한다.
            ballArr[j]=tmp;         // 랜덤으로 받았던 j의 자리엔 i인덱스를 저장했던 tmp를 저장해서 i와 j를 바꾼다.
        }
        System.out.println(Arrays.toString(ballArr));

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        for (int i=0; i<ball3.length; i++){
            ball3[i]=ballArr[i];        // ball3.length = 3 이므로, i=0~2까지 ballArr 배열의 앞에서 3개의 수를 ball3에 대입한다.
            System.out.print(ball3[i]);
        }
    }
}
