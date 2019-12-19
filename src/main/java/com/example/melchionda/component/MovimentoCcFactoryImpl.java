package com.example.melchionda.component;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentoCcFactoryImpl implements MovimentoCcFactory {

	public MovimentoCc creaMovimentoCc(Date data, String desc, double importo) {
		// creiamo l'oggetto movimento Cc
		MovimentoCc mCc = new MovimentoCc();
		//inizializzo l'oggetto
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		// converto double in BigDecimal col metodo della class: valueOf
		mCc.setImporto(BigDecimal.valueOf(importo));
		
		//restituisco il riferimento all'oggetto
		return mCc;
	}

}
