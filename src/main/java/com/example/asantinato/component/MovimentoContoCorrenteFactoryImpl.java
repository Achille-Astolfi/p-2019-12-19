package com.example.asantinato.component;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentoContoCorrenteFactoryImpl {
	
	public MovimentoContoCorrente creaMovimentoContoCorrente(Date data, String desc, double importo) {
		// creo l'oggetto
		MovimentoContoCorrente mCc = new MovimentoContoCorrente();
		// inizializzo l'oggetto
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		// converto double in BigDecimal col metodo della class: valueOf
		mCc.setImporto(BigDecimal.valueOf(importo));
		// restituisco il riferimento all'oggetto
		return mCc;
	}
}
