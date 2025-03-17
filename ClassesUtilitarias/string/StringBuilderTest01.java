package ClassesUtilitarias.string;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // imutável
        String nome = "Pedro";
        nome.concat(" Paes");
        nome.substring(0, 3);
        System.out.println(nome);

        // mutável
        StringBuilder sb = new StringBuilder("Pedro");
        sb.append(" Paes");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
