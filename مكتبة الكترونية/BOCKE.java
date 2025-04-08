
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available; 

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true; 
    }


    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public boolean isAvailable() { return available; }

    
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println( " قد تم استعارته.");
        } else {
            System.out.println(" غير متاح حاليًا.");
        }
    }


    public void returnBook() {
        available = true;
        System.out.println( " قد تم إرجاعه.");
    }

     
    public void displayInfo() {
        System.out.println("العنوان: " " المؤلف: " " ISBN: " " الحالة: " "متاح" : "مستعار");
    }
}


public class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String ISBN, String downloadLink) {
        super(title, author, ISBN); 
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() { return downloadLink; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("رابط التحميل ");
    }
}