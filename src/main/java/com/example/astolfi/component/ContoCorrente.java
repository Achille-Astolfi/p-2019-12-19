package com.example.astolfi.component;

import java.util.List;

import com.example.astolfi.json.Person;

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
