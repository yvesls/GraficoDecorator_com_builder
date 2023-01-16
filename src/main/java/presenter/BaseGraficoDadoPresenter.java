package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import bussiness.observer.Subject;
import view.BaseGraficoDadoView;

public class BaseGraficoDadoPresenter {
	private BaseGraficoDadoView view;
	private ArrayList<String> dados;

	public BaseGraficoDadoPresenter(BaseGraficoDadoView view) {
		this.view = view;
		this.configurarJanela();
		this.dados = new ArrayList<>();
	}

	public void configurarJanela() {
		this.view.getBtnMais().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!view.getTextValor1().getText().equals("") && !view.getTextCategoria1().getText().equals("") && !view.getTextNome1().getText().equals("")) {
					dados.add(view.getTextValor1().getText());
					dados.add(view.getTextCategoria1().getText());
					dados.add(view.getTextNome1().getText());
					view.getFrameAdiciona().setVisible(false);
				}
			}
		});
	}
	
	public ArrayList<String> getDados() {
		return dados;
	}
	
}
