package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bussiness.observer.Subject;
import view.EixoYView;
import view.TituloView;

public class EixoYPresenter extends Subject {
	private EixoYView view;
	private int status;

	/**
	 * @yves
	 */
	public EixoYPresenter(EixoYView view, int status) {
		this.view = view;
		this.configurarJanela();
		this.status = status;
	}

	public void configurarJanela() {
		this.view.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (view.getTextField().getText() != "") {
					view.getFrame().setVisible(false);
					status = 4;
					notifyObservers(4);
				}
			}
		});
	}

	/**
	 * @yves
	 */
	public EixoYView getView() {
		return view;
	}
}
