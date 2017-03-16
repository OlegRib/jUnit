import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zazonga on 16.03.2017.
 */
public class Math2Test {
    @Test
    public void max() throws Exception {
    Math2 math = new Math2();
    assertEquals(5, math.max(1,4));
    }

}