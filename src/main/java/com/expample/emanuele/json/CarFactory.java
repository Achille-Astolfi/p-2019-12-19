package com.expample.emanuele.json;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
	public Car createCar(String brand, double km) {
		Car car=new Car();
		car.setBrand(brand);
		car.setKm(km);
		return car;
	}
	
	public List<Car> createCarList(Car...cars){
		List<Car> lCar=new ArrayList<Car>();
		for (Car car : cars)
			lCar.add(car);
		return lCar;
	}
}