package dao;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import model.N2_ApoliceDependenteEmpresarial;
import model.Dependente;

public class N2_DAOApoliceEmpresarial {

	private ArrayList<N2_ApoliceDependenteEmpresarial> listaEmpresarial;
	private ArrayList<Dependente> listaAsseguradoEmp;

	public N2_DAOApoliceEmpresarial() {
		listaEmpresarial = new ArrayList<N2_ApoliceDependenteEmpresarial>();
		leApoliceEmpresarial();
		listaAsseguradoEmp = new ArrayList<Dependente>();
		leAsseguradosEmp();
		
	}

	public void adicionaApoliceEmpresarial(N2_ApoliceDependenteEmpresarial asseguradoEmpresarial) {
		listaEmpresarial.add(asseguradoEmpresarial);
	}
	
	public void AdicionaAsseguradoEmp(Dependente asseguradoApoliceEmp) {
		listaAsseguradoEmp.add(asseguradoApoliceEmp);
		}

	public void listaEmpresarial() {
		for (N2_ApoliceDependenteEmpresarial a : listaEmpresarial) {
			System.out.println(a.toString());
		}
	}
	
	public void listaAsseguradoEmp() {
		for(Dependente x : listaAsseguradoEmp) {
			System.out.println(x.toString());
		}
	}

	public void gravaArquivoListaEmpresarial() {
		try {
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("ListaEmpresarial.json");
			gson.toJson(listaEmpresarial, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void gravaArquivoListaAsseguradoEmp() {
		try {
			Gson gson1 = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("ListaAsseguradoEmp.json");
			gson1.toJson(listaAsseguradoEmp, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leApoliceEmpresarial() {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("ListaEmpresarial.json");

			TypeToken<ArrayList<N2_ApoliceDependenteEmpresarial>> token = new TypeToken<ArrayList<N2_ApoliceDependenteEmpresarial>>() {
			};

			ArrayList<N2_ApoliceDependenteEmpresarial> minhaLista = new ArrayList<N2_ApoliceDependenteEmpresarial>();
			minhaLista = gson.fromJson(filereader, token.getType());

			if (minhaLista != null) {
				listaEmpresarial = minhaLista;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void leAsseguradosEmp() {
		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("ListaAsseguradoEmp.json");

			TypeToken<ArrayList<Dependente>> token = new TypeToken<ArrayList<Dependente>>() {
			};

			ArrayList<Dependente> minhaLista1 = new ArrayList<Dependente>();
			minhaLista1 = gson1.fromJson(filereader, token.getType());

			if (minhaLista1 != null) {
				listaAsseguradoEmp = minhaLista1;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<N2_ApoliceDependenteEmpresarial> getListaEmpresarial() {
		return listaEmpresarial;
	}
	
	public ArrayList<Dependente> getListaAssegurado(){
		return listaAsseguradoEmp;
	}
}