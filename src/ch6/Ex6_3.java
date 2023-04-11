package ch6;

public class Ex6_3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban =   1;
        s.no =    1;
        s.kor = 100;
        s.eng =  60;
        s.math = 76;

        System.out.println("이름 : "+ s.name);
        System.out.println("총점 : "+ s.getTotal());
        System.out.println("평균 : "+ s.getAverage());
    }
}

class Student {
    String name;    // 학생이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어점수
    int eng;        // 영어점수
    int math;       // 수학점수

    Student(){}

    int getTotal(){
        int sum = this.kor + this.eng + this.math;
        return sum;
    }
    float getAverage(){
//        int total = kor+eng+math;
        float result = (float)getTotal()/3 ;
        float tmp = (float)(Math.round(result*10)/10.0);
        return tmp;
    }

}