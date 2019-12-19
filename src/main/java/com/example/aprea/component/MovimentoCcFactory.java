package com.example.aprea.component;

import java.util.Date;
import java.util.List;

public interface MovimentoCcFactory {
	/**
	 * Costruisce gli oggetti MovimentoCc e li inizializza
	 * @param data
	 * @param desc
	 * @param importo
	 * @return
	 */
	MovimentoCc creaMovimentoCc(Date data, String desc, double importo);
}
