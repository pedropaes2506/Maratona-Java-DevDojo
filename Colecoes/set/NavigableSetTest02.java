package Colecoes.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import Colecoes.list.Manga;

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

}

public class NavigableSetTest02 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L,"Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 3.2, 5);
        System.out.println("===================");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
    }
}
