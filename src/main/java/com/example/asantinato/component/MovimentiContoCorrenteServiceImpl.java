package com.example.asantinato.component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.astolfi.component.MovimentoCcFactory;

// nella seconda scuola di pensiero ideata da Spring, la classe che implementa l'interface avrà lo stesso nome con impl alla fine
// Es: se l'interface si chiama DataScheme, la classe che la implementa si chiamerà DataSchemeImpl

public class MovimentiContoCorrenteServiceImpl implements MovimentiContoCorrenteService {
	
	public MovimentoContoCorrenteFactoryImpl movimentoCcFactory;

	public void setMovimentoCcFactory(MovimentoContoCorrenteFactoryImpl movimentoCcFactoryImpl) {
		this.movimentoCcFactory = movimentoCcFactoryImpl;
	}
	
	@Override
	public List<MovimentoContoCorrente> leggiUltimiMovimentiContoCorrente(String numeroContoCorrente) {
		
		// creo un oggetto ArrayList che assegno ad una List
		List<MovimentoContoCorrente> ccs = new ArrayList<>();
		
		ccs.add(movimentoCcFactory.creaMovimentoContoCorrente(new Date(2019,11,19), "Movimento POS", -25.00));
		ccs.add(movimentoCcFactory.creaMovimentoContoCorrente(new Date(2019,11,15), "Addebito Carta Di Credito", -1936.27));
		ccs.add(movimentoCcFactory.creaMovimentoContoCorrente(new Date(2019,11,11), "Stipendio", 4987.65));
		
		// restituisco l'oggetto
		return ccs;
	}
	
	
	
}
