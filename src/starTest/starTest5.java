package starTest;

public class starTest5 {
    public static void main(String[] args) {
        // 5번 문제
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // 6번 문제

//        System.out.println("____*");
//        System.out.println("___**");
//        System.out.println("__***");
//        System.out.println("_****");
//        System.out.println("*****");
        for (int i = 1; i <= 5; i++) {
//            System.out.print();
            for (int j = 4; j >= i; j--) {
                //System.out.print(" ");
//                for (int z=4; z>=j; z--){
//                    System.out.print("_");
//                }
                System.out.print(" ");
                //System.out.print("*");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}