package etc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrTest1 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i=0;i<arr1.length; i++){
            arr1[i] = i+1;
        }
        System.out.println(Arrays.toString(arr1));
        for (int j=0; j<arr2.length; j++){
            arr2[j] = j+1;
        }
        System.out.println(Arrays.toString(arr2));

        if (arr1.equals(arr2)){
            System.out.println("같습니다");
        }else {
            System.out.println("다릅니다");

        }
    }
}
