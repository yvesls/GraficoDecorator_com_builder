package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bussiness.observer.Subject;
import view.EixoXView;
import view.TituloView;

public class EixoXPresenter extends Subject {
	private EixoXView view;
	private int status;

	public EixoXPresenter(EixoXView view, int status) {
		this.view = view;
		this.configurarJanela();
		this.status = status;
	}

	public void configurarJanela() {
		this.view.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (view.getTextField().getText() != "") {
					view.getFrame().setVisible(false);
					status = 3;
					notifyObservers(3);
				}
			}
		});
	}

	public EixoXView getView() {
		return view;
	}
}
