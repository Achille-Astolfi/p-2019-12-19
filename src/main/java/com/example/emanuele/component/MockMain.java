package com.example.emanuele.component;

public class MockMain {
	public static void main(String[] args) {
		MovimentiCcController controller=MockContainer.mettiInEsercizio();
		controller.mostraMovimentiCc("nomero conto");
	}
}
