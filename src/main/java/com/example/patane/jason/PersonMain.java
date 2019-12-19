package com.example.patane.jason;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonMain {
	private static Person mockPerson() {
		CarFactory carFactory= new CarFactory();
		Person person= new Person();
		person.setName("Robert");
		person.setAge(23);
		
		Car car1= carFactory.createCar("BMW", 1934.5);
		Car car2=carFactory.createCar("Ferrari", 98506.5);
		
		person.setCars(carFactory.createCarList(car1, car2));
		return person;
	}
	
	public static void main(String[] args) throws IOException {
		Person Roberto= mockPerson();
		ObjectMapper jackson= new ObjectMapper();
		String jsonRoberto= jackson.writeValueAsString(Roberto);
		System.out.println(jsonRoberto);
		
		URL jsonUrl= PersonMain.class.getResource("/Patane/person.json");
		Person jsonMia= jackson.readValue(jsonUrl, Person.class);
		System.out.println("si chiama " + jsonMia.getName() + ", ha " + jsonMia.getAge() +  " anni, e ha: " + jsonMia.getCars().size() + " auto");
	}
}
