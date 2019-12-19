package com.example.distefano.component;

import java.util.List;

public interface MovimentiCcService {
	/**
	 * Restituisce gli ultimi 3 movimenti del conto specificato come argomento
	 * 
	 * @param numeroCc
	 * @return
	 */
	List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc); //gli passo il numero del conto e mi da i movimenti bancari del conto
}