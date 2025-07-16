
class TwoSmallest {

    public static void main(String[] args) {
        assert sumTwoSmallestNumbers(new long[]{1, 2, 3, 4, 5}) == 3;
        assert sumTwoSmallestNumbers(new long[]{5, 6, 2, 1, 4}) == 3;
        assert sumTwoSmallestNumbers(new long[]{7, 15, 12, 10, 6}) == 16;
    }

    // TODO: What if the array is null?
    // TODO: What if there aren't enough numbers in the array?

    public static long sumTwoSmallestNumbers(long[] numbers) {
        long smallest = -1;
        long nextSmallest = -1;
        for (long n : numbers) {
            if (n < smallest || smallest == -1) {
                nextSmallest = smallest;
                smallest = n;
            } else if (n < nextSmallest || nextSmallest == -1) {
                nextSmallest = n;
            }
        }
        return smallest + nextSmallest;
    }
}
