package ClassesUtilitarias.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/pedro");
        Path classPath = Paths.get("/home/pedro/dev/OlaMundo.java");
        Path pathToClass = dir.relativize(classPath);
        System.out.println(pathToClass);

        Path absoluto1 = Paths.get("/home/pedro");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/pedro/dev/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20250408");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("5 " + absoluto1.relativize(relativo1));
    }
}
