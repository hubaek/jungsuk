package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);    // list = {3,6,2,2,2,7}

        System.out.println(list);
        HashSet set = new HashSet(list);    // set = 순서x, 중복x // {3,6,2,7}
//        System.out.println(set);
        TreeSet tset = new TreeSet(set);    // HashSet하고 TreeSet적어주는 이유?
//        System.out.println(tset);
        Stack stack = new Stack();
        stack.addAll(tset);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
