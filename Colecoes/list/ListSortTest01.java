package Colecoes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List <String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
