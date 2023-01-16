package presenter;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JPanel;

import org.jfree.chart.plot.PlotOrientation;

import bussiness.builder.Diretor;
import bussiness.builder.GraficoDoencasES20Builder;
import bussiness.decorator.BaseGrafico;
import bussiness.decorator.Componente;
import bussiness.decorator.OrientacaoGrafico;
import bussiness.decorator.SubtituloGrafico;
import bussiness.decorator.TituloEixo1Grafico;
import bussiness.decorator.TituloEixo2Grafico;
import bussiness.decorator.TituloGrafico;
import bussiness.observer.Observer;
import view.BaseGraficoView;
import view.EixoXView;
import view.EixoYView;
import view.GraficoView;
import view.SubtituloView;
import view.TituloView;

public class GraficoPresenter implements Observer {
	private GraficoView view;
	private JPanel panelGrafico;
	private Componente grafico;
	private boolean isBaseGrafico;
	private BaseGraficoPresenter basePresenter;
	private TituloPresenter tituloPresenter;
	private EixoXPresenter eixoXPresenter;
	private EixoYPresenter eixoYPresenter;
	private SubtituloPresenter subtituloPresenter;
	private int status;

	public GraficoPresenter(GraficoView view) {
		this.view = view;
		this.isBaseGrafico = false;
		this.configurarJanela();
		this.exibeGraficoPadrao();
		this.status = 0;
	}

	public void configurarJanela() {
		this.view.getComboBox().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirOrientacao();
			}
		});
		this.view.getBtnFechar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getFrame().setVisible(false);
			}
		});
		this.view.getBtnRestaurarPadrao().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setEnabledAllChckbx();
				view.getPanelDoGrafico().remove(panelGrafico);
				panelGrafico.removeAll();
				exibeGraficoPadrao();
				isBaseGrafico = false;
			}
		});
		this.view.getChckbxSubttulo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getChckbxSubttulo().setEnabled(false);
				if (!isBaseGrafico) {
					inserirSubtitulo();
					inserirDadosNovoGrafico();
					isBaseGrafico = true;
				} else {
					inserirSubtitulo();
				}
			}
		});
		this.view.getChckbxTitulo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getChckbxTitulo().setEnabled(false);
				if (!isBaseGrafico) {
					inserirTitulo();
					inserirDadosNovoGrafico();
					isBaseGrafico = true;
					
				} else {
					inserirTitulo();
				}
			}
		});
		this.view.getChckbxTituloEixoX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getChckbxTituloEixoX().setEnabled(false);
				if (!isBaseGrafico) {
					inserirTituloEixoX();
					inserirDadosNovoGrafico();
					isBaseGrafico = true;
				} else {
					inserirTituloEixoX();
				}
			}
		});
		this.view.getChckbxTituloEixoY().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getChckbxTituloEixoY().setEnabled(false);
				if (!isBaseGrafico) {
					inserirTituloEixoY();
					inserirDadosNovoGrafico();
					isBaseGrafico = true;
				} else {
					inserirTituloEixoY();
				}
			}
		});
	}
	
	public void setEnabledAllChckbx() {
		view.getChckbxSubttulo().setEnabled(true);
		view.getChckbxTitulo().setEnabled(true);
		view.getChckbxTituloEixoY().setEnabled(true);
		view.getChckbxTituloEixoX().setEnabled(true);
	}

	public void inserirDadosNovoGrafico() {
		BaseGraficoView window = new BaseGraficoView();
		this.basePresenter = new BaseGraficoPresenter(window, this.status);
		this.basePresenter.add(this);
	}

	public void inserirTitulo() {
		TituloView window = new TituloView();
		this.tituloPresenter = new TituloPresenter(window, this.status);
		this.tituloPresenter.add(this);
	}

	public void inserirSubtitulo() {
		SubtituloView window = new SubtituloView();
		this.subtituloPresenter = new SubtituloPresenter(window, this.status);
		this.subtituloPresenter.add(this);
	}

	public void inserirTituloEixoX() {
		EixoXView window = new EixoXView();
		this.eixoXPresenter = new EixoXPresenter(window, this.status);
		this.eixoXPresenter.add(this);
	}

	public void inserirTituloEixoY() {
		EixoYView window = new EixoYView();
		this.eixoYPresenter = new EixoYPresenter(window, this.status);
		this.eixoYPresenter.add(this);
	}

	public void exibeGraficoPadrao() {
		panelGrafico = new JPanel();
		Diretor diretor = new Diretor();
		grafico = diretor.build(new GraficoDoencasES20Builder());

		JPanel pan = grafico.atributosVisuais();
		panelGrafico.add(pan);

		panelGrafico.setBounds(306, 65, 668, 543);
		view.getPanelDoGrafico().add(panelGrafico);
	}
	
	public void inserirOrientacao() {
		this.grafico = new OrientacaoGrafico(grafico);
		if(this.view.getComboBox().getSelectedItem() == "Vertical") {
			this.grafico.dadosGrafico(PlotOrientation.VERTICAL);
		}else if(this.view.getComboBox().getSelectedItem() == "Horizontal") {
			this.grafico.dadosGrafico(PlotOrientation.HORIZONTAL);
		}
		
	}

	@Override
	public void update(int status) {
		System.out.println(status);
		if (status == 1) {
			if (this.basePresenter.getDados() != null) {
				this.view.getPanelDoGrafico().remove(this.panelGrafico);
				this.panelGrafico.removeAll();
				
				this.panelGrafico = new JPanel();
				this.grafico = new BaseGrafico();
				this.grafico.dadosGrafico(this.basePresenter.getDados());
				
				JPanel pan = grafico.atributosVisuais();
				panelGrafico.setBounds(306, 65, 668, 543);
				this.panelGrafico.add(pan);
				view.getPanelDoGrafico().add(panelGrafico);
			}
		}else if(status == 2) {
			grafico = new TituloGrafico(grafico);
			grafico.dadosGrafico(this.tituloPresenter.getView().getTextField().getText());
		}else if(status == 3) {
			grafico = new TituloEixo2Grafico(grafico);
			grafico.dadosGrafico(this.eixoXPresenter.getView().getTextField().getText());
		}else if(status == 4) {
			grafico = new TituloEixo1Grafico(grafico);
			grafico.dadosGrafico(this.eixoYPresenter.getView().getTextField().getText());
		}else if(status == 5) {
			grafico = new SubtituloGrafico(grafico);
			grafico.dadosGrafico(this.subtituloPresenter.getView().getTextField().getText());
		}
	}
}
