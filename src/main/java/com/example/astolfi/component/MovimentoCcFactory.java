package com.example.astolfi.component;

import java.util.Date;

public interface MovimentoCcFactory {
	MovimentoCc creaMovimentoCc(Date data, String desc, double importo);
}
