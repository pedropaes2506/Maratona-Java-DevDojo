package ClassesUtilitarias.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("Pedro");
            bufferedWriter.newLine();
            bufferedWriter.write("Paes");
            bufferedWriter.flush();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
