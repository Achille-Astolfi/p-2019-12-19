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
		System.out.printf("Data\t\tDescrizione\t\t\tImporto\n");
		for (MovimentoCc mCc : mList) {
			// %D: data formattata gg/mm//aa
//			System.out.printf("%tD\t%s\t%,9.2f\n", mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto().doubleValue());
			// metodo dell'oggetto doublevalue trasforma in Double	
			System.out.printf("%1$td/%1$tm/%1$tY\t%2$s\t%3$,9.2f\n", mCc.getDataContabile(), mCc.getDescrizione(), mCc.getImporto().doubleValue());
			// %1$td il primo argomento in formato data giorno, %1$tm il primo argomento in formato data mese ecc.
			// Y per l'anno con quattro cifre, y con due cifre
		}
	}
}
