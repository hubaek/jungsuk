package etc;

public class forTest {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++){
//            System.out.printf("%d %d%n", i, i*2);   // 1번문제) 2,4,6,8 ...
//            System.out.printf("%d %d%n", i, i*2-1); // 2번문제) 1,3,5,7 ...
//            System.out.printf("%d %d%n", i, i*i);   // 3번문제) 1,4,9,16 ...
//            System.out.println((i+2)/3);
            System.out.println((i+2)%3+1);

        }
    }
}
