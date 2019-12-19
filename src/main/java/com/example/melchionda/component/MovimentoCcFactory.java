package com.example.melchionda.component;

import java.util.Date;

public interface MovimentoCcFactory {
	public MovimentoCc creaMovimentoCc(Date data, String desc, double importo);
}
