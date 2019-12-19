package com.example.distefano.component;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentoCcFactoryImpl implements MovimentoCcFactory {

	@Override
	public MovimentoCc creaMovimentoCc(Date date, String desc, double importo) {
		//creo oggetto
		MovimentoCc mCc = new MovimentoCc();
		
		//inizializzo oggetto con i setter
		mCc.setDataContabile(date);
		mCc.setDescrizione(desc);
		mCc.setImporto(BigDecimal.valueOf(importo));
		
		//restituisco riferimentoa oggetto
		return mCc;
	}
}