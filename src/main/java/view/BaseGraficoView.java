package view;

import javax.swing.JFrame;

public class BaseGraficoView {

	private JFrame frame;

	public BaseGraficoView() {
		this.frame = new JFrame();
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
