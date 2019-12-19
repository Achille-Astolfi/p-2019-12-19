package com.example.distefano.component;

import java.util.Date;

public interface MovimentoCcFactory {
	MovimentoCc creaMovimentoCc(Date date, String desc, double importo);
}
