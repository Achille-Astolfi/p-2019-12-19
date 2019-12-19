package com.example.asantinato.component;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentoContoCorrente {
	private Date dataContabile;
	private String descrizione;
	
	// essendo dati contabili, si sconsigli l'uso di double. Al suo posto si può usare BigDecimal
	private BigDecimal importo;

	
	// Inizializzo i Getter & Setter
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
