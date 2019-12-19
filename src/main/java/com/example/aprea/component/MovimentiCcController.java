package com.example.aprea.component;

import java.util.List;

public class MovimentiCcController {
	// come si scrive in java una relazione di <<use>> ?
	// 1) dichiaro un campo del tipo dell'interface che devo "usare"
	private MovimentiCcService movimentiCcService;
	
	// 2) se fossi in un vero ambiente containerizzato allora avrei anche finito, ma siccome non mi trovo in un ambiente reale allora simulo l'esistenza di un container
	// diachiarando un setter per il campo definito al punto 1)
	public void setMovimentiCcService(MovimentiCcService movimentiCcService) {
		this.movimentiCcService = movimentiCcService;
	}
	
	
	public void mostraMovimentiCc(String numeroCc) {
		// ho bisogno di un JavaBean MovimentoCc con le tre informazioni:
		// data, descrizione, importo
		// Invoco il metodo che mi serve:
		List<MovimentoCc> mList = this.movimentiCcService.leggiUltimiMovimentiCc(numeroCc);
		// Impacchetto il risultato:
		// nel mondo reale costruisco un HTML, in questa simulazione faccio un printf
		System.out.printf("Data     \tDescrizione                \tImporto\n");
		for (MovimentoCc mCc : mList) {
			// %D: data formattata gg/mm//aa
			System.out.printf("%tD\t%s\t%,.2f\n", mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto().doubleValue());
			// metodo dell'oggetto doublevalue trasforma in Double	
		}
	}
}
