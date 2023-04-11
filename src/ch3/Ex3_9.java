package ch3;

public class Ex3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ('a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z') || ch>0&&ch==0&&ch<0;

        System.out.println(b);
    }
}
