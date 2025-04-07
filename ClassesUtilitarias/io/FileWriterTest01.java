package ClassesUtilitarias.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write("Pedro Paes Rocha");
            fileWriter.flush();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
