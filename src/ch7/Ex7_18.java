package ch7;

public class Ex7_18 {
    /**
     * hint : instanceof 연산자를 사용해서 형변환한다. (형변환 하려면 instanceof를 써야함)
     * 메서드 action을 만든다.
     * 주어진 객체의 메서드를 호출한다.
     * DaceRobot()인 경우, dance()를 호춣,
     * SingRobot()인 경우, sing()을 호출,
     * DrawRobot()인 경우, draw()를 호출
     * 반환 타입 : x
     * 매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스     *
     *
     * 문제풀이
     * arr[0]를 하면 new DanceRobot()으로 new연산자로 DanceRobot 인스턴스를 생성한다.
     * action(arr[0]) 메서드 호출하면 매개변수로 DanceRobot인스턴스를 받아서 활용을 해야함.
     * DanceRobot인스턴스가 들어오면 Robot을 상속받는 class DanceRobot의 dance() 메서드를 호출 해야함.
     *
     * DanceRobot인스턴스 들어올때 dance()메서드 호출을 어떻게 하지?
     * 각 객체를 매개변수로 받았을때 각 메서드를 호출해야함. this.메서드()로 바로는 안되고
     * 로봇을 상속받으니깐 로봇의 자손으로 형변환 하면 안되고, 자손이 로봇타입으로 형변환하면 그래도 기능을 못쓰는데?
     * ==> 로봇(조상)타입 참조변수를 자손(DanceRobot)타입 인스턴스로 형변환하면 기능 사용가능
     * 기초편 p.250참조
     * void doWork(Car c) {
     *     if (c instancof FireEngine) {
     *         FireEngine fe = (FireEngine)c;
     *         fe.water();
     *     }
     * }
     *
     **/
    static void action(Robot r){
        if (r instanceof DanceRobot){
            DanceRobot d = (DanceRobot)r;
            d.dance();
        }
        if (r instanceof SingRobot){
            SingRobot s = (SingRobot)r;
            s.sing();
        }
        if (r instanceof DrawRobot){
            DrawRobot w = (DrawRobot)r;
            w.draw();
        }
    }
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }
}
class Robot {}
class DanceRobot extends Robot {
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing(){
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw(){
        System.out.println("그림을 그립니다.");
    }
}
