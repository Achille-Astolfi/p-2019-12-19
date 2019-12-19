package com.example.asantinato.component;

public class MockMain {
	public static void main(String[] args) {
		// ci facciamo passare il controller
		MovimentiContoCorrenteController controller = MockContainer.mettiInEsercizi();
		
		// adesso faccio finta di essere un utente che chiede i movimenti del suo Conto Corrente
		
		controller.mostraMovimentiContoCorrente("tanto non lo uso");
	}	
}
