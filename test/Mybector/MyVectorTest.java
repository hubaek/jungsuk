package Mybector;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyVectorTest {
    @Test
    public void constructorTest() {
        MyVector v = new MyVector(10);
        assertTrue(v.capacity==10);

        v = new MyVector();
        assertTrue(v.capacity==16);

    }
    @Test
    public void isEmptyTest(){
//        MyVector v2 = new MyVector();
        Vector v2 = new Vector();
        assertTrue(v2.isEmpty() == true);
        v2.add(1);
        assertTrue(v2.isEmpty() == false);
        v2.remove(new Integer(1));
        assertTrue(v2.isEmpty() == true);

    }
    @Test
    public void addTest(){
        Vector v = new Vector(); // 1번 조건이 주어졌을때
        v.add(1); // 2번 작업을 하고
        assertTrue(v.size()==1); // 3번 확인한다.
        assertTrue(v.isEmpty()==false);
        v.add(2);
        assertTrue(v.size()==2); // v = 1,2
        v.add(3);
        v.add(4);
        assertTrue(v.size()==4); // v = 1,2,3,4

        Vector v2 = new Vector();
        v2.add(1);
        v2.add(2);
        assertTrue(v2.size()==2); // v2 = 1,2
        v2.set(1,v);    // v2의 인덱스[1]를 v로 변경한다.. 객체 v(1,2,3,4)를 넣고 싶으면 어떻게 해야하지?
                        // addAll(index, collection) 지정된 위치부터 주어진 컬렉션의 모든 객체를 저장한다.
        assertTrue(v2.contains(v)==true); // v2 = 1,v
        assertTrue(v2.size()==2);
        v2.addAll(1,v);            // addAll(index, collection) 지정된 위치[1]부터([2]) 주어진 컬렉션의 모든 객체를 저장한다.
        assertTrue(v2.contains(v)==true); // v가 여전히 포함이니 인덱스[1]이 바뀐건 아닌 것 같다.
        assertTrue(v2.contains(2)==true); // 2가 포함된걸로 봐서는 v의 객체가 들어온 것 같다
        assertTrue(v2.contains(4)==true); // 4까지 포함됨 그러면 v2 = 1,v,1,2,3,4인것인가?
        assertTrue(v2.size()==6); // v2 = 1,v,1,2,3,4
        assertTrue((int)v2.get(0)==1); // get(index)는 숫자 1을 받는게 아닌 객체배열 인덱스[0]= 객체 1이라서 형변환 필요

//        assertTrue(v2.get(0)); // 인덱스[0]에 저장된 객체 반환은 어떻게 하는건가?

//        Vector v3 = new Vector();
//        v3.add(1,v2); // v2의 인덱스[1]을 v3에 넣어준다


//        assertTrue(v2.get(1)==v); // 인덱스[1]에 저장된 객체 반환은 어떻게 하는건가?
//        assertTrue(v2.size()==1); // v2의 size는 무엇일까? 1,v로 생각했음



    }
    @Test
    public void removeTest(){
        Vector v = new Vector(); // 1번 조건이 주어졌을때,
        v.add(1);// 2번 작업을 하고
        v.add(2);// 2번 작업을 하고
        v.add(3);// 2번 작업을 하고
        v.add(4);// 2번 작업을 하고
        v.add(5);// 2번 작업을 하고 1,2,3,4,5
        assertTrue(v.size()==5);
        v.remove(new Integer(3)); // 1,2,4,5
        assertTrue(v.size()==4);
        assertTrue(v.contains(3)==false); // 객체배열에 3이 포함되어있는지 확인한다.
        assertTrue(v.contains(4)==true); // 객체배열에 3이 포함되어있는지 확인한다.
        v.removeAll(v); // removeall
        assertTrue(v.size()==0);
        assertTrue(v.isEmpty()==true);
        // 3번 작업이 맞는지확인한다.
    }
    @Test
    public void retainTest(){
        Vector v = new Vector();    // 1번 조건이 주어졌을때,
        Vector v2 = new Vector();   // 1번 조건이 주어졌을때,
        v.add(1);   // 2번 작업을 하고
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);           // v[] = {1,2,3,4,5,6}
        v2.add(1);   // 2번 작업을 하고
        v2.add(2);
        v2.add(3);
        v2.add(4);
        v2.add("a");
        v2.add("b");
        v2.add("c");        // v2[] = {1,2,3,4,"a","b","c"}
        v.retainAll(v2);    // v2와 겹치는 것을 제외하고 다 제거한다.
                            // v = {1,2,3,4} , v2 = {1,2,3,4,"a","b","c"}
        assertTrue(v.size()==4);
        assertTrue(v.contains(5)==false);
        assertTrue(v2.size()==7);
        v.removeAll(v2); // v2와 겹치는 것을 제거한다.
        assertTrue(v.size()==0);
        assertTrue(v.isEmpty()==true);
        assertTrue(v2.isEmpty()==false);
        v.remove(v);
        assertTrue(v.size()==0);
        v.add(1);
        assertTrue(v.size()==1);    // v = {1}
        v.addAll(v2); // 기존에 있던 v의 객체 + v2의 객체를 다 저장한다.
//        assertTrue(v.size()==8);    // v = {1,1,2,3,4,"a","b","c"}
        assertTrue(v2.size()==7);   //v2 = {1,2,3,4,"a","b","c"}

    }

}