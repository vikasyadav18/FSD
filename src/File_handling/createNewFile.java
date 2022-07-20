package FileHandling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createNewFile {
    public static void main(String[] args) {

        File myFile = new File("demoFile.java");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}