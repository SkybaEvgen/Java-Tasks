import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCyclicTest {
    StringCyclic stringCyclic;

    @Before
    public void init(){
        stringCyclic = new StringCyclic();
    }

    @Test
    public void testCyclic_EmptyString(){
        String s1 = "";
        String s2 = "";
        assertTrue(stringCyclic.cyclic(s1, s2));
    }

    @Test
    public void testCyclic_Word(){
        String s1 = "String";
        String s2 = "ringSt";
        assertTrue(stringCyclic.cyclic(s1, s2));
    }

    @Test
    public void testCyclic_StringsOfDifferentLength_False(){
        String s1 = "String";
        String s2 = "ring";
        assertFalse(stringCyclic.cyclic(s1, s2));
    }

    @Test
    public void testCyclic_TwoWordsWithSpace(){
        String s1 = "String Integer";
        String s2 = "erString Integ";
        assertTrue(stringCyclic.cyclic(s1, s2));
    }
}
