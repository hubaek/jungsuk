package ch6;

class Mypoint {
    int x;
    int y;
    Mypoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    // 인스턴스 메서드 getDistance를 작성하시오
    double getDistances(int x, int y){
        int a = (this.x-x)*(this.x-x);  // Mypoint생성자의 this.x - getDistances 지역(매개)변수 x
        int b = (this.y-y)*(this.y-y);
        return Math.sqrt(a + b);
    }
}

public class Ex6_7 {
    public static void main(String[] args) {
        Mypoint p = new Mypoint(1,1);

        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistances(2,2));
    }
}
