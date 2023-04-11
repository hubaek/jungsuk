package starTest;

public class starTest6_ver2 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=4; j>=0; j--){
                if (i<j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
//           이전에 했던 방식
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
