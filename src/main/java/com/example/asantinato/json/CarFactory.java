package com.example.asantinato.json;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
	public Car createCar(String model, double km) {
		Car macchina = new Car();
		macchina.setModel(model);
		macchina.setKm(km);
		
		return macchina;
	}
	
	// con i 3 pubnti significa che posso invocare questo metodo con un numero infinito di valori, anche semplicemente zero
	public List<Car> createCarList(Car ...cars) {
		List<Car> list = new ArrayList();
		
		for (Car car : cars) {
			list.add(car);
		}
		
		return list;
	}
	
}
