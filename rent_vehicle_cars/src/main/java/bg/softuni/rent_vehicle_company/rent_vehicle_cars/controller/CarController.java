package bg.softuni.rent_vehicle_company.rent_vehicle_cars.controller;


import bg.softuni.rent_vehicle_company.rent_vehicle_cars.model.entity.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

@GetMapping("/cars")
    public ResponseEntity<List<Car>> getCarInfo(){

    Car car = new Car();
    car.setBrand("Audi");
    car.setModel("A5");
    car.setYear(2021);

    Car car2 = new Car();
    car.setBrand("BMW");
    car.setModel("M3");
    car.setYear(2021);


    Car car3 = new Car();
    car.setBrand("Mercedes");
    car.setModel("GLA");
    car.setYear(2021);
    List<Car> cars = List.of(car, car2, car3);

    return ResponseEntity.ok(cars);
}

}
