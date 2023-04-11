package ch5;

public class Ex5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5,  5,  5,  5,  5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 300}
        };

        int total = 0;
        float average = 0;
        int count = 0 ;
        for (int i=0; i<arr.length; i++){
            count += arr[i].length;
            for (int j=0; j<arr[i].length; j++){
//                count += arr[i].length;  // 배열의 개수 (총합의 평균을 구하기 위한 변수 count)
                total += arr[i][j];
            }
        }
        System.out.println("count"+count);
        average = total/(float)count;
//        System.out.println(count);

        System.out.println("total = " + total);
        System.out.printf("average = %.2f " ,average);
    }
}

/**
 * 실행결과
 * total = 325
 * average = 16.25
 */
