package testcases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import solutions.TwoSum;

public class TwoSumTest {
    TwoSum sol = new TwoSum();

    @Test
    void testSampleCases() {
        assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, sol.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void testEdgeCases() {
        assertArrayEquals(new int[]{-1, -1}, sol.twoSum(new int[]{7, 2, 4, 5}, 99));
        assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{-9, -1, -8, 23, 5, 2}, -10));
    }
}