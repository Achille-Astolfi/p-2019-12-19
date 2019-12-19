package com.example.patane.component;

import java.util.List;

public class MovimentiCcController {
	
	private MovimentiCcService movimentiCcService;
		public void setMovimentiCcService(MovimentiCcService movimentiCcService) {
		this.movimentiCcService = movimentiCcService;
	}
	public void mostraMovimentiCc(String numeroCc) {
		List<MovimentiCc> mList= this.movimentiCcService.leggiUltimiMovimentiCc(numeroCc);
		System.out.println("Data\tDescrizione\tImporto\n");
		for (MovimentiCc mCc : mList) {
			System.out.printf("%tD\t%s\t%,.2f\n", mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto());
			
		}
	}



}
