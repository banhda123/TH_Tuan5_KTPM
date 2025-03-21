package Singleton;

import java.util.ArrayList;
import java.util.List;

// Lớp Library sẽ sử dụng Singleton Pattern
public class Library {
    // Biến static để lưu trữ thể hiện duy nhất của Library
    private static Library instance;

    // Danh sách sách trong thư viện
    private List<Book> books;

    // Constructor private để ngăn việc tạo đối tượng ngoài lớp này
    private Library() {
        books = new ArrayList<>();
    }

    // Phương thức static để lấy thể hiện duy nhất của Library
    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Phương thức để thêm sách vào thư viện
    public void addBook(Book book) {
        books.add(book);
    }

    // Phương thức để xem danh sách sách có sẵn trong thư viện
    public List<Book> getBooks() {
        return books;
    }

    // Phương thức để mượn sách
    public boolean borrowBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book borrowed: " + book.getTitle());
            return true;
        }
        System.out.println("Book is not available.");
        return false;
    }

    // Phương thức để trả sách
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }
}

