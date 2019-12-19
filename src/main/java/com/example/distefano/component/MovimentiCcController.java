package com.example.distefano.component;

import java.util.List;

public class MovimentiCcController {
	//come si scrive in Java una relazione di tipo <<use>>?
	//1) dichiaro un campo del tipo dell'Interface che devo usare
	private MovimentiCcService movimentiCcService;
	
	//2) se fossi in un vero ambiente containerizzato allora avrei anche finito
	//	 ma siccome mi trovo in un ambiente reale allora simulo l'esistenza di
	//	 un container dichiarando un setter per il campo definito al punto 1)
	public void setMovimentiCcService(MovimentiCcService movimentiCcService) {
		this.movimentiCcService = movimentiCcService;
	}	
	
	public void mostraMovimentiCc(String numeroCc) {
		//ho bisogno di un JavaBean con tre informazioni: data, descrizione e importo
		//Invoco il metodo che mi serve:
		List<MovimentoCc> mList = this.movimentiCcService.leggiUltimiMovimentiCc(numeroCc);
		System.out.println("Data\t\tDescrizione\t\tImporto");
		for (MovimentoCc mCc : mList) {
			System.out.printf("%1$td/%1$tm/%1$ty\t%2$s\t%3$,9.2f\n", mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto().doubleValue());
		}
	}
}