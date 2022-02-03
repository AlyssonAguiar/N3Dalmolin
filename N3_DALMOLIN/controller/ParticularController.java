package controller;

import java.util.ArrayList;

import dao.DAOApolice;
import model.Apolice;

public class ParticularController {
	public DAOApolice daoApolice = new DAOApolice();
	//private ArrayList<Apolice> listaApolice = new ArrayList<Apolice>();

	public ArrayList<Apolice> getListaApolice(){
		return daoApolice.getListaApolice();
	}
	
	public void insereApolice (Apolice apolice) {
		daoApolice.adicionaApolice(apolice);
		daoApolice.gravaArquivoListaApolice();
	}
	
	public void insereNaApolice (Apolice apolice) {
		daoApolice.gravaArquivoListaApolice();
		
	}
		
	/*public void adicionaAPolice(Apolice apolice) {
		listaApolice.add(apolice);
	}*/
	
	public int getTotalApolices() {
		return daoApolice.getListaApolice().size();
	}
	

}

