package etc;

class Point1{
    int x;
    int y;
//    public String toString() {
//        return "x : "+x+", y : "+y;
//    }
}

class Point3D extends Point1 {
    int z;
    Point3D(){
        x = 1;
        y = 1;
        z = 1;
    }
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public String toString(){
        return "x : "+x+", y : "+y+", z : "+z ;
    }
}

public class Pointt {
    public static void main(String[] args) {
        Point3D d = new Point3D(2,3,4);
        System.out.println(d.toString());
        System.out.println(d.x);
        System.out.println(d.y);
        System.out.println(d.z);
    }


}
