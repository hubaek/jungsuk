package Mybector;

class MyVector  {
        int capacity;
        int size;       // 객체의 개수를 저장하기 위한 변수

//        ArrayList objArr = new ArrayList();
        Object[] objArr;

        MyVector(int capacity){
                this.capacity = capacity;
                objArr = new Object[capacity];
        }
        MyVector(){
                this(16);
        }
        int size(){
                return size;
        }
        int capacity(){
                // 배열의 길이
                return objArr.length;
        }
        boolean isEmpty(){
                // 배열(objArr)비었는지 확인한다.
                // 비었다는게 뭐지? 비었다는걸 어떻게 알지?
                // size가 없을때 비었다고 한다.
                return size==0;
        }
}

//public class MyVectorTest{
//        public static void main(String[] args) {
//                MyVector vector = new MyVector();
//        }
//}
