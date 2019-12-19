package com.example.astolfi.json;

import java.io.IOException;
import java.util.TimeZone;

import com.example.astolfi.component.ContoCorrente;
import com.example.astolfi.component.MockContainer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CcMain {
	private static ContoCorrente mockCc() {
		ContoCorrente cc = new ContoCorrente();
		
		cc.setNumero(123456789012L);
		cc.setTitolare(PersonMain.mockPerson());
		cc.setMovimenti(MockContainer.creaOggettoServiceImpl().leggiUltimiMovimentiCc("tanto non lo uso"));
		
		return cc;
	}
	
	public static void main(String[] args) throws IOException {
		ObjectMapper jackson = new ObjectMapper()
				.setTimeZone(TimeZone.getDefault());
		String jsonCc = jackson.writeValueAsString(mockCc());
		System.out.printf("%s\n", jsonCc);
		
		ContoCorrente cc = jackson.readValue(CcMain.class.getResource("/astolfi/cc.json"), ContoCorrente.class);
		System.out.printf("%s\n", jackson.writeValueAsString(cc));
	}
}
