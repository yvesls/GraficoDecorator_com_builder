package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TituloView;

public class TituloPresenter {
	private TituloView view;

	public TituloPresenter(TituloView view) {
		this.view = view;
		this.configurarJanela();
	}

	public void configurarJanela() {
		this.view.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (view.getTextField().getText() != "") {
					
					view.getFrame().setVisible(false);
				}
			}
		});
	}
}
