package ch5;

public class Ex5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        /******
         * sum = sum + arr[0]
         * sum = sum + arr[1]
         * sum = sum + arr[2]
         * sum = sum + arr[3]
         * ...
         *****/

        System.out.println("sum = " + sum);
    }
}
