package Singleton;


public class Test {
    public static void main(String[] args) {
        // Lấy thể hiện của Library thông qua Singleton
        Library library = Library.getInstance();

        // Tạo một số sách
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Thêm sách vào thư viện
        library.addBook(book1);
        library.addBook(book2);

        // Hiển thị danh sách sách có sẵn
        System.out.println("Available books in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Mượn một sách
        library.borrowBook(book1);

        // Hiển thị lại danh sách sách có sẵn sau khi mượn
        System.out.println("\nAvailable books after borrowing:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Trả sách lại thư viện
        library.returnBook(book1);

        // Hiển thị lại danh sách sách có sẵn sau khi trả
        System.out.println("\nAvailable books after returning:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
