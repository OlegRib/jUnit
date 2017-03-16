import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Zazonga on 16.03.2017.
 */
public class Math2Test {
    @Test
    public void max() throws Exception {
    Math2 math = new Math2();
    assertEquals(5, math.max(1,5));
    }
    @Test
    public void min() {
        assertTrue(3 > Math.min(1,2));
    }
}