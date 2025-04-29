package Comportamento;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedBehaviorTest01 {
    private static List<Car> cars = List.of(
        new Car("Green", 2011), 
        new Car("Black", 1998), 
        new Car("Red", 2019)
    );

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println("==========");
        System.out.println(filterRedCar(cars));
        System.out.println("==========");
        System.out.println(filterCarByColor(cars, "Black"));
        System.out.println("==========");
        System.out.println(filterCarByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() == "Green") {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() == "Red") {
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() == color) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
