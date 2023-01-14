package presenter;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import bussiness.builder.Diretor;
import bussiness.builder.GraficoDoencasES20Builder;
import bussiness.decorator.BaseGrafico;
import bussiness.decorator.Componente;
import bussiness.decorator.TituloGrafico;
import view.BaseGraficoView;
import view.GraficoView;

public class GraficoPresenter {
	private GraficoView view;
	private JPanel panelGrafico;
	private Componente grafico;
	private boolean isBaseGrafico;
	private BaseGraficoPresenter basePresenter;

	public GraficoPresenter(GraficoView view) {
		this.view = view;
		this.isBaseGrafico = false;
		this.configurarJanela();
		this.exibeGraficoPadrao();
	}

	public void configurarJanela() {
		this.view.getBtnFechar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getFrame().setVisible(false);
			}
		});
		this.view.getBtnRestaurarPadrao().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeGraficoPadrao();
			}
		});
		this.view.getChckbxSubttulo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					inserirDadosNovoGrafico();
				} else {
					inserirSubtitulo();
				}
			}
		});
		this.view.getChckbxTitulo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					System.out.println("ecddw");
					inserirDadosNovoGrafico();
				} else {
					inserirTitulo();
				}
			}
		});
		this.view.getChckbxTituloEixoX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					inserirDadosNovoGrafico();
				} else {
					inserirTituloEixoX();
				}
			}
		});
		this.view.getChckbxTituloEixoY().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					inserirDadosNovoGrafico();
				} else {
					inserirTituloEixoY();
				}
			}
		});
	}

	public void inserirDadosNovoGrafico() {
		BaseGraficoView window = new BaseGraficoView();
		this.basePresenter = new BaseGraficoPresenter(window);
		if(this.basePresenter.getDados() != null) {
			grafico = new BaseGrafico();
			grafico.dadosGrafico(this.basePresenter.getDados());
		}
	}

	public void inserirTitulo() {
		BaseGraficoView window = new BaseGraficoView();
		this.basePresenter = new BaseGraficoPresenter(window);
	}

	public void inserirSubtitulo() {
		BaseGraficoView window = new BaseGraficoView();
		this.basePresenter = new BaseGraficoPresenter(window);
	}

	public void inserirTituloEixoX() {
		BaseGraficoView window = new BaseGraficoView();
		this.basePresenter = new BaseGraficoPresenter(window);
	}

	public void inserirTituloEixoY() {
		BaseGraficoView window = new BaseGraficoView();
		this.basePresenter = new BaseGraficoPresenter(window);
	}

	public void exibeGraficoPadrao() {
		panelGrafico = new JPanel();
		Diretor diretor = new Diretor();
		Componente grafico = diretor.build(new GraficoDoencasES20Builder());

		JPanel pan = grafico.atributosVisuais();
		panelGrafico.add(pan);

		panelGrafico.setBounds(306, 65, 668, 543);
		view.getPanelDoGrafico().add(panelGrafico);
	}
}
