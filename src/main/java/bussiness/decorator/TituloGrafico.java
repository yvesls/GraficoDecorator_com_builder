package bussiness.decorator;

import org.jfree.chart.JFreeChart;

public class TituloGrafico extends Decorator {

	public TituloGrafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		barChart.setTitle(valor);
		return this.elementoDecorado.dadosGrafico();
	}
}
