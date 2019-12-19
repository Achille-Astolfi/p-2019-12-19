package com.example.patane.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentiCcServiceImpl implements MovimentiCcService {

	@Override
	public List<MovimentiCc> leggiUltimiMovimentiCc(String numeroCc) {
		
		List<MovimentiCc> ccs= new ArrayList<>();
		ccs.add(creaMovimentoCc(new Date(2019, 11, 11), "Stipendio", 4987.65));
		ccs.add(creaMovimentoCc(new Date(2019, 11, 15), "Addebito carta di credito", -1936.27));
		ccs.add(creaMovimentoCc(new Date(2019, 11, 19), "Movimento POS", -25.00));
		return ccs;
	}
	private MovimentiCc creaMovimentoCc(Date data, String desc, double importo) {
		MovimentiCc mCc= new MovimentiCc();
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		mCc.setImporto(BigDecimal.valueOf(importo));
		return mCc;
	}

}
