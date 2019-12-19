package com.example.patane.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentiCcFactoryImpl implements MovimentoCcFactory {

	public MovimentiCc creaMovimentoCc(Date data, String desc, double importo) {
		MovimentiCc mCc= new MovimentiCc();
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		mCc.setImporto(BigDecimal.valueOf(importo));
		return mCc;
	}

}
