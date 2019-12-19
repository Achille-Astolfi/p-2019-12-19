package com.example.aprea.component;


// il container vero crea gli oggetti dei component che noi dichiariamo chiari
public class MockContainer {
	// il container vero: crea un oggetto ServiceImpl, crea un oggetto Controller, risolve la dipendenza <<use>> (del Controller verso Service),
	// mette in esercizio entrambi i componenti
	
	// in realtà ci serve solo il Controller, perché il ServiceImpl è a servizio del Controller
	static MovimentiCcController mettiInEsercizio() {
		// crea un oggetto ServiceImpl
		MovimentiCcServiceImpl serviceImpl = new MovimentiCcServiceImpl();
		// crea un oggetto Controller
		MovimentiCcController controller = new MovimentiCcController();
		// creo un oggetto FactoryImpl
		MovimentoCcFactoryImpl factoryImpl = new MovimentoCcFactoryImpl();
		// risolve la dipendenza <<use>> (del ServiceImpl verso Factory)
		serviceImpl.setMovimentoCcFactory(factoryImpl);
		// risolve la dipendenza <<use>> (del Controller verso Service)
		controller.setMovimentiCcService(serviceImpl);
		
		// mette in esercizio entrambi i component (in realtà ci serve solo il Controller)
		return controller;
	}
	
}
