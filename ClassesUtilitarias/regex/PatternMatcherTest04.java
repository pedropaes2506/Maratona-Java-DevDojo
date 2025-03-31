package ClassesUtilitarias.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \\d = Todos os dígitos
        // \\D = Tudo o que não for dígito
        // \\s \\t \\n \\f \\r = Espaços em branco
        // \\S = Tudo o que não for espaços em branco
        // \\w = a-z, A-Z, dígitos, _
        // \\W = Tudo o que não for incluso no \\w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até M
        // ()
        // |
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
