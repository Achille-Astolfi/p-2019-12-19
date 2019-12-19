package com.example.patane.jason;

import java.io.IOException;
import java.net.URL;

import com.example.patane.component.ContoCorrente;
import com.example.patane.component.MovimentiCcFactoryImpl;
import com.example.patane.component.MovimentiCcServiceImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class CcMain {
	public static void main(String[] args) throws IOException {
	ObjectMapper oM= new ObjectMapper();
	URL jUrl= PersonMain.class.getResource("/Patane/person.json");
	Person mockPerson = oM.readValue(jUrl, Person.class);
	
	ContoCorrente contoCorrente= new ContoCorrente();
	
	contoCorrente.setTitolare(mockPerson);
	MovimentiCcServiceImpl mCcSI= new MovimentiCcServiceImpl();
	MovimentiCcFactoryImpl mCcFI= new MovimentiCcFactoryImpl();
	mCcSI.setMovimentoCcFactory(mCcFI);
	contoCorrente.setMovimenti(mCcSI.leggiUltimiMovimentiCc("prfrfr"));
	String jsonR= oM.writeValueAsString(mockPerson);
	System.out.println(jsonR);
	System.out.println("si chiama " + mockPerson.getName() + ", ha " + mockPerson.getAge() +  " anni, e ha: " + mockPerson.getCars().size() + " auto");

}
}