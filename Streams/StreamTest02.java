package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Tensei Shittara", 8.99),
        new LightNovel("Overlord", 3.99),
        new LightNovel("Violent Evergarden", 5.99),
        new LightNovel("No Game no Life", 2.99),
        new LightNovel("Fullmetal Alchemist", 5.99),
        new LightNovel("Kumo Desuga", 1.99),
        new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
        .sorted(Comparator.comparing(LightNovel::getTitle))
        .filter(ln -> ln.getPrice() <= 4)
        .limit(3)
        .map(LightNovel::getTitle)
        .collect(Collectors.toList());

        System.out.println(titles);
    }
}
