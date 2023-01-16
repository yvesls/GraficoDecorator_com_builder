package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TituloView {

	private JFrame frame;
	private JTextField textField;
	private JButton btnConfirmar;
	

	public TituloView() {
		initialize();
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Título:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(63, 75, 49, 14);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(63, 100, 313, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirmar.setBounds(276, 136, 100, 23);
		frame.getContentPane().add(btnConfirmar);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}
}
