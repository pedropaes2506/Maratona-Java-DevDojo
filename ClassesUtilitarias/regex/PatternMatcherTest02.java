package ClassesUtilitarias.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \\d = Todos os dígitos
        // \\D = Tudo o que não for dígito
        // \\s \\t \\n \\f \\r = Espaços em branco
        // \\S = Tudo o que não for espaços em branco
        // \\w = a-z, A-Z, dígitos, _
        // \\W = Tudo o que não for incluso no \\w

        String regex = "\\w";
        //String texto = "abaaba";
        String texto2 = "h1@i2 4n31_ o";
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
