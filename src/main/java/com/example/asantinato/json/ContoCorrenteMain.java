package com.example.asantinato.json;

import java.io.IOException;

import com.example.asantinato.component.ContoCorrente;
import com.example.asantinato.component.MockContainer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ContoCorrenteMain {
	
	private static ContoCorrente mockPerson() {
		ContoCorrente cc = new ContoCorrente();
		cc.setName(123456789);
		cc.setMovimenti(MockContainer.creaOggettoServiceImpl().leggiUltimiMovimentiContoCorrente("tanto non lo uso"));
		
		return cc;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ObjectMapper jackson = new ObjectMapper();
		String jsonCc = jackson.writeValueAsString(mockPerson());
		System.out.println(jsonCc);
	}
	
	
}
