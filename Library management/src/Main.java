public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark", 400.0),
            new Book(101, "Data Structures", "Mark", 400.0),
            new Book(102, "Java Basics", "James", 300.0),
            new Book(103, "Python Guide", "Guido", 600.0),
            new Book(104, "Database Systems", "Raghu", 500.0),
            new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        int count = books.length;
        count = RemoveDuplicates.removeDuplicates(books, count);
        System.out.println("Unique Books: " + count);

        System.out.println("\nTask 2:");
        String title = "data";
        for (int i = 0; i < count; i++) {
            if (books[i].Title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(books[i]);
            }
        }

        System.out.println("\nTask 3:");
        SortByPrice.sortByPrice(books, count);

        System.out.println("\nTask 4:");
        int index = SearchbyPrice.searchByPrice(books, count, 500.0);
        System.out.println("Book index: " + index);

        System.out.println("\nTask 5:");
        int result = MinBooksForTargetCost.minBooksForTargetCost(books, count, 1000.0);
        System.out.println("Minimum Books: " + result);
    }
}