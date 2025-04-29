package Comportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParameterizedBehaviorTest03 {
    private static List<Car> cars = List.of(
        new Car("Green", 2011), 
        new Car("Black", 1998), 
        new Car("Red", 2019)
    );

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> oldCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(oldCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
