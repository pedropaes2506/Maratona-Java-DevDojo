package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
        .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        System.out.println("-----------------");

        Map<Category, Map<Promotion, List<LightNovel>>> collect2 = lightNovels.stream()
        .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect2);
    }
}
