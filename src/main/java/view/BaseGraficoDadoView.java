package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BaseGraficoDadoView {

	private JFrame frameAdiciona;
	private JTextField textValor1;
	private JTextField textCategoria1;
	private JTextField textNome1;
	private JButton btnMais;

	public BaseGraficoDadoView() {
		initialize();
		
		frameAdiciona.setBounds(100, 100, 450, 163);
		frameAdiciona.setVisible(true);
		frameAdiciona.getContentPane().setLayout(null);

		textValor1 = new JTextField();
		textValor1.setBounds(31, 61, 100, 20);
		frameAdiciona.getContentPane().add(textValor1);
		textValor1.setColumns(10);

		textCategoria1 = new JTextField();
		textCategoria1.setBounds(141, 61, 100, 20);
		frameAdiciona.getContentPane().add(textCategoria1);
		textCategoria1.setColumns(10);

		textNome1 = new JTextField();
		textNome1.setColumns(10);
		textNome1.setBounds(251, 61, 100, 20);
		frameAdiciona.getContentPane().add(textNome1);

		btnMais = new JButton("+");
		btnMais.setBounds(361, 60, 52, 23);
		frameAdiciona.getContentPane().add(btnMais);

		JLabel lblNewLabel_1 = new JLabel("Valor ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 36, 100, 20);
		frameAdiciona.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Categoria");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(141, 36, 100, 20);
		frameAdiciona.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Nome");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(251, 36, 100, 20);
		frameAdiciona.getContentPane().add(lblNewLabel_1_1_1);
	}

	private void initialize() {
		frameAdiciona = new JFrame();
	}

	public JFrame getFrameAdiciona() {
		return frameAdiciona;
	}

	public JTextField getTextValor1() {
		return textValor1;
	}

	public JTextField getTextCategoria1() {
		return textCategoria1;
	}

	public JTextField getTextNome1() {
		return textNome1;
	}

	public JButton getBtnMais() {
		return btnMais;
	}
}
