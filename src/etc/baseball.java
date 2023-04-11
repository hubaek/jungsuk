package etc;

public class baseball {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,3,2};

        int strike = 0;
        int ball = 0;

        for (int i=0; i<=2; i++){
            for (int j=0; j<=2; j++){
                if (a[i]==b[i]){
                    if (i==j){
                        strike++;
                    }else
                        ball++;
                }
            }
        }


        if (a[0]==b[0]) strike++;
        if (a[0]==b[1]) ball++;
        if (a[0]==b[2]) ball++;

        if (a[0]==b[0]) strike++;
        if (a[1]==b[1]) strike++;
        if (a[2]==b[2]) strike++;

        if (a[1]==b[0]) ball++;
        if (a[1]==b[1]) strike++;
        if (a[1]==b[2]) ball++;

        if (a[2]==b[0]) ball++;
        if (a[2]==b[1]) ball++;
        if (a[2]==b[2]) strike++;

    }
}
