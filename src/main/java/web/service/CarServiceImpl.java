package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", 1, 2020));
        cars.add(new Car("Audi", 2, 2005));
        cars.add(new Car("Lada", 8, 2023));
        cars.add(new Car("Nissan", 7, 2019));
        cars.add(new Car("Bugatti", 10, 2024));

    }

    public List<Car> getCarsByCount(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
