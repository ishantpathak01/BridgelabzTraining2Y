class SearchbyPrice {

    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (books[mid].price == targetPrice)
                return mid;

            if (books[mid].price < targetPrice)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
