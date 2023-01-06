package bussiness;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class TituloGrafico extends Decorator {

	public TituloGrafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		barChart.setTitle(valor);
		grafico.setTitulo(valor);
		//System.out.println(grafico.toString());
		return this.elementoDecorado.dadosGrafico();
	}
}
