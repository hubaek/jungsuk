package etc;

import member.AddNumber;

public class Main {
    public static void main(String[] args) {
        AddNumber addnumber = new AddNumber();

        System.out.println(addnumber.add(2,6));
        System.out.println(addnumber.add(2,3,4));

    }
}