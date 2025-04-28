package ClassesInternas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Generics.ClassesGenericas.Barco;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcos);
    }
}
