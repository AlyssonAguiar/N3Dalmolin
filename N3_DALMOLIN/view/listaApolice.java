package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.ParticularController;
import model.Apolice;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class listaApolice extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ParticularController apoliceController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaApolice frame = new listaApolice();
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
	public listaApolice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 416, 243);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

		mostrar();
	}
	
	void mostrar() {
		DefaultTableModel tabela = new DefaultTableModel();
		String titulos [] = { "Indice", "Id Apolice", "Data Assinatura", "Meses Vigencia",
				"Mensalidade", "CPF Assegurado", "CPF Responsavel", "Status"};
		tabela.setColumnIdentifiers(titulos);
		int indice = 1;
		for (Apolice a : apoliceController.getListaApolice()) {
			tabela.addRow(new Object[] {
					Integer.toString(indice),
					Integer.toString(a.getId()),
					a.getDataAssinatura(),
					Integer.toString(a.getMesesVigencia()),
					a.getMensalidade(),
					a.getCpfAssegurado(),
					a.getCpfResponsavel(),
					a.getStatus()					
			});
			indice++;
		}
		table.setModel(tabela);
	}
		
}
