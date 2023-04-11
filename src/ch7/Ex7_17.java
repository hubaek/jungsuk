package ch7;

public class Ex7_17 {
    public static void main(String[] args) {

    }
}

abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop(){};
}

class Marine{
    void move(int x, int y){}
    void stimPack(){}
}
class Tank{
    void move(int x, int y){}
    void changeMode(){}
}
class Dropship{
    void move(int x, int y){}
    void load(){}
    void unload(){}
}