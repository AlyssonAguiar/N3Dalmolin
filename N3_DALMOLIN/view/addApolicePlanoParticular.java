package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ParticularController;
import dao.DAOApolice;
import model.Apolice;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addApolicePlanoParticular extends JFrame {

	private JPanel pnApolice;
	private JTextField txtId;
	private JTextField txtDigiteAData;
	private JTextField txtMesesVigente;
	private JTextField txtMensalidade;
	private JTextField txtDigiteOCpf;
	private JLabel lblCpfAssegurado;
	private JLabel lblCpfResponsavel;
	private JTextField txtCpfResponsavel;
	private JLabel lblStatus;
	private JTextField txtStatus;
	
	private ParticularController controller;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addApolicePlanoParticular frame = new addApolicePlanoParticular();
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
	public addApolicePlanoParticular() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alyss\\Desktop\\N2-Dalmolin\\iconfinder_6000463_corona_covid19_insurance_protect_virus_icon_512px.png"));
		setTitle("Adiciona Apolice Plano Particular");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 400);
		pnApolice = new JPanel();
		pnApolice.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnApolice);
		pnApolice.setLayout(null);
		
		JLabel lblId = new JLabel("Id Apolice");
		lblId.setBounds(58, 78, 220, 13);
		pnApolice.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(288, 75, 149, 19);
		pnApolice.add(txtId);
		txtId.setColumns(10);
		
		txtDigiteAData = new JTextField();
		txtDigiteAData.setColumns(10);
		txtDigiteAData.setBounds(288, 104, 149, 19);
		pnApolice.add(txtDigiteAData);
		
		JLabel lblDataAssinatura = new JLabel("Data da Assinatura");
		lblDataAssinatura.setBounds(58, 107, 220, 13);
		pnApolice.add(lblDataAssinatura);
		
		JLabel lblMesesDeVigencia = new JLabel("Meses de Vigencia");
		lblMesesDeVigencia.setBounds(58, 136, 220, 13);
		pnApolice.add(lblMesesDeVigencia);
		
		txtMesesVigente = new JTextField();
		txtMesesVigente.setColumns(10);
		txtMesesVigente.setBounds(288, 133, 149, 19);
		pnApolice.add(txtMesesVigente);
		
		txtMensalidade = new JTextField();
		txtMensalidade.setColumns(10);
		txtMensalidade.setBounds(288, 163, 149, 19);
		pnApolice.add(txtMensalidade);
		
		JLabel lblValorDaMensalidade = new JLabel("Valor da Mensalidade");
		lblValorDaMensalidade.setBounds(57, 166, 221, 13);
		pnApolice.add(lblValorDaMensalidade);
		
		txtDigiteOCpf = new JTextField();
		txtDigiteOCpf.setColumns(10);
		txtDigiteOCpf.setBounds(288, 192, 149, 19);
		pnApolice.add(txtDigiteOCpf);
		
		lblCpfAssegurado = new JLabel("CPF Assegurado");
		lblCpfAssegurado.setBounds(57, 195, 221, 13);
		pnApolice.add(lblCpfAssegurado);
		
		lblCpfResponsavel = new JLabel("CPF Responsavel");
		lblCpfResponsavel.setBounds(58, 221, 220, 16);
		pnApolice.add(lblCpfResponsavel);
		
		txtCpfResponsavel = new JTextField();
		txtCpfResponsavel.setColumns(10);
		txtCpfResponsavel.setBounds(288, 221, 149, 19);
		pnApolice.add(txtCpfResponsavel);
		
		lblStatus = new JLabel("Status");
		lblStatus.setBounds(58, 253, 220, 13);
		pnApolice.add(lblStatus);
		
		txtStatus = new JTextField();
		txtStatus.setColumns(10);
		txtStatus.setBounds(288, 250, 149, 19);
		pnApolice.add(txtStatus);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAOApolice meudao = new DAOApolice();
				Apolice meuApolice = new Apolice();
				meuApolice.setId(Integer.parseInt(txtId.getText()));
				meuApolice.setDataAssinatura(txtDigiteAData.getText());
				meuApolice.setMesesVigencia(Integer.parseInt(txtMesesVigente.getText()));
				meuApolice.setMensalidade(Double.parseDouble(txtMensalidade.getText()));
				meuApolice.setCpfAssegurado(txtDigiteOCpf.getText());
				meuApolice.setCpfResponsavel(txtCpfResponsavel.getText());
				meuApolice.setStatus(txtStatus.getText());
				meudao.adicionaApolice(meuApolice);
				meudao.gravaArquivoListaApolice();
				
				dispose();
			}
		});
		btnCadastrar.setBounds(406, 301, 115, 43);
		pnApolice.add(btnCadastrar);		
	}
	
	public void setParticularController(ParticularController controller) {
		this.controller = controller;
	}
} 	
