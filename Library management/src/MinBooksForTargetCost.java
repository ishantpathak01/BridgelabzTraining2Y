class MinBooksForTargetCost {

    public static int minBooksForTargetCost(
            Book[] books, int count, double targetCost) {

        double currentSum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {
            currentSum += books[right].price;

            while (currentSum >= targetCost) {
                int length = right - left + 1;

                if (length < minLength)
                    minLength = length;

                currentSum -= books[left].price;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
