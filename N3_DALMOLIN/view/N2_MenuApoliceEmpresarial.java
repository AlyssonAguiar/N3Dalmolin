/*package view;

import java.util.Scanner;

import dao.N2_DAOApoliceEmpresarial;
import model.N2_ApoliceDependenteEmpresarial;
import model.Dependente;

public class N2_MenuApoliceEmpresarial extends N2_ApoliceDependenteEmpresarial {
	N2_ApoliceDependenteEmpresarial apoliceDpndEmp = new N2_ApoliceDependenteEmpresarial();
	Dependente asseguradoApoliceEmp = new Dependente();

	Scanner leitura = new Scanner(System.in);
	Scanner numero = new Scanner(System.in);

	public void inserirEmpresarial() {

		leitura.nextLine();
		System.out.println("Insira o id");
		apoliceDpndEmp.id = numero.nextInt();

		System.out.println("Insira o CNPJ do Respons�vel");
		apoliceDpndEmp.cnpjResponsavel = leitura.nextLine();

		System.out.println("Insira o Nome do Respons�vel");
		apoliceDpndEmp.nomeResponsavel = leitura.nextLine();

		System.out.println("Insira a data de Assinatura da Ap�lice dia/mes/ano");
		apoliceDpndEmp.dataAssinatura = leitura.nextLine();

		System.out.println("Insira quantos meses esse contrato ser� vigente");
		apoliceDpndEmp.mesesVigencia = numero.nextInt();

		System.out.println("Insira o valor da Mensalidade");
		apoliceDpndEmp.mensalidade = numero.nextDouble();

		System.out.println("Insira o Nome do Assegurado");
		asseguradoApoliceEmp.nomeAssegurado = leitura.nextLine();
		
		System.out.println("Insira o Email do Assegurado");
		asseguradoApoliceEmp.emailAssegurado = leitura.nextLine();

		System.out.println("Insira o Telefone do Assegurado");
		asseguradoApoliceEmp.telefoneAssegurado = leitura.nextLine();

		System.out.println("Insira o CPF do Assegurado");
		apoliceDpndEmp.cpfAssegurado = leitura.nextLine();

		N2_DAOApoliceEmpresarial meudao = new N2_DAOApoliceEmpresarial();
		meudao.adicionaApoliceEmpresarial(apoliceDpndEmp);
		meudao.AdicionaAsseguradoEmp(asseguradoApoliceEmp);
		meudao.gravaArquivoListaEmpresarial();
		meudao.gravaArquivoListaAsseguradoEmp();
	}


	public void listarEmpresarial() {
		N2_DAOApoliceEmpresarial listas = new N2_DAOApoliceEmpresarial();
		listas.listaEmpresarial();
		listas.listaAsseguradoEmp();
	}
	
}
*/