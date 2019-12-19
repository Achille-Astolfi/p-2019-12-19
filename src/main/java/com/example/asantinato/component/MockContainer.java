package com.example.asantinato.component;

public class MockContainer {
	
	// container del nostro Controller
	static MovimentiContoCorrenteController mettiInEsercizi() {
		// creo un oggetto ServiceImpl
		MovimentiContoCorrenteServiceImpl sericeImpl = new MovimentiContoCorrenteServiceImpl();
		
		// creo un oggetto controller
		MovimentiContoCorrenteController controller = new MovimentiContoCorrenteController();
		
		// risolve la dipendenza <use>
		controller.setMovimentiContoCorrenteService(sericeImpl);
		
		// ritorno l'oggetto controller
		return controller;
	}
}
