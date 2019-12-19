package com.example.emanuele.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentiCcServiceImpl implements MovimentiCcService {
	private MovimentiCcFactory movFac;
	
	public void setMovimentiFactory(MovimentiCcFactory movFac) {
		this.movFac = movFac;
	}	
	
	@Override
	public List<MovimentiCc> leggiUltimiMovimentiCc(String numeroCc) {
		List<MovimentiCc> ccs=new ArrayList<>();
		ccs.add(movFac.creaMovimentoCc(new Date(119,11,11), "Stipendio", 4957.65));
		ccs.add(movFac.creaMovimentoCc(new Date(119,11,15), "Movimento carta di credito", -1936.27));
		ccs.add(movFac.creaMovimentoCc(new Date(119,11,19), "Movimento POS", -25.00));
		return ccs;
	}
	
	/*private MovimentiCc creaMovimentoCc(Date data,String desc, double importo) {
		MovimentiCc mCc=new MovimentiCc();
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		mCc.setImporto(BigDecimal.valueOf(importo));
		return mCc;
	}*/

}
