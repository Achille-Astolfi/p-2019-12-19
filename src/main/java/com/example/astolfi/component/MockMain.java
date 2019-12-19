package com.example.astolfi.component;

public class MockMain {
	public static void main(String[] args) {
		// ci facciamo dare il Controller
		MovimentiCcController controller = MockContainer.mettiInEsercizio();
		// adesso faccio finta di essere un utente che chiede i movimenti di CC
		controller.mostraMovimentiCc("tanto non lo uso");
	}
}
