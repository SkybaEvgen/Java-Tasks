import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CensorTest {
    private Censor censorIsLegal;

    String [] vocab = {"qqq", "xxx", "zzz"};

    @Before
    public void init() {
        censorIsLegal = new Censor(vocab);
    }

    @Test
    public void testCensor1() {
        assertFalse(censorIsLegal.isLegal("aaa rrr qqq kkk"));
    }

    @Test
    public void testCensor2() {
        assertTrue(censorIsLegal.isLegal("aaa rrr kkk"));
    }

    @Test
    public void testCensor3() {
        assertFalse(censorIsLegal.isLegal("Lorem Ipsum is simply dummy text of zzz the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));
    }

    @Test
    public void testCensor4() {
        assertTrue(censorIsLegal.isLegal("qq qqqq xx zzzz z"));
    }

    @Test
    public void testCensor5() {
        assertFalse(censorIsLegal.isLegal("xxx"));
    }
}
