package view;

import javax.swing.JFrame;

public class EixoYView {

	private JFrame frame;

	public EixoYView() {
		this.frame = new JFrame();
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
