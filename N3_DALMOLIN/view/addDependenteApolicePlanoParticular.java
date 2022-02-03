package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ParticularController;
import dao.DAOApolice;
import model.Apolice;
import model.Dependente;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addDependenteApolicePlanoParticular extends JFrame {

	private JPanel contentPane;
	private JTextField textIdApolice;
	private JTextField textNomeAssegurado;
	private JTextField textEmailAssegurado;
	private JTextField textTelefoneAssegurado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addDependenteApolicePlanoParticular frame = new addDependenteApolicePlanoParticular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addDependenteApolicePlanoParticular() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alyss\\Desktop\\N2-Dalmolin\\iconfinder_6000463_corona_covid19_insurance_protect_virus_icon_512px.png"));
		setTitle("Adiciona Dependente APolice ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdApolice = new JLabel("Id Apolice");
		lblIdApolice.setBounds(76, 73, 140, 13);
		contentPane.add(lblIdApolice);
		
		textIdApolice = new JTextField();
		textIdApolice.setBounds(286, 70, 140, 19);
		contentPane.add(textIdApolice);
		textIdApolice.setColumns(10);
		
		JLabel lblNomeAssegurado = new JLabel("Nome Assegurado");
		lblNomeAssegurado.setBounds(76, 113, 140, 13);
		contentPane.add(lblNomeAssegurado);
		
		textNomeAssegurado = new JTextField();
		textNomeAssegurado.setBounds(286, 110, 140, 19);
		contentPane.add(textNomeAssegurado);
		textNomeAssegurado.setColumns(10);
		
		JLabel lblEmailAssegurado = new JLabel("Email Assegurado");
		lblEmailAssegurado.setBounds(76, 156, 140, 13);
		contentPane.add(lblEmailAssegurado);
		
		textEmailAssegurado = new JTextField();
		textEmailAssegurado.setBounds(286, 153, 140, 19);
		contentPane.add(textEmailAssegurado);
		textEmailAssegurado.setColumns(10);
		
		JLabel lblTelefoneAssegurado = new JLabel("Telefone Assegurado");
		lblTelefoneAssegurado.setBounds(76, 197, 140, 13);
		contentPane.add(lblTelefoneAssegurado);
		
		textTelefoneAssegurado = new JTextField();
		textTelefoneAssegurado.setBounds(286, 194, 140, 19);
		contentPane.add(textTelefoneAssegurado);
		textTelefoneAssegurado.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParticularController apoliceController = new ParticularController();
				Dependente meuDpndt = new Dependente(apoliceController.getListaApolice().get(0));
				meuDpndt.setId(Integer.parseInt(textIdApolice.getText()));
				meuDpndt.setNomeAssegurado(textNomeAssegurado.getText());
				meuDpndt.setEmailAssegurado(textEmailAssegurado.getText());
				meuDpndt.setTelefoneAssegurado(textTelefoneAssegurado.getText());
				meuDpndt.getApolice().getListaDependente().add(meuDpndt);
				apoliceController.insereNaApolice(meuDpndt.getApolice());				
				dispose();
			}
		});
		btnCadastrar.setBounds(395, 311, 121, 35);
		contentPane.add(btnCadastrar);
	}
}
