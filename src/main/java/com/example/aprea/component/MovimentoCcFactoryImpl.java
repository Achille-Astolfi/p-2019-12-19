package com.example.aprea.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentoCcFactoryImpl implements MovimentoCcFactory {
	@Override
	public MovimentoCc creaMovimentoCc(Date data, String desc, double importo) {
		// creo l'oggetto
		MovimentoCc mCc = new MovimentoCc();
		// inizializzo l'oggetto
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		// converto double in BigDecimal col metodo della class BigDecimal: valueOf
		mCc.setImporto(BigDecimal.valueOf(importo));
		// restituisco il riferimento all'oggetto
		return mCc;
	}
}
