class RemoveDuplicates {

    public static int removeDuplicates(Book[] books, int n) {
        if (n == 0)
            return 0;

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[j].bookId) {
                j++;
                books[j] = books[i];
            }
        }

        return j + 1;
    }
}