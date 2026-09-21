public class Book{
    int bookId;
    String Title;
    String Author;
    double price;
public Book(int bookId ,String Title ,String Author,double price) {
    this.bookId=bookId;
    this.Title=Title;
    this.Author=Author;
    this.price=price;
}

public String getAuthor() {
    return Author;
}
}