package com.example.distefano.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimentiCcServiceImpl implements MovimentiCcService {

	@Override
	public List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc) {
		//creo lista
		List<MovimentoCc> ccs = new ArrayList<MovimentoCc>();
		
		//inseriamo movimenti a caso, in teoria prenderei da un database
		ccs.add(creaMovimentoCc(new Date(2019, 11, 19), "Movimento POS Burgers", -25.00));
		ccs.add(creaMovimentoCc(new Date(2019, 11, 15), "Addebito carta credito", -1936.27));
		ccs.add(creaMovimentoCc(new Date(2019, 11, 11), "Accredito stipendio", 4987.65));
		
		//restituisco riferimento a lista
		return ccs;
	}
	
	private MovimentoCc creaMovimentoCc(Date data, String desc, double importo) {
		//creo oggetto
		MovimentoCc mCc = new MovimentoCc();
		
		//inizializzo oggetto con i setter
		mCc.setDataContabile(data);
		mCc.setDescrizione(desc);
		mCc.setImporto(BigDecimal.valueOf(importo));
		
		//restituisco riferimentoa oggetto
		return mCc;
	}
}