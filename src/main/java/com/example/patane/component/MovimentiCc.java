package com.example.patane.component;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentiCc {
	private Date dataContabile;
	private String descrizione;
	private BigDecimal importo;
	
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
