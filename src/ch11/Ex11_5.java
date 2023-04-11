package ch11;

import java.util.*;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){ // 합계를 구하는 메서드      Comparable인터페이스 구현이면 메서드는 전부 public이 되어야하는거아닌가?
        return this.kor + this.eng + this.math;
    }
    float getAverage(){
        return getTotal()/3.0f; // 소수점 첫째자리까지 나오게 하기
    }

    public String toString() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }

    @Override
    public int compareTo(Object o1) {   // name이 기본 정렬기준이 되어야 함.. name을 어떻게 적어야하지? comparable 구현,,
        if (o1 instanceof Student){
//            String s = (String)o1;
            Student tmp = (Student)o1;
            return name.compareTo(tmp.name);
        } else
            return -1;
    }
} // class Student

public class Ex11_5 {
    public static void main(String[] args) {
//        Student s = new Student("홍",1,1,50,40,65);
//        System.out.println(s.getAverage());
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이자바",1,4,70,90,70));
        list.add(new Student("안자바",1,5,60,100,80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
