package com.example.asantinato.component;

import java.util.List;

public class MovimentiContoCorrenteController {
	
	// relazione di <use> in Java:
	// 1) dichiaro un campo del tipo dell'interface che devo 'usare'
	private MovimentiContoCorrenteService movimentiContoCorrenteService;
	
	// 2) se sono in un vero ambiente compiuterizzato avrei finito, non trovandomi in questa situazione simulo l'esistenza di un container dichiarando i setter per il campo definito al punto 1
	public void setMovimentiContoCorrenteService(MovimentiContoCorrenteService movimentiContoCorrenteService) {
		this.movimentiContoCorrenteService = movimentiContoCorrenteService;
	}
	
	
	public void mostraMovimentiContoCorrente(String numeric) {
		List<MovimentoContoCorrente> movimentoCcList = this.movimentiContoCorrenteService.leggiUltimiMovimentiContoCorrente(numeric);
		
		// Impacchetto il risultato sotto forma di un HTML, nel nostro caso può anche andare bene un semplice Printf
		//System.out.printf("Data\Descrizione\tImporto\n");
		
		for (MovimentoContoCorrente mContoCorrente : movimentoCcList) {
			System.out.printf(mContoCorrente.getDescrizione(), mContoCorrente.getImporto().doubleValue());
		}
	}

}

	
