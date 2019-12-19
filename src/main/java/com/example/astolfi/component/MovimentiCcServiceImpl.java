package com.example.astolfi.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Seconda scuola di pensiero (che è la scuola di pensiero adottata da Spring)
// Se l'interface si chiama Pippo, la class che la implementa si chiama PippoImpl
public class MovimentiCcServiceImpl implements MovimentiCcService {
	private MovimentoCcFactory movimentoCcFactory;

	public void setMovimentoCcFactory(MovimentoCcFactory movimentoCcFactory) {
		this.movimentoCcFactory = movimentoCcFactory;
	}

	@Override
	public List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc) {
		// Per nostra comodità facciamo il mock
		// creo un oggetto ArrayList e lo assegno a una variabile List
		List<MovimentoCc> ccs = new ArrayList<>();
		// inizializzo la list con tre valori più o meno a caso
		// uso un costruttore deprecato di Date; deprecato vuol dire che non va usato 
		// ma siccome è un mock allora lo uso lo stesso
		// nota: in Java 7 i mesi si contano 0 gennaio, 1 febbraio... 11 dicembre
		// invece in Java 8 (con LocalDate) 1 gennaio, 2 febbraio... 12 dicembre
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(119, 11, 19), "Movimento POS Burgers", -25.00));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(119, 11, 15), "Addebito carta credito", -1936.27));
		ccs.add(movimentoCcFactory.creaMovimentoCc(new Date(119, 11, 11), "Accredito stipendio", 4987.65));
		// restituisco un riferimento all'oggetto creato
		return ccs;
	}

}
