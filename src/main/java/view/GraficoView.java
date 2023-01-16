package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import presenter.GraficoPresenter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

public class GraficoView {
	// link contendo a fonte de dados utilizada:
	// https://brasil.io/dataset/covid19/files/
	// link contendo o tutorial de gráfico de barras
	// https://zetcode.com/java/jfreechart/

	private JFrame frame;
	private JCheckBox chckbxTitulo;
	private JCheckBox chckbxSubttulo;
	private JCheckBox chckbxTituloEixoY;
	private JCheckBox chckbxTituloEixoX;
	private JButton btnFechar;
	private JComboBox comboBox;
	private JButton btnRestaurarPadrao;
	private JPanel panelDoGrafico;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				GraficoView window = new GraficoView();
				window.frame.setVisible(true);
				new GraficoPresenter(window);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GraficoView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 30, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(234, 234, 234));
		panel_1.setBounds(21, 32, 275, 576);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Elementos Gráficos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(65, 11, 141, 20);
		panel_1.add(lblNewLabel);

		chckbxTitulo = new JCheckBox("Título");
		chckbxTitulo.setBackground(new Color(234, 234, 234));
		chckbxTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxTitulo.setBounds(20, 38, 232, 38);
		panel_1.add(chckbxTitulo);

		chckbxSubttulo = new JCheckBox("Subtítulo");
		chckbxSubttulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSubttulo.setBackground(new Color(234, 234, 234));
		chckbxSubttulo.setBounds(20, 79, 232, 38);
		panel_1.add(chckbxSubttulo);

		chckbxTituloEixoY = new JCheckBox("Título do eixo horizontal");
		chckbxTituloEixoY.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxTituloEixoY.setBackground(new Color(234, 234, 234));
		chckbxTituloEixoY.setBounds(20, 120, 232, 38);
		panel_1.add(chckbxTituloEixoY);

		chckbxTituloEixoX = new JCheckBox("Título do eixo vertical");
		chckbxTituloEixoX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxTituloEixoX.setBackground(new Color(234, 234, 234));
		chckbxTituloEixoX.setBounds(20, 161, 232, 38);
		panel_1.add(chckbxTituloEixoX);

		btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFechar.setBounds(885, 627, 89, 23);
		panel.add(btnFechar);

		JLabel lblNewLabel_1 = new JLabel("Gráfico padrão:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(729, 32, 100, 22);
		panel.add(lblNewLabel_1);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vertical", "Horizontal"}));
		comboBox.setBounds(839, 32, 133, 22);
		panel.add(comboBox);

		btnRestaurarPadrao = new JButton("Restaurar padrão");
		btnRestaurarPadrao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRestaurarPadrao.setBounds(706, 627, 145, 23);
		panel.add(btnRestaurarPadrao);

		panelDoGrafico = new JPanel();
		panelDoGrafico.setBounds(306, 65, 668, 543);
		panel.add(panelDoGrafico);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JCheckBox getChckbxTitulo() {
		return chckbxTitulo;
	}

	public JCheckBox getChckbxSubttulo() {
		return chckbxSubttulo;
	}

	public JCheckBox getChckbxTituloEixoY() {
		return chckbxTituloEixoY;
	}

	public JCheckBox getChckbxTituloEixoX() {
		return chckbxTituloEixoX;
	}

	public JButton getBtnFechar() {
		return btnFechar;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JButton getBtnRestaurarPadrao() {
		return btnRestaurarPadrao;
	}

	public JPanel getPanelDoGrafico() {
		return panelDoGrafico;
	}
}
