import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void HarshadTest_expectFalse(){
        assertFalse(Main.isHarshad(75));
        assertFalse(Main.isHarshad(89));
        assertFalse(Main.isHarshad(51));
    }
    @Test
    public void HarshadTest_expectTrue(){
        assertTrue(Main.isHarshad(171));
        assertTrue(Main.isHarshad(481));
        assertTrue(Main.isHarshad(516));
        assertTrue(Main.isHarshad(200));
    }
}
