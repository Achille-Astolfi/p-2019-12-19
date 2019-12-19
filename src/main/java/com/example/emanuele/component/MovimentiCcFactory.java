package com.example.emanuele.component;

import java.util.Date;

public interface MovimentiCcFactory {
	public MovimentiCc creaMovimentoCc(Date data,String desc, double importo);
}
