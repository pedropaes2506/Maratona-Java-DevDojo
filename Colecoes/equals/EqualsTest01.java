package Colecoes.equals;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Apple");
        Smartphone s2 = new Smartphone("1ABC1", "Apple");
        System.out.println(s1.equals(s2));
    }
}
