package com.example.aprea.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonMain {
	private static Person mockPerson() {
		// so che non si fa così, ma siamo in un mock
		CarFactory carFactory = new CarFactory();
		//
		Person person = new Person();
		person.setName("Vincenzo Aprea");
		person.setAge(27);
		Car car1 = carFactory.createCar("BMW", 1936.4);
		Car car2 = carFactory.createCar("Ferrari", 98506.2);
		person.setCars(carFactory.createCarList(car1, car2));
		
		return person;
	}
	
	public static void main(String[] args) throws IOException {
		Person vincenzo = mockPerson(); //PersonMain.mockPerson() siccome sono nello stesso sorgente posso omettere la prima parte
		//
		// L'oggetto Jackson che si occupa di fare marshall e unmarshall è della class ObjectMapper
		ObjectMapper jackson = new ObjectMapper();
		// ho due possibilità: apro un (per esempio) BufferedWriter su una Path e serializzo su un file
		// oppure serializzo direttamente su String - utile per test o display su console
		String jsonVincenzo = jackson.writeValueAsString(vincenzo); // posso passargli qualsiasi oggetto
		System.out.printf("%s\n", jsonVincenzo);
	}	
}
