package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Tensei Shittara", 8.99),
        new LightNovel("Overlord", 3.99),
        new LightNovel("Violent Evergarden", 5.99),
        new LightNovel("No Game no Life", 2.99),
        new LightNovel("Fullmetal Alchemist", 5.99),
        new LightNovel("Kumo Desuga", 1.99),
        new LightNovel("Kumo Desuga", 1.99),
        new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(
            lightNovels.stream()
            .anyMatch(ln -> ln.getPrice() > 9)
        );
        System.out.println(
            lightNovels.stream()
            .allMatch(ln -> ln.getPrice() > 0)
        );
        System.out.println(
            lightNovels.stream()
            .noneMatch(ln -> ln.getPrice() < 0)
        );

        lightNovels.stream()
        .filter(ln -> ln.getPrice() > 3)
        .findAny()
        .ifPresent(System.out::println);

        lightNovels.stream()
        .filter(ln -> ln.getPrice() > 3)
        .sorted(Comparator.comparing(LightNovel::getTitle))
        .findFirst()
        .ifPresent(System.out::println);
    }
}
