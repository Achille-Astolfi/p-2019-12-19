package com.example.emanuele.component;

public class MockContainer {
	public static MovimentiCcController mettiInEsercizio() {
		MovimentiCcServiceImpl serviceImpl=new MovimentiCcServiceImpl();
		MovimentiCcController controller=new MovimentiCcController();
		MovimentiCcFactoryImpl movFac=new MovimentiCcFactoryImpl();
		controller.setMovimentiCcService(serviceImpl);
		serviceImpl.setMovimentiFactory(movFac);
		return controller;
	}
}
