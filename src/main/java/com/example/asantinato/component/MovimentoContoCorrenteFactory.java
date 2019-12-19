package com.example.asantinato.component;

import java.util.Date;

import com.example.astolfi.component.MovimentoCc;

public interface MovimentoContoCorrenteFactory {
	MovimentoContoCorrente creaMovimentoCc(Date data, String desc, double importo);
}
