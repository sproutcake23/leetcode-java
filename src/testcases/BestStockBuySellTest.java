package testcases;

import org.junit.jupiter.api.Test;
import solutions.BestStockBuySell;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestStockBuySellTest {
    BestStockBuySell x = new BestStockBuySell();

    @Test
    void testSampleCases() {
        assertEquals(5, x.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, x.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void testEdgeCases() {
        assertEquals(239, x.maxProfit(new int[]{23, 4, 1, 0, 239, 0, 51, 9}));
        assertEquals(8, x.maxProfit(new int[]{1, 9}));
    }

}
