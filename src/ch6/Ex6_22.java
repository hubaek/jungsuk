package ch6;

public class Ex6_22 {

    static boolean isNumber(String str){
//        if (Integer.parseInt(str))
//        for (int i=0; i<str.length(); i++){
//            char check = str.charAt(i);
//            System.out.println("check = " + check);
//            if ('0'<= check && check<='9') {
//                return true;
//            }
//            else if ( str.equals(null) || str.equals("")) {
//                return false;
//            }
//        }
//        return true;

        // false 경우의 수가 적을경우엔 false를 위에 먼저 두고
        if(str==null || str.equals(""))
            return false;

        for(int i=0; i<str.length(); i++) {
            char check = str.charAt(i);
            if(!('0' <= check && check <= '9')) {
                return false;
            }
        }
        return true;

        // str이 들어왔다? 빈문자열? null체크?
        // 만약 이 두개가 아니라면
            // 다돌고 , 하나라도 문자가 없으면, 즉 숫자라면 true니깐 true 반환
            // 아니면 하나라도 문자가 있으면(숫자가 아니면) false 반환
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
//        System.out.println(str);
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
