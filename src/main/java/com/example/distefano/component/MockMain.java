package com.example.distefano.component;

public class MockMain {
	public static void main(String[] args) {
		//Ci facciamo dare il controller
		MovimentiCcController controller = MockContainer.mettiInEsercizio();
		//adesso faccio finta di essere un utente che chiede i movimenti di CC
		controller.mostraMovimentiCc("tanto non lo uso");
	}
}