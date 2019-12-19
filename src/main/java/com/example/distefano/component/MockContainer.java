package com.example.distefano.component;

public class MockContainer {
	//un container vero:
	//crea il serviceImpl
	//crea il controller
	//risolve la dipendenza <<use>> (del Controller verso il Service)
	//mette in esercizio entrambi i component
	static MovimentiCcController mettiInEsercizio() {
		MovimentiCcServiceImpl serviceImpl = new MovimentiCcServiceImpl();
		MovimentiCcController controller = new MovimentiCcController();
		MovimentoCcFactoryImpl factoryImpl = new MovimentoCcFactoryImpl();
		//risolve la dipendenza <<use>> (del Controller verso il Service)
		controller.setMovimentiCcService(serviceImpl);
		serviceImpl.setMovimentoCcFactory(factoryImpl);
		//in realtà ci serve solo il controller, poichè il serviceImpl è al servizio del controller
		return controller;
	}
}