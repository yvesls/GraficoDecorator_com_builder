package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import bussiness.builder.Diretor;
import bussiness.builder.GraficoDoencasES20Builder;
import bussiness.decorator.Componente;
import view.GraficoView;

public class GraficoPresenter {
	private GraficoView view;
	private JPanel panelGrafico;
	private Componente grafico;
	private boolean isBaseGrafico;

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
				}else {
					inserirSubtitulo();
				}
			}
		});
		this.view.getChckbxTitulo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					inserirDadosNovoGrafico();
				}else {
					inserirTitulo();
				}
			}
		});
		this.view.getChckbxTituloEixoX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					inserirDadosNovoGrafico();
				}else {
					inserirTituloEixoX();
				}
			}
		});
		this.view.getChckbxTituloEixoY().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isBaseGrafico) {
					inserirDadosNovoGrafico();
				}else {
					inserirTituloEixoY();
				}
			}
		});
	}
	
	public void inserirDadosNovoGrafico() {
		/* chamar uma nova view com novo presenter para criar um novo gráfico.
		*  esse presenter deve retornar o gráfico-base para que o gráfico deste presenter seja iniciado.
		*/
	}
	
	public void inserirTitulo() {
		/* chamar uma nova view com novo presenter para criar um novo gráfico.
		*  esse presenter deve receber o gráfico do presenter principal e retornar o gráfico criado para que o gráfico deste presenter seja iniciado.
		*/
	}

	public void inserirSubtitulo() {
		/* Idem ao anterior
		 * */
	}
	
	public void inserirTituloEixoX() {
		/* Idem ao anterior
		 * */
	}
	
	public void inserirTituloEixoY() {
		/* Idem ao anterior
		 * */
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
