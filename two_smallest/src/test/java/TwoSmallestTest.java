import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class TwoSmallestTest {

    @Test
    @DisplayName("Should return sum of two smallest numbers in normal array")
    void testSumTwoSmallestNumbers_NormalArray() {
        assertEquals(3, TwoSmallest.sumTwoSmallestNumbers(new long[] { 1, 2, 3, 4, 5 }));
        assertEquals(3, TwoSmallest.sumTwoSmallestNumbers(new long[] { 5, 6, 2, 1, 4 }));
        assertEquals(16, TwoSmallest.sumTwoSmallestNumbers(new long[] { 7, 15, 12, 10, 6 }));
    }

    @Test
    @DisplayName("Should handle array with exactly 2 numbers")
    void testSumTwoSmallestNumbers_ExactlyTwoNumbers() {
        assertEquals(3, TwoSmallest.sumTwoSmallestNumbers(new long[] { 1, 2 }));
        assertEquals(0, TwoSmallest.sumTwoSmallestNumbers(new long[] { 0, 0 }));
        assertEquals(-3, TwoSmallest.sumTwoSmallestNumbers(new long[] { -1, -2 }));
    }

    @Test
    @DisplayName("Should handle array with duplicate smallest numbers")
    void testSumTwoSmallestNumbers_DuplicateSmallest() {
        assertEquals(2, TwoSmallest.sumTwoSmallestNumbers(new long[] { 1, 1, 3, 4, 5 }));
        assertEquals(0, TwoSmallest.sumTwoSmallestNumbers(new long[] { 0, 0, 0, 1, 2 }));
        assertEquals(-4, TwoSmallest.sumTwoSmallestNumbers(new long[] { -2, -2, 1, 3, 5 }));
    }

    @Test
    @DisplayName("Should handle array with negative numbers")
    void testSumTwoSmallestNumbers_NegativeNumbers() {
        assertEquals(-5, TwoSmallest.sumTwoSmallestNumbers(new long[] { -1, -4, 2, 3, 5 }));
        assertEquals(-10, TwoSmallest.sumTwoSmallestNumbers(new long[] { -5, -5, 0, 1, 2 }));
        assertEquals(-3, TwoSmallest.sumTwoSmallestNumbers(new long[] { -1, -2, -3, -4, -5 }));
    }

    @Test
    @DisplayName("Should handle array with large numbers")
    void testSumTwoSmallestNumbers_LargeNumbers() {
        assertEquals(2000000000, TwoSmallest.sumTwoSmallestNumbers(new long[] { 1000000000, 1000000000, 2000000000, 3000000000L }));
        assertEquals(0, TwoSmallest.sumTwoSmallestNumbers(new long[] { Long.MAX_VALUE, Long.MAX_VALUE, 0, 1 }));
    }

    @Test
    @DisplayName("Should throw exception for null array")
    void testSumTwoSmallestNumbers_NullArray() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            TwoSmallest.sumTwoSmallestNumbers(null);
        });
        assertEquals("Array cannot be null", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception for empty array")
    void testSumTwoSmallestNumbers_EmptyArray() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            TwoSmallest.sumTwoSmallestNumbers(new long[] {});
        });
        assertEquals("Array must contain at least 2 numbers", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception for array with single element")
    void testSumTwoSmallestNumbers_SingleElement() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            TwoSmallest.sumTwoSmallestNumbers(new long[] { 1 });
        });
        assertEquals("Array must contain at least 2 numbers", exception.getMessage());
    }

    @Test
    @DisplayName("Should handle edge cases with minimum values")
    void testSumTwoSmallestNumbers_EdgeCases() {
        assertEquals(Long.MIN_VALUE * 2, TwoSmallest.sumTwoSmallestNumbers(new long[] { Long.MIN_VALUE, Long.MIN_VALUE }));
        assertEquals(Long.MIN_VALUE + 1, TwoSmallest.sumTwoSmallestNumbers(new long[] { Long.MIN_VALUE, 1, Long.MAX_VALUE }));
    }
} 