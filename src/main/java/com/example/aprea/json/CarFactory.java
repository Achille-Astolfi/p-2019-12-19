package com.example.aprea.json;

import java.util.ArrayList;
import java.util.List;

// stessa cosa della factory di prima ma senza l'interface. è un'altra scuola di pensiero
public class CarFactory {
	public Car createCar(String model, double km) {
		// sono quattro istruzioni
		Car car = new Car();
		car.setModel(model);
		car.setKm(km);
		return car;
	}
	
	// i tre puntini significa che posso invocare questo metodo con un numero indefinito di Car
	// createCarList(), createCarList(car), createCarList(car1, car2) eccetera
	public List<Car> createCarList(Car...cars) {
		List<Car> list = new ArrayList<>();
		// tecnicamente cars è un array di Car[] e quindi posso fare un for-each
		for (Car car : cars) {
			list.add(car);
		}
		return list;
	}
}
