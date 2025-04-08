package ClassesUtilitarias.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/pedro/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("/home/./pedro/./dev/");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
