package starTest;

public class starTest1 {
    public static void main(String[] args) {
        // 1번문제
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                System.out.printf("[%d,%d]", i,j);
//            }
//            System.out.println();
//        }

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if(i==j)
//                    System.out.printf("[%d,%d]", i,j);
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                if(i+j==6) // if(i==j\\i+j==6) , if(i==j && i+j==6) , !(i==j&&i+j==6)
                    System.out.printf("[%d,%d]", i,j);
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // 7번문제
        for (int i=5; i<=9; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
