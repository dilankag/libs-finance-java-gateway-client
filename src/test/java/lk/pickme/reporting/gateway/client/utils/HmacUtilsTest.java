package lk.pickme.reporting.gateway.client.utils;

import lk.pickme.gateway.client.utils.HmacUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Dilanka Gamage
 */

public class HmacUtilsTest {
    
    /**
     * Test of generateHmac method, of class HmacUtils.
     */
    @Test
    public void testGenerateMac() throws Exception {
        String result = HmacUtils.generateHmac("key", "The quick brown fox jumps over the lazy dog");
        assertEquals("f7bc83f430538424b13298e6aa6fb143ef4d59a14946175997479dbc2d1a3cd8", result);
    }

}
