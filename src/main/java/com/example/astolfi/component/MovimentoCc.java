package com.example.astolfi.component;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

// Ecco il nostro JavaBean
public class MovimentoCc {
	// fino a Java 7 si usava java.util.Date o java.util.GregorianCalendar
	// a partire da Java 8 si dovrebbe usare java.time.LocalDate
	private Date dataContabile;

	private String descrizione;

	// l'importo, trattandosi di dati contabili, si SCONSIGLIA di usare double
	// si usa java.math.BigDecimal
	private BigDecimal importo;

	// getter e setter

	// Annotation spudoratamente copiata dal tutorial
	// La data contabile viene serializzata come String e uso il pattern ISO anno-mese-giorno
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
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
