import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MidTest {
    int mid(int x, int y, int z){
        if ((x<=y && y<=z) || (z<= y && y <= x)) return y;
        if ((y<=x && x<=z) || (z<= x && x <= y)) return x;
        return z;
    }

    @Test
    public void midTest(){
       assertTrue(mid(1,2,3)==2);
    }
    @Test
    public void midTest2() {
        assertTrue(mid(3, 1, 2) == 2);
    }
    @Test
    public void midTest3() {
        assertTrue(mid(1, 1, 1) == 1);
    }
    @Test
    public void midTest4() {
        assertTrue(mid(2, 1, 1) == 1);
    }
    @Test
    public void midTest5() {
        assertTrue(mid(3, 1, 2) == 2);
    }

}