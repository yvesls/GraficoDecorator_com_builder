package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bussiness.observer.Subject;
import view.SubtituloView;
import view.TituloView;

public class SubtituloPresenter extends Subject {
	private SubtituloView view;
	private int status;

	public SubtituloPresenter(SubtituloView view, int status) {
		this.view = view;
		this.configurarJanela();
		this.status = status;
	}

	public void configurarJanela() {
		this.view.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (view.getTextField().getText() != "") {
					view.getFrame().setVisible(false);
					status = 5;
					notifyObservers(5);
				}
			}
		});
	}

	public SubtituloView getView() {
		return view;
	}
}
