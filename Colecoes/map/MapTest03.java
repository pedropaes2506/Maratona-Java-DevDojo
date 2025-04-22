package Colecoes.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Colecoes.list.Manga;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Naruto");
        Consumidor consumidor2 = new Consumidor("Goku");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        List<Manga> consumidor1MangaList = List.of(manga1, manga2, manga3);
        List<Manga> consumidor2MangaList = List.of(manga3, manga4, manga5);
        
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, consumidor1MangaList);
        consumidorMangaMap.put(consumidor2, consumidor2MangaList);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.print(entry.getKey().getNome() + " comprou ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNome() + " ");
            }
            System.out.println();
        }
    }
}
