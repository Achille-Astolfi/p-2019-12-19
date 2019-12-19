package com.example.aprea.component;

import java.util.Date;
import java.util.List;

public interface MovimentoCcFactory {
	MovimentoCc creaMovimentoCc(Date data, String desc, double importo);
}
