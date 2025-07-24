class TwoSmallest {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must not be null and contain at least 2 numbers");
        }
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for (long num : numbers) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return min1 + min2;
    }
}
