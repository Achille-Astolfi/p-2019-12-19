package com.example.distefano.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentiCcServiceImpl implements MovimentiCcService {

	private MovimentoCcFactory movimentoCcFactory;
	
	public void setMovimentoCcFactory(MovimentoCcFactory movimentoCcFactory) {
		this.movimentoCcFactory = movimentoCcFactory;
	}	

	@Override
	public List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc) {
		//creo lista
		List<MovimentoCc> ccs = new ArrayList<MovimentoCc>();
		
		//inseriamo movimenti a caso, in teoria prenderei da un database
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(2019, 11, 19), "Movimento POS Burgers", -25.00));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(2019, 11, 15), "Addebito carta credito", -1936.27));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(2019, 11, 11), "Accredito stipendio", 4987.65));
		
		//restituisco riferimento a lista
		return ccs;
	}
}






