package model;

import com.google.gson.annotations.Expose;

public class Dependente {
	@Expose
	public int id;
	@Expose
	public String nomeAssegurado;
	@Expose
	public String emailAssegurado;
	@Expose
	public String telefoneAssegurado;
	
	public Apolice apolice;
	public Titular titular;
	
	public Dependente(Apolice apolice) {
		super();
		this.apolice=apolice;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeAssegurado() {
		return nomeAssegurado;
	}

	public void setNomeAssegurado(String nomeAssegurado) {
		this.nomeAssegurado = nomeAssegurado;
	}

	public String getEmailAssegurado() {
		return emailAssegurado;
	}

	public void setEmailAssegurado(String emailAssegurado) {
		this.emailAssegurado = emailAssegurado;
	}

	public String getTelefoneAssegurado() {
		return telefoneAssegurado;
	}

	public void setTelefoneAssegurado(String telefoneAssegurado) {
		this.telefoneAssegurado = telefoneAssegurado;
	}


	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Dependente [id=" + id + ", nomeAssegurado=" + nomeAssegurado + ", emailAssegurado=" + emailAssegurado
				+ ", telefoneAssegurado=" + telefoneAssegurado + ", apolice=" + apolice + ", titular=" + titular + "]";
	}

	
	
}
