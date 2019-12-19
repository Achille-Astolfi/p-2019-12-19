package com.example.melchionda.component;

import java.util.List;

// nel mondo ideal questa interface la scrive il team del Controller
// nel mondo reale è più facile che la scriva il team del ServiceImpl
public interface MovimentiCcService {
	/**
	 * Restituisce gli ultimi tre movimenti del conto specificato come argomento
	 * 
	 * @param numeroCc
	 * @return
	 */
	List<MovimentoCc> leggiUltimiMovimentiCc(String numeroCc);
}
