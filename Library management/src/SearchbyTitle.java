public class SearchbyTitle {

    public static void searchByTitle(Book[] books, int count, String query) {
        query = query.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (books[i].Title.toLowerCase().contains(query)) {
                System.out.println("Found: [" + books[i].bookId + "] "
                        + books[i].Title + " (Rs. " + books[i].price + ")");
            }
        }
    }
}
