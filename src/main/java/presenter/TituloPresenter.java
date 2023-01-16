package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bussiness.observer.Subject;
import view.TituloView;

public class TituloPresenter extends Subject {
	private TituloView view;
	private int status;

	public TituloPresenter(TituloView view, int status) {
		this.view = view;
		this.configurarJanela();
		this.status = status;
	}

	public void configurarJanela() {
		this.view.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (view.getTextField().getText() != "") {
					view.getFrame().setVisible(false);
					status = 2;
					notifyObservers(2);
				}
			}
		});
	}

	public TituloView getView() {
		return view;
	}
}
