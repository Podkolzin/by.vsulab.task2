package by.vsulab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextLoader {

    private String importTxt;

    public TextLoader(String readAllBytes) {
        this.importTxt = readAllBytesJava(readAllBytes);
    }

    public String getImportTxt() {
        return importTxt;
    }


    private static String readAllBytesJava(String filePath) {
        String contex = "";
        try {
            contex = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contex;
    }

}
