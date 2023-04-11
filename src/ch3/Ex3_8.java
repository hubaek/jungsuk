package ch3;

import java.math.BigInteger;

public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;

        char ch = 'A';
        ch = 'A' +2;

        BigInteger b1 = new BigInteger("3000");
        BigInteger b2 = new BigInteger("3000");
        BigInteger b3 = new BigInteger("3000");
        b3.multiply(b1.multiply(b2));
//        System.out.println(b3.multiply(b1.multiply(b2)));
        float f = 3/2f;
//        BigInteger l = 3000*3000*3000;

        double f2 = 0.1;
        double d = 0.1;

        boolean result = d==f2;

        System.out.println("c= "+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+b3.multiply(b1.multiply(b2)));
        System.out.println("result="+result);


    }
}
