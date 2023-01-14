package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BaseGraficoView {

	private JFrame frame;
	private JButton btnConfirmar;
	private DefaultTableModel model;
	private JButton btnAdicionarDado;
	private JButton btnAtualizar;
	
	public BaseGraficoView() {
		initialize();
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblnew = new JLabel("Insira os dados do gráfico que deseja construir antes de adicionar ");
		lblnew.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnew.setBounds(10, 11, 414, 20);
		frame.getContentPane().add(lblnew);

		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirmar.setBounds(324, 227, 100, 23);
		frame.getContentPane().add(btnConfirmar);

		JLabel lblNewLabel = new JLabel("o atributo.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 30, 74, 14);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 414, 170);
		frame.getContentPane().add(scrollPane);

		JTable table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model = new DefaultTableModel();
		Object[] column = { "Valor", "Categoria", "Descrição" };
		// Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		btnAdicionarDado = new JButton("Adicionar dado");
		btnAdicionarDado.setBounds(137, 229, 119, 23);
		frame.getContentPane().add(btnAdicionarDado);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(10, 229, 119, 23);
		frame.getContentPane().add(btnAtualizar);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public JButton getBtnAdicionarDado() {
		return btnAdicionarDado;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}
}
