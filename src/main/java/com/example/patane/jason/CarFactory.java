package com.example.patane.jason;

import java.util.ArrayList;
import java.util.List;

//scuola
public class CarFactory 
{
	public Car createCar(String model, double km) 
	{
		Car car= new Car();
		car.setModel(model);
		car.setKm(km);
		return car;
	}
	public List<Car> createCarList(Car...cars) {
		List<Car> list= new ArrayList<>();
		for (Car car : cars) {
			list.add(car);	
		}
		return list;
	}
}