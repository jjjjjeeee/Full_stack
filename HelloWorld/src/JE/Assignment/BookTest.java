package JE.Assignment;

public class BookTest {
    public static void main(String[] args) {
        
        Book b1 = new Book("B001","자바 프로그래밍","홍길동",25000,2021,"멀티출판사");
        Book b2 = new Book("B002","자바 스크립트","이몽룡",30000,2020,"서울출판사");
        Book b3 = new Book("B003","HTML/CSS","성춘향",18000,2021,"강남출판사");
    }
}

class Book{
    public Book(String string, String string2, String string3, int i, int j, String string4) {
    }
    String bookNo;
    String bookTitle;
    String bookAuthor;
    int bookYear;
    int bookPrice;
    String bookPublisher;

    public Book(){};

    public Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher);{
        super();
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    public String toString(){
        return bookNo+bookTitle+bookAuthor+bookYear+bookPrice+bookPublisher;
    }
}

class Magazine extends Book{
    int month;

    public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, int month) {
        super(bookNo,bookTitle,bookAuthor,bookYear,bookPrice,bookPublisher);
        this.month = month;
    }

}