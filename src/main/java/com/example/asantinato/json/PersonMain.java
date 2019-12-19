package com.example.asantinato.json;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonMain {
	private static Person mockPerson() {
		CarFactory carFactory = new CarFactory();
		
		Person person = new Person();
		person.setName("Andrea Santinato");
		person.setAge(21);
		
		Car car1 = carFactory.createCar("BMW", 1936.4);
		Car car2 = carFactory.createCar("Ferrari", 98586.2);
		
		person.setCars(carFactory.createCarList(car1, car2));
		
		return person;
	}
	
	public static void main(String[] args) throws IOException {
		Person person = mockPerson();
		
		ObjectMapper jackson = new ObjectMapper();
		String jsonAchille = jackson.writeValueAsString(person);
		System.out.println(jsonAchille);
		
		// otteniamo l'URL della nostra risolrsa
		
		URL jsonUrl = PersonMain.class.getResource("/santinato/person.json");
		
		Person jsonMia = jackson.readValue(jsonUrl, Person.class);
		System.out.println("Si chiama " + jsonMia.getName() + " e ha " + jsonMia.getAge() + " anni, possiede " + jsonMia.getCars().size() + " macchine");
	}
}
