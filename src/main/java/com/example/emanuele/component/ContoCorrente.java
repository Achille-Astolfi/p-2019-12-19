package com.example.emanuele.component;

import java.util.List;

import com.expample.emanuele.json.Person;

public class ContoCorrente {
	private long numero;
	private Person titolare;
	private List<MovimentiCc> mov;
	
	
	public long getNumero() { return numero; }
	public void setNumero(long numero) { this.numero = numero; }
	public Person getTitolare() { return titolare; }
	public void setTitolare(Person titolare) { this.titolare = titolare; }
	public List<MovimentiCc> getMov() { return mov; }
	public void setMov(List<MovimentiCc> mov) { this.mov = mov; }
	
}
