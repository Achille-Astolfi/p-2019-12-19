package com.example.melchionda.component;

public class MockContainer {
	// il container vero crea un oggetto ServiceImpl, crea un oggetto Controller,
	// risolve la dipendenza <<use>> (dal Controller verso il Service)
	// mette in esercizio entrambi i component
	
	// In realtà ci serve solo il Controller, perchè il ServiceImpl è al servizio
	// del Controller
	// con static non dobbiamo creare l'oggetto, il metodo c'è già
	static MovimentiCcController mettiInEsercizio() {
		// crea un oggetto ServiceImpl
		MovimentiCcServiceImpl serviceImpl = new MovimentiCcServiceImpl();
		// crea oggetto Controller
		MovimentiCcController controller = new MovimentiCcController();
		
		MovimentoCcFactoryImpl factoryImpl = new MovimentoCcFactoryImpl();
		// risolve la dipendenza <<use>> (del Controller verso il Service)
		controller.setMovimentiCcService(serviceImpl);
		serviceImpl.setMovimentoCcFactory(factoryImpl);
		//mette in esercizio entrambi i component (in realtà ci serve solo il Controller)
		return controller;
	}

}
