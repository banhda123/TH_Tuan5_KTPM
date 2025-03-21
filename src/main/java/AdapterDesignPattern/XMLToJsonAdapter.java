package AdapterDesignPattern;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class XMLToJsonAdapter implements JsonDataSystemNew {
    private XMLDataSystemOld xmlSystemOld;

    public XMLToJsonAdapter(XMLDataSystemOld xmlSystemOld) {
        this.xmlSystemOld = xmlSystemOld;
    }

    @Override
    public String getJsonData() throws IOException {
        String xmlString = xmlSystemOld.getXMLData();

        // Chuyển đổi XML sang Data object
        XmlMapper xmlMapper = new XmlMapper();
        Data dataInstance = xmlMapper.readValue(xmlString.getBytes(), Data.class);

        // Chuyển đổi Data object sang JSON bằng ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();  // Sử dụng ObjectMapper thay vì JsonMapper
        return objectMapper.writeValueAsString(dataInstance);
    }
}
