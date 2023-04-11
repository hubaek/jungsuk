package ch4;

public class Ex4_8 {
    public static void main(String[] args) {
        for (int x=0; x<=10; x++){
//            x*=2;
            for (int y=0; y<=10; y++){
                //y=y*4;
                if ((x*2)+(y*4)==10){
                    System.out.printf("x=%d, y=%d",x,y);
                }
            }
            System.out.println();
        }
    }
}
