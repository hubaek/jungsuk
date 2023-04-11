package etc;

class Point {
    int x;
    int y;

    Point(){
        x = 1;
        y = 1;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x : "+x+" y :"+y;
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x+","+p.y);
        Point p2 = new Point(3,5);
        System.out.println(p2.x+","+p2.y);
        System.out.println(p2);
    }
}
