package ch4;

public class Ex4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
//            System.out.print(str.charAt(i));
            sum = sum + str.charAt(i)-'0';  // str.charAt(i) = '1,2,3,4,5' 각각 문자형이기 때문에 -'0'을 해서 숫자로 변환
        }
        System.out.println(sum);
    }
}
