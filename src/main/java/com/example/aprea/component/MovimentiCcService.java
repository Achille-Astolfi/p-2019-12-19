package com.example.aprea.component;

import java.util.List;

// Nel mondo ideale questa interface la scrive il team del Controller, nel mondo reale è più facile che la scriva il team del ServiceImpl
public interface MovimentiCcService {
	// ho bisogno di un metodo che mi restituisca la lista dei MovimentiCc come output
	/**
	 * Restituisce gli ultimi tre movimenti del conto specificato come argomento.
	 * 
	 * @param numeroCc
	 * @return
	 */
	List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc);
	
}
