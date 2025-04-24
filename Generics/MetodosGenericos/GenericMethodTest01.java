package Generics.MetodosGenericos;

import java.util.List;

import Generics.ClassesGenericas.Barco;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Barco> barcos = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcos);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}
