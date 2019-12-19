package com.example.emanuele.component;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentiCcFactoryImpl implements MovimentiCcFactory {

	@Override
	public MovimentiCc creaMovimentoCc(Date data, String desc, double importo) {
		MovimentiCc mCc=new MovimentiCc();
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		mCc.setImporto(BigDecimal.valueOf(importo));
		return mCc;
	}

}
