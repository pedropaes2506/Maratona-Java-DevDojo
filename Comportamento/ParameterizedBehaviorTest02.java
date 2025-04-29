package Comportamento;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedBehaviorTest02 {
    private static List<Car> cars = List.of(
        new Car("Green", 2011), 
        new Car("Black", 1998), 
        new Car("Red", 2019)
    );

    public static void main(String[] args) {
        /* 
        List<Car> greenCars = filterCar(cars, new CarPredicate() {

            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
            
        });
        */

        List<Car> greenCars = filterCar(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filterCar(cars, car -> car.getColor().equals("Red"));
        List<Car> oldCars = filterCar(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(oldCars);
    }

    private static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
