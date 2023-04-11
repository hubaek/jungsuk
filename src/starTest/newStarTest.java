package starTest;

public class newStarTest {
    public static void main(String[] args) {
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");

        // 2번문제 대각선 찍기
//                for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if(i==j)
//                    System.out.printf("[%d,%d]", i,j);
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
        // 3번문제 역순 대각선 찍기
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if(i+j==6) //
//                    System.out.printf("[%d,%d]", i,j);
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


//          4번 문제 == 2번문제+3번문제 합집합 ||
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if((i+j==6)||(i==j)){
//                    System.out.printf("[%d,%d]", i, j);
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        5번문제
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if(i>=j){
//                    System.out.printf("[%d,%d]", i, j);
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // 6번 문제
//        System.out.println("                    [1.5]");
//        System.out.println("               [2,4][2.5]");
//        System.out.println("          [3,3][3,4][3.5]");
//        System.out.println("     [4,2][4,3][4,4][4.5]");
//        System.out.println("[5,1][5,2][5,3][5,4][5.5]");

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if (i+j>=6){
//                    System.out.printf("*"); //[%d,%d]", i, j
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // 8번 문제
//        System.out.println("                    [1,5]");
//        System.out.println("               [2,4][2,5][2,6]");
//        System.out.println("          [3,3][3,4][3,5][3,6][3,7]");
//        System.out.println("     [4,2][4,3][4,4][4,5][4,6][4,7][4,8]");
//        System.out.println("[5,1][5,2][5,3][5,4][5,5][5,6][5,7][5,8][5,9]");

//        5번 응용
//        for (int i=1; i<=9; i++){
//            for (int j=1; j<=9; j++){
//                if(i>=j){
//                    System.out.printf("[%d,%d]", i, j);
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        6번 응용
//        for (int i=1; i<=9; i++){
//            for (int j=1; j<=9; j++){
//                if (i+j>=10){
//                    System.out.printf("[%d,%d]", i, j); //"[%d,%d]", i, j
//                }else {
//                    System.out.print("     ");
//                }
//            }
//            System.out.println();
//        }

//        8번문제 = 5,6번 응용 교집합 &&
//        for (int i=1; i<=9; i++){
//            for (int j=1; j<=9; j++){
//                if((i>=j)&&(i+j>=10)){
//                    System.out.printf("[%d,%d]", i, j);  // "*"
//                }else {
//                    System.out.print("    ");
//                }
//            }
//            System.out.println();
//        }
        // 9번문제 = 8번문제+ 8번거꾸로의 합집합
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if ( ((j>=i)&&(i+j<=6)) ||((i>=j)&&(i+j>=6)) ){
//                    System.out.printf("*"); //[%d,%d]", i, j
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }





//        10번 문제
        // 1)왼쪽 삼각형, 5번문제와 위로 뒤집은 모양의 교집합
//                for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if ( (i>=j)&&(i+j<=6) ){
//                    System.out.printf("[%d,%d]", i, j); //[%d,%d]", i, j
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    //      2)오른쪽 삼각형, 6번문제와 위로 뒤집은 모양의 교집합
        //        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if ( (j>=i)&&(i+j>=6) ){
//                    System.out.printf("[%d,%d]", i, j); //[%d,%d]", i, j
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//          1) + 2) 의 합집합
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if ( (j>=i)&&(i+j>=6) || ((i>=j)&&(i+j<=6)) ){
//                    System.out.printf("*"); //[%d,%d]", i, j
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }




    }
}
