package Colecoes.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("C", "Letra C");
        map.put("A", "Letra A");
        map.put("E", "Letra E");
        map.put("D", "Letra D");
        map.put("B", "Letra B");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
    }
}
