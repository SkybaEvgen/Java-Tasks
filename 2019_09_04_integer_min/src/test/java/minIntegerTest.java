import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class minIntegerTest {
    Min_Int minTenDegree;

    @Before
    public void init(){
        minTenDegree = new Min_Int();
    }

    @Test
    public void testGetTenDegree_inputOne_output0(){
        assertEquals(0, minTenDegree.getTenDegre(1));
    }

    @Test
    public void testGetTenDegree_input9_output0(){
        assertEquals(0, minTenDegree.getTenDegre(9));
    }

    @Test
    public void testGetTenDegree_inputLastNumber_outputLastNumber(){
        assertEquals(1_000_000_000, minTenDegree.getTenDegre(1_000_000_000));
    }

    @Test
    public void testGetTenDegree_input53799_output10000(){
        assertEquals(10000, minTenDegree.getTenDegre(53799));
    }

    @Test
    public void testGetTenDegree_input100000_output100000(){
        assertEquals(100000, minTenDegree.getTenDegre(100000));
    }
}
