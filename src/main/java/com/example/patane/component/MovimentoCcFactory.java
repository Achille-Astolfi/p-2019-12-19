package com.example.patane.component;

import java.util.Date;



public interface MovimentoCcFactory {
	MovimentiCc creaMovimentoCc(Date data, String desc, double importo);
	

}
