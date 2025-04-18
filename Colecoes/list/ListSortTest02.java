package Colecoes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest02 {
    public static void main(String[] args) {
        List <Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("----------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
