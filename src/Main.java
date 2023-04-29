import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {

        FileUtils.createFile("file1.txt");

        FileUtils.writeInFile("File data", "file1.txt");

        FileUtils.readFromFile("file1.txt");

        FileUtils.removeFile("file1.txt");



    }
}