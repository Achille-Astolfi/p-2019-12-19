package com.example.melchionda.component;

import java.math.BigDecimal;
import java.util.Date;

// Ecco il nostro JavaBean
public class MovimentoCc {
	// fino a Java 7 si usava java.util.Date o java.util.GregorianCalendar
	// a partire da Java 8 si dovrebbe usare java.time.LocalDate
	private Date dataContabile;
	
	private String descrizione;
	
	// l'importo, trattandosi di dati contabili si sconsiglia di usare DOUBLE
	// perchè DOUBLE comincia a perdere la cifra in centesimi
	// si usa java.math.BigDecimal
	private BigDecimal importo;

	// getter e setter
	public Date getDataContabile() {
		return dataContabile;
	}

	public void setDataContabile(Date dataContabile) {
		this.dataContabile = dataContabile;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	
}
