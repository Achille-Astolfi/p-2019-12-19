package com.example.astolfi.component;

import java.util.List;

public class MovimentiCcController {
	// come si scrive in Java una relazione di <<use>> ?
	// 1) dichiaro un campo del tipo dell'interface che devo "usare"
	private MovimentiCcService movimentiCcService;
	
	// 2) se sono in un vero ambiente containerizzato allora avrei anche finito
	//    ma siccome non mi trovo in un ambiente reale allora simulo l'esistenza di un container
	//    dichiarando un setter per il campo definito al punto 1)
	public void setMovimentiCcService(MovimentiCcService movimentiCcService) {
		this.movimentiCcService = movimentiCcService;
	}
	
	public void mostraMovimentiCc(String numeroCc) {
		// ho bisogno di un JavaBean MovimentoCc con le tre informazioni:
		// data, descrizione, importo
		// Invoco il metodo che mi serve:
		List<MovimentoCc> mList = this.movimentiCcService.leggiUltimiMovimentiCc(numeroCc);
		// Impacchetto il risultato:
		// Nel mondo reale costruisco un HTML, in questa simulazione faccio un printf:
		System.out.printf("Data\t\tDescrizione\t\tImporto\n");
		for (MovimentoCc mCc : mList) {
			System.out.printf("%1$td/%1$tm/%1$tY\t%2$s\t%3$,9.2f\n", 
					mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto());
		}
	}
}
