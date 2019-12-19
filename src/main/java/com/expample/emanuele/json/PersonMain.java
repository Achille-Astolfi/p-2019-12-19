package com.expample.emanuele.json;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonMain {
	public static Person mockPerson() {
		CarFactory cf=new CarFactory();
		Person p=new Person();
		p.setName("Cipolla");
		p.setAge(148);
		Car c1=cf.createCar("Lamborghini", 50);
		Car c2=cf.createCar("Mercedes", 12);
		Car c3=cf.createCar("Bugatti", 41.137);
		p.setCars(cf.createCarList(c1,c2,c3));
		return p;
	}
	
	public static void main(String[] args) throws IOException {
		Person p=PersonMain.mockPerson();
		ObjectMapper jack=new ObjectMapper();
		System.out.println(jack.writeValueAsString(p));
		
		URL url=PersonMain.class.getResource("/emanuele/person.json");
		Person p2=jack.readValue(url, Person.class);
		
		System.out.println(jack.writeValueAsString(p2));
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		for (Car car : p2.getCars())
			System.out.println(car.getBrand()+"\n"+car.getKm());
		
	}
}
