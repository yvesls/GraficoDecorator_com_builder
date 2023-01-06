package bussiness;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.chart.title.Title;

public class TituloEixo2Grafico extends Decorator {

	public TituloEixo2Grafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		barChart.getCategoryPlot().getDomainAxis().setLabel(valor);
		//barChart = ChartFactory.createBarChart(grafico.getTitulo(), grafico.getEixo1(), valor, dataset,
		//		grafico.getOrientacao(), grafico.isLegenda(), true, true);
		grafico.setEixo2(valor);
		return this.elementoDecorado.dadosGrafico();
	}
}
