package com.example.emanuele.component;

public class MockContainer {
	public static MovimentiCcController mettiInEsercizio() {
		MovimentiCcServiceImpl serviceImpl=new MovimentiCcServiceImpl();
		MovimentiCcController controller=new MovimentiCcController();
		controller.setMovimentiCcService(serviceImpl);
		return controller;
	}
}
