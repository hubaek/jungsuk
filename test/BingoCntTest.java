import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BingoCntTest {
    // 2차원 배열을 받아서 빙고 개수를 세어서 반환
    // 입력 : 2차원 Int배열
    // 출력 : 빙고의 개수 int
    // 메서드이름 : bingoCnt

    int bingoCnt(int[][] arr){
        int cnt = 0;
        int garoCnt = 0;    // 가로 카운트를 위한 변수
        int seroCnt = 0;    // 세로 카운트를 위한 변수
        int crossCnt = 0;   // 대각선 카운트를 위한 변수
        int crossCnt2 = 0;  // 역대각선 카운트를 위한 변수

        garoCnt = 0;
        garoCnt += arr[0][0];
        garoCnt += arr[0][1];
        garoCnt += arr[0][2];
        garoCnt += arr[0][3];
        garoCnt += arr[0][4];

        garoCnt = 0;
        garoCnt += arr[1][0];
        garoCnt += arr[1][1];
        garoCnt += arr[1][2];
        garoCnt += arr[1][3];
        garoCnt += arr[1][4];




        // 1. 가로 줄을 샌다.
        for (int i=0; i<arr.length; i++){
            garoCnt = 0;
            seroCnt = 0;

            for (int j=0; j<arr[i].length; j++) {
                garoCnt += arr[i][j];
                seroCnt += arr[j][i];
            }
            crossCnt += arr[i][i];
            crossCnt2 +=arr[i][4-i];

            if(seroCnt==5) cnt++;
            if(garoCnt==5) cnt++;


        }


        // 2. 세로 줄을 샌다

        seroCnt = 0;
        garoCnt += arr[0][0];
        garoCnt += arr[1][0];
        garoCnt += arr[2][0];
        garoCnt += arr[3][0];
        garoCnt += arr[4][0];



        // 3. 대각선/역대각선을 센다.
        garoCnt += arr[0][0];
        garoCnt += arr[1][1];
        garoCnt += arr[2][2];
        garoCnt += arr[3][3];
        garoCnt += arr[4][4];

        crossCnt2 += arr[1][3];
        crossCnt2 += arr[2][2];
        crossCnt2 += arr[3][1];
        crossCnt2 += arr[4][0];


        return cnt;
    }

    @Test
    public void garotest(){
        int[][] arr={
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCnt(arr)==1);
    }

}