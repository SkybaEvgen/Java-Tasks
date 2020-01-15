import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckingBracketTest {
    private CheckingBracket checkBracket;

    @Before
    public void init() {
        checkBracket = new CheckingBracket();
    }

    @Test
    public void testCorrectBracket1() {
        String textString = "( ) { [ ( ) ] { } }";
        assertEquals(-1, checkBracket.correctBracket(textString));
    }

    @Test
    public void testCorrectBracket2() {
        String textString = "( ) { [ ( ) ] { ] } }";
        assertEquals(16, checkBracket.correctBracket(textString));
    }

    @Test
    public void testCorrectBracket3() {
        String textString = "( ) [] {]";
        assertEquals(8, checkBracket.correctBracket(textString));
    }

    @Test
    public void testCorrectBracket4() {
        String textString = "(]";
        assertEquals(1, checkBracket.correctBracket(textString));
    }
}
