package ch6;

public class Ex6_6 {
    // 두 점 (x,y)와 (x1, y1) 간의 거리를 구한다.
        static double getDistance(int x, int y, int x1, int y1){
            int a = (x-x1)*(x-x1); // 가로 x-x1의 거리 제곱
            int b = (y-y1)*(y-y1); // 세로 y-y1의 거리 제곱
            double sqrt = Math.sqrt(a + b);
            return sqrt;

        }

    public static void main(String[] args) {
            System.out.println(getDistance(1,1,2,2));
    }
}
