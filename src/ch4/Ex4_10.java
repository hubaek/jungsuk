package ch4;

public class Ex4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num!=0){
            sum=sum+num%10; // sum+=num%10
            num=num/10; //num/=10
        }
        System.out.println(sum);
    }
}
