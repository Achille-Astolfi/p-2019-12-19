package com.example.astolfi.json;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonMain {
	private static Person mockPerson() {
		// so che non si fa così, ma siamo in un mock
		CarFactory carFactory = new CarFactory();
		//
		Person person = new Person();
		person.setName("Achille Astolfi");
		person.setAge(51);
		//
		// diamo un paio di macchine
		Car car1 = carFactory.createCar("BMW", 1936.4);
		Car car2 = carFactory.createCar("Ferrari", 98506.2);
		//
		person.setCars(carFactory.createCarList(car1, car2));
		
		return person;
	}
	
	public static void main(String[] args) throws IOException {
		Person achille = mockPerson();
		//
		// L'oggetto di Jackson che si occupa di fare marshall e unmarshall è della class
		// ObjectMapper
		ObjectMapper jackson = new ObjectMapper();
		// ho due possibilità: apro un (per esempio) BufferedWriter su una Path e serializzo su un file
		// oppure serializzo direttamente su String - utile per test o display su console
		String jsonAchille = jackson.writeValueAsString(achille);
		System.out.printf("%s\n", jsonAchille);
		
		// adesso proviamo a fare al contrario
		// abbiamo bisogno di recuperare la URL della risorsa che vogliamo leggere
		URL jsonUrl = PersonMain.class.getResource("/astolfi/person.json");
		// Problema: un JSON non ha nessuna informazione sul tipo della class che devo istanziare
		// quindi: devo dire io a Jackson qual è il tipo da istanziare
		// Il "trucco" ufficiale in Java per specifiare un tipo come se fosse un argomento
		// è usare gli oggetti della class Class.
		// Quindi: se voglio dire a Jackson di creare un oggetto di tipo Person gli devo
		// specificare Person.class come argomento
		Person jsonMia = jackson.readValue(jsonUrl, Person.class);
		System.out.printf("Si chiama %s, ha %d anni e ha %d auto.\n", 
				jsonMia.getName(), jsonMia.getAge(), jsonMia.getCars().size());
		
	}
}
