package com.example.patane.component;

import java.util.List;

import com.example.patane.jason.Person;

public class ContoCorrente {
	long numero;	
	Person titolare;
	List<MovimentiCc> movimenti;
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
	public List<MovimentiCc> getMovimenti() {
		return movimenti;
	}
	public void setMovimenti(List<MovimentiCc> movimenti) {
		this.movimenti = movimenti;
	}

}
