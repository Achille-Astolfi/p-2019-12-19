package com.example.melchionda.component;

import java.util.List;

public class MovimentiCcController {
	// come si scrive in Java una relazione di <<use>> ?
	// 1) dichiaro un campo del tipo dell'interface che devo "usare"
	private MovimentiCcService movimentiCcService;
	
	// 2) se sono in un vero ambiente containerizzato allora avrei anche finito 
	//		ma siccome non mi trovo in ambiente reale allora simulo l'esistenza di un container
	//		dichiarando un setter per il campo definito al punto 1)

	public void setMovimentiCcService(MovimentiCcService movimentiCcService) {
		this.movimentiCcService = movimentiCcService;
	}

	public void mostraMovimentiCc(String numeroCc) {
		// ho bisogno di un JavaBean MovimentoCc con le tre informazioni:
		// data, descrizione, importo
		// invoco il metodo che mi serve
		List<MovimentoCc> mList = this.movimentiCcService.leggiUltimiMovimentiCc(numeroCc);
		// Impacchetto il risultato:
		// Nel mondo reale costruisco HTML, in questa simulazione faccio un printf;
		System.out.printf("Data        \tDescrizione      \tImporto\n");
		for (MovimentoCc mCc : mList) {
			// %D: data formattata per gg/mm/aaaa
			// ,: separatore delle migliaia .2: due cifre decimali
			// su 9.2 su 9 caratteri allinea a destra
			System.out.printf("%1$td/%1$tm/%1$tY\t%2$s\t%3$,9.2f\n", mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto().doubleValue());
			
		}
	}
	
}
