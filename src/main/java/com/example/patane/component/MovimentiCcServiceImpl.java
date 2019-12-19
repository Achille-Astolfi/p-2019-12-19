package com.example.patane.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentiCcServiceImpl implements MovimentiCcService {
	
	private MovimentoCcFactory movimentoCcFactory;
	

	public void setMovimentoCcFactory(MovimentoCcFactory movimentoCcFactory) {
		this.movimentoCcFactory = movimentoCcFactory;
	}


	@Override
	public List<MovimentiCc> leggiUltimiMovimentiCc(String numeroCc) {
		
		List<MovimentiCc> ccs= new ArrayList<>();
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(2019, 11, 11), "Stipendio", 4987.65));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(2019, 11, 15), "Addebito carta di credito", -1936.27));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(2019, 11, 19), "Movimento POS", -25.00));
		return ccs;
	}
	
	
}
