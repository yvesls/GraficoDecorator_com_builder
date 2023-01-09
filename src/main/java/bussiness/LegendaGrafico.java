package bussiness;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.LegendTitle;

public class LegendaGrafico extends Decorator {

	public LegendaGrafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(boolean valor) {
		//barChart = ChartFactory.createBarChart(grafico.getTitulo(), grafico.getEixo1(), grafico.getEixo2(), dataset,
		//		grafico.getOrientacao(), valor, true, true);
		grafico.setLegenda(valor);
		barChart.getLegend().setVisible(valor);
		//barChart.getLegend().setVisible(valor);
		
		//ChartFactory.
		
		return this.elementoDecorado.dadosGrafico();
	}
}
