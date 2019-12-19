package com.example.patane.component;

public class MockMain {
	public static void main(String[] args) {
		MovimentiCcController controller= MockContainer.mettiInEsercizio();
		controller.mostraMovimentiCc("tanto non lo uso");
		
	}
}
