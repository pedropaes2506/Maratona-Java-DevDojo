package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));

        //Collections.sort(animes, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animes, AnimeComparators::compareByTitle);
        Collections.sort(animes, AnimeComparators::compareByEpisodes);

        System.out.println(animes);
    }
}
