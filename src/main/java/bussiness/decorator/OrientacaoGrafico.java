package bussiness.decorator;

import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.chart.title.Title;

public class OrientacaoGrafico extends Decorator {
	public OrientacaoGrafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}
	@Override
	public JFreeChart dadosGrafico(PlotOrientation valor) {
		barChart.getCategoryPlot().setOrientation(valor);
		
		return this.elementoDecorado.dadosGrafico();
	}
}
