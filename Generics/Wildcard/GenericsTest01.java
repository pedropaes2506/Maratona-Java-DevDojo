package Generics.Wildcard;

import java.util.ArrayList;
import java.util.List;

import Colecoes.map.Consumidor;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Naruto");
        lista.add("Goku");

        for (String string : lista) {
            System.out.println(string);
        }

        add(lista, new Consumidor("Eren"));

        for (String string : lista) {
            System.out.println(string);
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
