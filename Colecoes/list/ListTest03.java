package Colecoes.list;

import java.util.ArrayList;
import java.util.List;

import Colecoes.equals.Smartphone;

public class ListTest03 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("111", "Iphone");
        Smartphone s2 = new Smartphone("222", "Pixel");
        Smartphone s3 = new Smartphone("333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("222", "Pixel");
        System.out.println(s4.equals(s2));
        System.out.println(smartphones.contains(s2));

        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
