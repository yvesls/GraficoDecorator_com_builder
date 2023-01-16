package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import bussiness.observer.Subject;
import view.BaseGraficoDadoView;
import view.BaseGraficoView;

public class BaseGraficoPresenter extends Subject {
	private BaseGraficoView view;
	private BaseGraficoDadoPresenter dadoPresenter;
	private ArrayList<String[]> dados;
	private boolean temNovoDAdicionado;
	private int status;

	public BaseGraficoPresenter(BaseGraficoView view, int status) {
		this.view = view;
		this.configurarJanela();
		this.dados = new ArrayList<>();
		this.temNovoDAdicionado = false;
		this.status = status;
	}

	public void configurarJanela() {
		this.view.getBtnAdicionarDado().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!temNovoDAdicionado) {
					BaseGraficoDadoView window = new BaseGraficoDadoView();
					dadoPresenter = new BaseGraficoDadoPresenter(window);
					temNovoDAdicionado = true;
				}
			}
		});

		this.view.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getFrame().setVisible(false);
				status = 1;
				notifyObservers(1);
			}
		});

		this.view.getBtnAtualizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (temNovoDAdicionado) {
					String[] lista = { dadoPresenter.getDados().get(0), dadoPresenter.getDados().get(1),
							dadoPresenter.getDados().get(2) };
					dados.add(lista);
					inserirNaTabela(dadoPresenter.getDados());
					temNovoDAdicionado = false;
				}
			}
		});
	}

	public void inserirNaTabela(ArrayList<String> dadosP) {
		this.view.getModel().addRow(new Object[] { dadosP.get(0), dadosP.get(1), dadosP.get(2) });
	}

	public ArrayList<String[]> getDados() {
		return dados;
	}
}
