package blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void testBothOver21() {
        assertEquals(0, Main.play(22, 23));
    }

    @Test
    public void testFirstUnderSecondOver21() {
        assertEquals(18, Main.play(18, 22));
    }

    @Test
    public void testSecondUnderFirstOver21() {
        assertEquals(19, Main.play(25, 19));
    }

    @Test
    public void testFirstHigherUnder21() {
        assertEquals(20, Main.play(20, 19));
    }

    @Test
    public void testSecondHigherUnder21() {
        assertEquals(18, Main.play(15, 18));
    }

    @Test
    public void testBothEqualUnder21() {
        assertEquals(19, Main.play(19, 19));
    }
}
