package com.example.melchionda.component;

// anche il main sarà un Mock che rappresenta l'utente che richiede
public class MockMain {
	public static void main(String[] args) {
		//ci facciamo dare il Controller
		MovimentiCcController controller = MockContainer.mettiInEsercizio();
		// adesso faccio finta di essere un utente che chiede i movimenti di CC
		controller.mostraMovimentiCc("tanto non lo uso");
	}

}
