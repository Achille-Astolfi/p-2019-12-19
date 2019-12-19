package com.example.emanuele.component;

import java.util.List;

public class MovimentiCcController {
	private MovimentiCcService movimentiCcService;
	
	public void setMovimentiCcService(MovimentiCcService movimentiCcService) {
		this.movimentiCcService=movimentiCcService;
	}
	
	public void mostraMovimentiCc(String numeroCc) {
		List<MovimentiCc> lMov=this.movimentiCcService.leggiUltimiMovimentiCc(numeroCc);
		System.out.println("Data\t\tDescrizione\t\tImporto");
		for(MovimentiCc mCc : lMov)
			System.out.printf("%tD\t%s\t\t%,.2f\n",mCc.getDataContabile(),mCc.getDescrizione(),mCc.getImporto());
	}
}

