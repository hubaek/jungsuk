package ch6;

public class Ex6_5 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());

    }
}


class Student2{
    String name;    // 학생이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어점수
    int eng;        // 영어점수
    int math;       // 수학점수
    Student2(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){
        return kor + eng + math;
    }
    float getAverage(){
//        int total = kor+eng+math;
        float result = (float)getTotal()/3 ;
        float tmp = (float)(Math.round(result*10)/10.0);
        return tmp;
    }
    String info(){

        return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
    }

}
