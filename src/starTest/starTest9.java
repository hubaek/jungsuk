package starTest;

public class starTest9 {
    public static void main(String[] args) {
        for (int i=1; i<=6; i+=2) {
            for (int j = 1; j < i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x=3; x<=5; x+=2){
            for (int y=4; y>x; y--){
                System.out.print(" ");
            }
            for (int y=1; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
            //System.out.println();
        }
//            System.out.println("_");
//
//            for(int j=8; j>=i; j-=2){
//                System.out.print(" ");
//            }
//            for (int j=1; j>=i; j--){
//
//                System.out.print(" ");
//            }
//            for (int j=3; j<=i; j++){
//                System.out.print("*");
//            }


        }
    }

