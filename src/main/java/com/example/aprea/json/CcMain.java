package com.example.aprea.json;

import java.io.IOException;
import java.util.TimeZone;

import org.springframework.core.annotation.SynthesizedAnnotation;

import com.example.aprea.component.ContoCorrente;
import com.example.aprea.component.MockContainer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CcMain {
	private static ContoCorrente mockCc() {
		ContoCorrente cc = new ContoCorrente();
		cc.setNumero(12345684565L);
		cc.setTitolare(PersonMain.mockPerson());
		cc.setMovimenti(MockContainer.creaOggettoService().leggiUltimiMovimentiCc("non lo so"));
		return cc;
	}
	
	public static void main(String[] args) throws IOException {
		ObjectMapper jackson = new ObjectMapper().setTimeZone(TimeZone.getDefault()); // setto la data col TimeZone del mio pc
		String jsonCc = jackson.writeValueAsString(mockCc());
		System.out.printf("%s\n", jsonCc);
		
		ContoCorrente cc = jackson.readValue(CcMain.class.getResource("/aprea/cc.json"), ContoCorrente.class);
		System.out.printf("%s\n", jackson.writeValueAsString(cc));
		
	}
}
