package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCar(Integer count) {
        List<Car> cars = carDao.getCar();

        return count == null || count >= 5 ? cars : cars.subList(0, count);
    }
}