package com.example.aprea.component;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

// Ecco il nostro JavaBean
public class MovimentoCc {
	// fino a Java 7 si usava java.util.Date o java.util.GregorianCalendar
	// invece a partire da Java 8 si dovrebbe usare java.time.LocalDate
	private Date dataContabile;
	private String descrizione;
	// l'importo, trattandosi di dati contabili si sconsiglia di usare double (perde
	// precisione nei centesimi per valori molto grandi)
	// si usa java.math.BigDecimal
	private BigDecimal importo;
	// importo.doublevalue trasforma in Double
	// importo.valueOf
	
	// annotation sul getter della data per avere in formato stringa la data sul JSON
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
