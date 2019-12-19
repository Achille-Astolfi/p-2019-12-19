package com.example.aprea.json;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonMain {
	static Person mockPerson() {
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
		
		// facciamo il contrario. abbiamo un file .json e vogliamo ottenere l'oggetto
		// abbiamo bisogno di recuperare la URL della risorsa che vogliamo leggere
		URL jsonUrl = PersonMain.class.getResource("/aprea/person.json");
		//// il tipo della classe che crea l'oggetto deve essere specificato, perchè nel .json non c'è scritto
		//// devo passare il tipo Person a jackson usando un metodo della class Class
		//un JSON non ha nessuna informazione sul tipo della class che devo istanziare, quindi: devo dire io a Jackson qual è il tipo da istanziare
		// il trucco ufficiale in Java per specificare un tipo come se fosse un argomento è usare gli oggetti della class Class
		// perciò se voglio dire a Jackson di creare un oggetto di tipo Person gli devo specificare Person.class come argomento
		// (Hybernate fa la stessa cosa, associa ad ogni tabella una class java con i titoli delle colonne)
		Person jsonMia = jackson.readValue(jsonUrl, Person.class);
		System.out.printf("Si chiama %s, ha %d anni e ha %d auto.\n", jsonMia.getName(),jsonMia.getAge(), jsonMia.getCars().size());
		System.out.printf("La prima auto è: %s", jsonMia.getCars().get(0).getModel()); //TODO
		

	}	
}
// jackson individua tutti i getter e segnala tutto ciò che trova:
// getName -> segna la variabile e il contenuto del get