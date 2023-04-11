package starTest;

public class starTest8 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i+=2){
            for(int j=8; j>=i; j-=2){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
//            for(int j=8; j>=i; j-=2){
//                System.out.print(" ");
//            }
            System.out.println();
        }

    }
}
