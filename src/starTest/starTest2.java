package starTest;

public class starTest2 {
    public static void main(String[] args) {
        // 2번 문제
        for (int i=1; i<=5; i++){
            System.out.println("*");
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();

        // 3번 문제
        for (int i=1; i<=5; i++){
            for (int j=4; j>=i; j--){
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }
}
