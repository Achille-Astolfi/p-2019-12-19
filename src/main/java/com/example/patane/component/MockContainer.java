package com.example.patane.component;

public class MockContainer {
	static MovimentiCcController mettiInEsercizio() {
		MovimentiCcServiceImpl serviceImpl= new MovimentiCcServiceImpl();
		MovimentiCcController controller= new MovimentiCcController();
		controller.setMovimentiCcService(serviceImpl);
		return controller;
	}
}
