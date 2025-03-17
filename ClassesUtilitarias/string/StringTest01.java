package ClassesUtilitarias.string;

public class StringTest01 {
    public static void main(String[] args) {
        // String constant pool
        String nome = "Pedro"; 
        String nome2 = "Pedro";
        nome = nome.concat(" Paes");
        System.out.println(nome);
        System.out.println(nome == nome2);

        // Objeto do tipo String
        String nome3 = new String("Pedro");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
