package bussiness.decorator;

import org.jfree.chart.JFreeChart;

public class TituloEixo2Grafico extends Decorator {

	public TituloEixo2Grafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		barChart.getCategoryPlot().getDomainAxis().setLabel(valor);
		return this.elementoDecorado.dadosGrafico();
	}
}
