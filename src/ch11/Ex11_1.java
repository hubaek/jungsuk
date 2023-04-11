package ch11;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();    // 교집합
        ArrayList cha = new ArrayList();    // 차집합
        ArrayList hap = new ArrayList();    // 합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);   // list1 = {1,2,3,4}

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);   // list2 = {3,4,5,6}

        // hint : ArrayList 클래스의 addAll(), removeAll(), retainAll()을 사용

        // kyo는 3,4  list1과 list2의 공통된 부분
        // retainAll()? kyo = list1.retainAll(list2);
        // iterator써야하고.. next, while 하나씩 불러와서 대입? it


//        kyo.addAll(list1);
//        kyo.retainAll(list2);
        Iterator it = list1.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if (list2.contains(tmp)){
                kyo.add(tmp);
            }
        }

//        cha.addAll(list1);
//        cha.removeAll(list2);
        it = list1.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if (!(list2.contains(tmp))) {
                cha.add(tmp);
            }
        }

//        hap.addAll(cha);
//        hap.addAll(list2);
        HashSet set1 = new HashSet(list1);
        HashSet set2 = new HashSet(list2);
        it = set1.iterator();
        while (it.hasNext()){
            set2.add(it.next());
        }
        hap.addAll(set2);

        // git test
        // git test


        System.out.println("list1 = " +list1);
        System.out.println("list2 = " +list2);
        System.out.println("kyo = " +kyo);
        System.out.println("cha = " +cha);
        System.out.println("hap = " +hap);
    }
}
