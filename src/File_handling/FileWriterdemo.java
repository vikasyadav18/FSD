package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterdemo {
    public static void main(String[] args) {

        File myFile = new File("demoFile.java");
        try {
            FileWriter fileWriter = new FileWriter("demoFile.java");
            fileWriter.write("public class createNewFile {\r\n"
            		+ "    public static void main(String[] args) {\r\n"
            		+ "}"+"}"+"");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}