import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("عذرًا، الكتاب غير متاح.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("لا يمكنك إرجاع كتاب لم تقم باستعارته.");
        }
    }

    public void showBorrowedBooks() {
        System.out.println("الكتب المستعارة من قبل " + name + ":");
        for (Book book : borrowedBooks) {
            book.displayInfo();
        }
    }
}

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Data Structures", "Jane Smith", "67890");
        EBook ebook1 = new EBook("Machine Learning", "AI Expert", "11111", "www.mlbook.com/download");

        
        Borrower user = new Borrower("أحمد");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- نظام المكتبة ---");
            System.out.println("1. عرض الكتب المتاحة");
            System.out.println("2. استعارة كتاب");
            System.out.println("3. إرجاع كتاب");
            System.out.println("4. عرض الكتب المستعارة");
            System.out.println("5. خروج");
            System.out.print("اختر خيارًا: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book1.displayInfo();
                    book2.displayInfo();
                    ebook1.displayInfo();
                    break;
                case 2:
                    System.out.println("اختر الكتاب لاستعارته (1: Java, 2: Data Structures, 3: ML eBook): ");
                    int borrowChoice = scanner.nextInt();
                    if (borrowChoice == 1) user.borrowBook(book1);
                    else if (borrowChoice == 2) user.borrowBook(book2);
                    else if (borrowChoice == 3) user.borrowBook(ebook1);
                    else System.out.println("خيار غير صحيح.");
                    break;
                case 3:
                    System.out.println("اختر الكتاب لإرجاعه (1: Java, 2: Data Structures, 3: ML eBook): ");
                    int returnChoice = scanner.nextInt();
                    if (returnChoice == 1) user.returnBook(book1);
                    else if (returnChoice == 2) user.returnBook(book2);
                    else if (returnChoice == 3) user.returnBook(ebook1);
                    else System.out.println("خيار غير صحيح.");
                    break;
                case 4:
                    user.showBorrowedBooks();
                    break;
                case 5:
                    System.out.println("شكرًا لاستخدام نظام المكتبة.");
                    break;
                default:
                    System.out.println("خيار غير صحيح.");
            }
        } while (choice != 5);

        scanner.close();
    }
}import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Data Structures", "Jane Smith", "67890");
        EBook ebook1 = new EBook("Machine Learning", "AI Expert", "11111", "www.mlbook.com/download");

        
        Borrower user = new Borrower("أحمد");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- نظام المكتبة ---");
            System.out.println("1. عرض الكتب المتاحة");
            System.out.println("2. استعارة كتاب");
            System.out.println("3. إرجاع كتاب");
            System.out.println("4. عرض الكتب المستعارة");
            System.out.println("5. خروج");
            System.out.print("اختر خيارًا: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book1.displayInfo();
                    book2.displayInfo();
                    ebook1.displayInfo();
                    break;
                case 2:
                    System.out.println("اختر الكتاب لاستعارته (1: Java, 2: Data Structures, 3: ML eBook): ");
                    int borrowChoice = scanner.nextInt();
                    if (borrowChoice == 1) user.borrowBook(book1);
                    else if (borrowChoice == 2) user.borrowBook(book2);
                    else if (borrowChoice == 3) user.borrowBook(ebook1);
                    else System.out.println("خيار غير صحيح.");
                    break;
                case 3:
                    System.out.println("اختر الكتاب لإرجاعه (1: Java, 2: Data Structures, 3: ML eBook): ");
                    int returnChoice = scanner.nextInt();
                    if (returnChoice == 1) user.returnBook(book1);
                    else if (returnChoice == 2) user.returnBook(book2);
                    else if (returnChoice == 3) user.returnBook(ebook1);
                    else System.out.println("خيار غير صحيح.");
                    break;
                case 4:
                    user.showBorrowedBooks();
                    break;
                case 5:
                    System.out.println("شكرًا لاستخدام نظام المكتبة.");
                    break;
                default:
                    System.out.println("خيار غير صحيح.");
            }
        } while (choice != 5);

        scanner.close();
    }
}