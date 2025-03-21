package AdapterDesignPattern;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // Tạo hệ thống cũ (XML)
        XMLDataSystemOld xmlSystemOld = new XMLDataSystemOldImpl();

        // Tạo Adapter chuyển đổi XML sang JSON
        XMLToJsonAdapter xmlToJsonAdapter = new XMLToJsonAdapter(xmlSystemOld);

        // Lấy dữ liệu JSON
        String jsonData = xmlToJsonAdapter.getJsonData();
        System.out.println("JSON: " + jsonData);
    }
}

