package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
   private List<Car> cars = new ArrayList<>();

     {
        cars.add(new Car("BMW", 1, 200534));
        cars.add(new Car("Mercedes", 2, 23003));
        cars.add(new Car("Audi", 3, 999999));
        cars.add(new Car("Lada", 4, 184847));
        cars.add(new Car("Kamaz", 5, 919191));
    }

    @Override
    public List<Car> getCar() {
        return List.copyOf(cars);
    }
}