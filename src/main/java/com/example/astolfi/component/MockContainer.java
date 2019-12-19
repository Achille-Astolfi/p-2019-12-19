package com.example.astolfi.component;

public class MockContainer {
	// il container vero che cosa fa:
	// crea un oggetto ServiceImpl
	// crea un oggetto Controller
	// risolve la dipendenza <<use>> (del Controller verso il Service)
	// mette in esercizio entrambi i component
	
	// In realtà ci serve solo il Controller, perché il ServiceImpl è al servizio
	// del Controller
	static MovimentiCcController mettiInEsercizio() {
		// crea un oggetto ServiceImpl
		MovimentiCcServiceImpl serviceImpl = new MovimentiCcServiceImpl();
		// crea un oggetto Controller
		MovimentiCcController controller = new MovimentiCcController();
		// risolve la dipendenza <<use>> (del Controller verso il Service)
		controller.setMovimentiCcService(serviceImpl);
		// mette in esercizio entrambi i component (in realtà ci serve solo il Controller)
		return controller;
	}
}
