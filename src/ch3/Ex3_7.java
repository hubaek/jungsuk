package ch3;

public class Ex3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5f)/100.0f;  //  (int)(5f/9*(fahrenheit-32)*100+0.5)/100.0f

        System.out.println("Fahrenheit : "+fahrenheit);
        System.out.println("Celcius : "+celcius);

    }
}
