package it.unisa.model.tecnico;

import java.io.Serializable;

public class TecnicoBean implements Serializable{


	private static final long serialVersionUID = 1960861329438531433L;
	String codStaff,specializzazione;
	
	public TecnicoBean() {
		String codStaff="";
		String specializzazione="";
	}

	public String getCodStaff() {
		return codStaff;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setCodStaff(String codStaff) {
		this.codStaff = codStaff;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	
	
}
