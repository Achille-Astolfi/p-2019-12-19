package com.example.asantinato.component;

import java.util.List;

import com.example.asantinato.json.Person;

public class ContoCorrente {
	private long name;
	private Person titolare;
	List<MovimentoContoCorrente> movimenti;

	public long getName() {
		return name;
	}

	public void setName(long name) {
		this.name = name;
	}

	public Person getTitolare() {
		return titolare;
	}

	public void setTitolare(Person titolare) {
		this.titolare = titolare;
	}

	public List<MovimentoContoCorrente> getMovimenti() {
		return movimenti;
	}

	public void setMovimenti(List<MovimentoContoCorrente> movimenti) {
		this.movimenti = movimenti;
	}

}
