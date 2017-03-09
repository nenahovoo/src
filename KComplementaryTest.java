package SoftGroupTest;

import java.util.Set;
import org.junit.Assert;
import org.junit.Test;


public class KComplementaryTest {
    public KComplementaryTest() {
    }

    @Test
    public void testComplementaryPairs() throws Exception {
        byte K = 10;
        int[] numbers = new int[]{1, 3, 7, 7, 8, 3, 2};
        Set pairs = KComplementary.complementaryPairs(K, numbers);
        Assert.assertNotNull(pairs);
        Assert.assertEquals((long)pairs.size(), 4L);
    }

    @Test
    public void testComplementaryPairsNullValue() throws Exception {
        Set pairs = KComplementary.complementaryPairs(0, (int[])null);
        Assert.assertNull(pairs);
    }
}
