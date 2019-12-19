package com.example.aprea.component;

import java.util.List;

import com.example.aprea.json.Person;

// creare nuova class CcMain dentro il package json: sistemiamo la visibilità dei metodi, creiamo un oggetto ContoCorrente con titolare "mockPerson" e con i movimenti
// restituiti dal metodo leggiUltimiMovimentiCc di movimentiCcServiceImpl
// 3) marshalliamo come JSON

public class ContoCorrente {
	private long numero;
	private Person titolare;
	private List<MovimentoCc> movimenti;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Person getTitolare() {
		return titolare;
	}

	public void setTitolare(Person titolare) {
		this.titolare = titolare;
	}

	public List<MovimentoCc> getMovimenti() {
		return movimenti;
	}

	public void setMovimenti(List<MovimentoCc> movimenti) {
		this.movimenti = movimenti;
	}
}
