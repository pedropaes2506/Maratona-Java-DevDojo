package Colecoes.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(16);
        List<Integer> numeros2 = new ArrayList<>(16);
        numeros.add(1);
        numeros.add(2);
        numeros2.add(3);
        numeros2.add(4);

        numeros.addAll(numeros2);

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("--------------");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}
