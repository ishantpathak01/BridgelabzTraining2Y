class SortByPrice {

    public static void sortByPrice(Book[] books, int count) {
        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[minIndex].price) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;
                swaps++;
            }
        }

        System.out.println("Total Swaps: " + swaps);
    }
}
