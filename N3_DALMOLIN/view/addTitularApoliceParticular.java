package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ParticularController;
import model.Dependente;
import model.Titular;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addTitularApoliceParticular extends JFrame {

	private JPanel contentPane;
	private JTextField textIdApolice;
	private JTextField textCpfTitular;
	private JTextField textNomeTitular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addTitularApoliceParticular frame = new addTitularApoliceParticular();
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
	public addTitularApoliceParticular() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alyss\\Desktop\\N2-Dalmolin\\iconfinder_6000463_corona_covid19_insurance_protect_virus_icon_512px.png"));
		setTitle("Adicionar Titular Apolice");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdApolice = new JLabel("Id Apolice");
		lblIdApolice.setBounds(79, 115, 158, 13);
		contentPane.add(lblIdApolice);
		
		JLabel lblCpfTitular = new JLabel("CPF Titular");
		lblCpfTitular.setBounds(79, 180, 158, 13);
		contentPane.add(lblCpfTitular);
		
		JLabel lblNomeTitular = new JLabel("Nome Titular");
		lblNomeTitular.setBounds(79, 243, 172, 19);
		contentPane.add(lblNomeTitular);
		
		textIdApolice = new JTextField();
		textIdApolice.setBounds(291, 112, 206, 19);
		contentPane.add(textIdApolice);
		textIdApolice.setColumns(10);
		
		textCpfTitular = new JTextField();
		textCpfTitular.setBounds(291, 177, 206, 19);
		contentPane.add(textCpfTitular);
		textCpfTitular.setColumns(10);
		
		textNomeTitular = new JTextField();
		textNomeTitular.setBounds(291, 240, 206, 19);
		contentPane.add(textNomeTitular);
		textNomeTitular.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParticularController apoliceController = new ParticularController();
				Titular meuTitular = new Titular(apoliceController.getListaApolice().get(0));
				meuTitular.setId(Integer.parseInt(textIdApolice.getText()));
				meuTitular.setCpf(textCpfTitular.getText());
				meuTitular.setNome(textNomeTitular.getText());
				meuTitular.getApolice().getListaTitular().add(meuTitular);
				apoliceController.insereNaApolice(meuTitular.getApolice());				
				dispose();
			}
		});
		btnCadastrar.setBounds(397, 304, 128, 49);
		contentPane.add(btnCadastrar);
	}

}
