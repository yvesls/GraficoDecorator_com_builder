package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class GraficoView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraficoView window = new GraficoView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		frame.setBounds(100, 100, 867, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(234, 234, 234));
		panel_1.setBounds(21, 32, 275, 483);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elementos Gráficos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(65, 11, 141, 20);
		panel_1.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Título");
		chckbxNewCheckBox.setBackground(new Color(234, 234, 234));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(20, 38, 232, 38);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxSubttulo = new JCheckBox("Subtítulo");
		chckbxSubttulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSubttulo.setBackground(new Color(234, 234, 234));
		chckbxSubttulo.setBounds(20, 79, 232, 38);
		panel_1.add(chckbxSubttulo);
		
		JCheckBox chckbxTtuloDosEixos = new JCheckBox("Título dos eixos");
		chckbxTtuloDosEixos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxTtuloDosEixos.setBackground(new Color(234, 234, 234));
		chckbxTtuloDosEixos.setBounds(20, 120, 232, 38);
		panel_1.add(chckbxTtuloDosEixos);
		
		JCheckBox chckbxRtulosDosDados = new JCheckBox("Rótulos dos dados (%)");
		chckbxRtulosDosDados.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRtulosDosDados.setBackground(new Color(234, 234, 234));
		chckbxRtulosDosDados.setBounds(20, 161, 232, 38);
		panel_1.add(chckbxRtulosDosDados);
		
		JCheckBox chckbxRtulosDeDados = new JCheckBox("Rótulos de dados - Valor");
		chckbxRtulosDeDados.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRtulosDeDados.setBackground(new Color(234, 234, 234));
		chckbxRtulosDeDados.setBounds(20, 202, 232, 38);
		panel_1.add(chckbxRtulosDeDados);
		
		JCheckBox chckbxRtulosDeDados_1 = new JCheckBox("Rótulos de dados - Valor (%)");
		chckbxRtulosDeDados_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRtulosDeDados_1.setBackground(new Color(234, 234, 234));
		chckbxRtulosDeDados_1.setBounds(20, 243, 232, 38);
		panel_1.add(chckbxRtulosDeDados_1);
		
		JCheckBox chckbxCorDasBarras = new JCheckBox("Cor das barras");
		chckbxCorDasBarras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCorDasBarras.setBackground(new Color(234, 234, 234));
		chckbxCorDasBarras.setBounds(20, 284, 232, 38);
		panel_1.add(chckbxCorDasBarras);
		
		JCheckBox chckbxCorDasBarras_1 = new JCheckBox("Cor das barras (por grupo) ");
		chckbxCorDasBarras_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCorDasBarras_1.setBackground(new Color(234, 234, 234));
		chckbxCorDasBarras_1.setBounds(20, 325, 232, 38);
		panel_1.add(chckbxCorDasBarras_1);
		
		JCheckBox chckbxCorDasBarras_1_1 = new JCheckBox("Grade");
		chckbxCorDasBarras_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCorDasBarras_1_1.setBackground(new Color(234, 234, 234));
		chckbxCorDasBarras_1_1.setBounds(20, 366, 232, 38);
		panel_1.add(chckbxCorDasBarras_1_1);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(740, 492, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Gráfico padrão:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(592, 32, 100, 22);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(696, 32, 133, 22);
		panel.add(comboBox);
		
		JButton btnRestaurarPadro = new JButton("Restaurar padrão");
		btnRestaurarPadro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRestaurarPadro.setBounds(566, 492, 145, 23);
		panel.add(btnRestaurarPadro);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(318, 71, 511, 404);
		panel.add(panel_2);
	}
}
