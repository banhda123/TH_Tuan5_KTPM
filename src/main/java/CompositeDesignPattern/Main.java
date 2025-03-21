package CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Tạo các tập tin
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        // Tạo thư mục con
        Directory dir1 = new Directory("Documents");
        Directory dir2 = new Directory("Pictures");

        // Thêm tập tin vào thư mục
        dir1.addComponent(file1);
        dir2.addComponent(file2);

        // Tạo thư mục gốc
        Directory rootDir = new Directory("Root");
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Hiển thị cấu trúc thư mục
        rootDir.display();
    }
}

