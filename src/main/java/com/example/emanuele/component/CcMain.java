package com.example.emanuele.component;

import java.io.IOException;
import java.net.URL;
import com.expample.emanuele.json.Person;
import com.expample.emanuele.json.PersonMain;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CcMain {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ContoCorrente cc=new ContoCorrente();
		
		ObjectMapper jack=new ObjectMapper();	
		URL url=PersonMain.class.getResource("/emanuele/person.json");
		Person mockPerson=jack.readValue(url, Person.class);
		
		cc.setTitolare(mockPerson);
		cc.setNumero(1234541651);
		
		MovimentiCcServiceImpl serviceImpl=new MovimentiCcServiceImpl();
		MovimentiCcFactoryImpl movFac=new MovimentiCcFactoryImpl();
		serviceImpl.setMovimentiFactory(movFac);
		cc.setMov(serviceImpl.leggiUltimiMovimentiCc(""+cc.getNumero()));
		System.out.println(jack.writeValueAsString(cc));
	}
}
