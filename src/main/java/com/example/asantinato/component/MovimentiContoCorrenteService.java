package com.example.asantinato.component;

import java.util.List;

public interface MovimentiContoCorrenteService {
	
	// Restituisce gli ultimi 3 movimenti del conto specificato come argomento
	List<MovimentoContoCorrente> leggiUltimiMovimentiContoCorrente(String numeroContoCorrente);
	
	
}
