package com.example.asantinato.component;

import com.example.astolfi.component.MovimentiCcController;
import com.example.astolfi.component.MovimentiCcServiceImpl;
import com.example.astolfi.component.MovimentoCcFactoryImpl;

public class MockContainer {
	
	// container del nostro Controller
	static MovimentiContoCorrenteController mettiInEsercizi() {
		// crea un oggetto ServiceImpl
		MovimentiContoCorrenteServiceImpl serviceImpl = new MovimentiContoCorrenteServiceImpl();
		// crea un oggetto Controller
		MovimentiContoCorrenteController controller = new MovimentiContoCorrenteController();
		// risolve la dipendenza <<use>> (del Controller verso il Service)
		controller.setMovimentiContoCorrenteService(serviceImpl);
				
		// crea un oggetto FactoryImpl
		MovimentoContoCorrenteFactoryImpl movimentoCcFactoryImpl = new MovimentoContoCorrenteFactoryImpl();
		// risolve la dipendenza 
		serviceImpl.setMovimentoCcFactory(movimentoCcFactoryImpl);
				
		// mette in esercizio tutti i component (in realtà ci serve solo il Controller)
		return controller;
	}
	
	public static MovimentiContoCorrenteServiceImpl creaOggettoServiceImpl() {
		// TODO Auto-generated method stub
		MovimentiContoCorrenteServiceImpl serviceImpl = new MovimentiContoCorrenteServiceImpl();
		MovimentoContoCorrenteFactoryImpl movimentoCcFactoryImpl = new MovimentoContoCorrenteFactoryImpl();
		serviceImpl.setMovimentoCcFactory(movimentoCcFactoryImpl);
		return serviceImpl;
	}
}
