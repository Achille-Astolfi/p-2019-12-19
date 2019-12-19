package com.example.patane.component;

public class MockContainer {
	static MovimentiCcController mettiInEsercizio() {
		MovimentiCcServiceImpl serviceImpl= new MovimentiCcServiceImpl();
		MovimentiCcController controller= new MovimentiCcController();
		MovimentoCcFactory factoryImpl= new MovimentiCcFactoryImpl();
		controller.setMovimentiCcService(serviceImpl);
		serviceImpl.setMovimentoCcFactory(factoryImpl);
		return controller;
	}
}
