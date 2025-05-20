package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
        new LightNovel("Overlord", 10.99, Category.FANTASY),
        new LightNovel("Violent Evergarden", 5.99, Category.DRAMA),
        new LightNovel("No Game no Life", 2.99, Category.FANTASY),
        new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
        new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
        new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
        new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        System.out.println(
            lightNovels.stream()
            .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()))
        );

        System.out.println("--------------");

        System.out.println(
            lightNovels.stream()
            .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))))
        );

        System.out.println("--------------");

        System.out.println(
            lightNovels.stream()
            .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)))
        );
    }
}
