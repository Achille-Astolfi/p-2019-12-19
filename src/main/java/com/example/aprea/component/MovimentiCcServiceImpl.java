package com.example.aprea.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// soconda scuola di pensiero (Spring fa così) se l'interface si chiama Pippo, la class che la implementa si chiama PippoImpl
// Ctrl+1: add unimplemed method
public class MovimentiCcServiceImpl implements MovimentiCcService {

	MovimentoCcFactory movimentoCcFactory;
	
	@Override
	public List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc) {
		// per nostra comodità facciamo il mock
		// creo un oggetto ArrayList e lo assegno a una variabile List
		List<MovimentoCc> ccs = new ArrayList<>();
		// inizializzo la list con tre valori più o meno a caso
		// uso un costruttore deprecato (che non dovrebbe più essere usato) di Date
		// (in Java 7 i mesi si contano 0 gennaio, ... 11 dicembre; invece in Java 8 (con LocalDate) 1 gennario, ... 12 dicembre
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(119, 11, 29), "Accredito stipendio\t", 4987.65)); // bisogna togliere 1900 dall'anno
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(119, 11, 15), "Addebito carta di credito", -1936.27));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(119, 11, 11), "Movimento POS Burger King", -25.00));
		// restituisco un riferimento all'oggetto creato
		return ccs;
	}

	public void setMovimentoCcFactory(MovimentoCcFactory movimentoCcFactory) {
		this.movimentoCcFactory = movimentoCcFactory;
	}

}
