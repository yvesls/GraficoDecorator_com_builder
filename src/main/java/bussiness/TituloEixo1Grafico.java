package bussiness;

import org.jfree.chart.JFreeChart;

public class TituloEixo1Grafico extends Decorator {

	public TituloEixo1Grafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		barChart.getCategoryPlot().getDomainAxisForDataset(2).setLabel(valor);;
		//System.out.println(barChart.getCategoryPlot().getDomainAxis(0).getLabel());
		//ChartFactory.
		System.out.println(barChart.getCategoryPlot().getDomainAxisForDataset(20).getLabel());
		/* Criar um para subtítulos
		 * List<Title> sub = new ArrayList<Title>();
		sub.add(new ShortTextTitle(valor));
		barChart.setSubtitles(sub);*/
		
		//barChart = ChartFactory.createBarChart(grafico.getTitulo(), valor, grafico.getEixo2(), dataset,
		//		grafico.getOrientacao(), grafico.isLegenda(), true, true);
		grafico.setEixo1(valor);
		return this.elementoDecorado.dadosGrafico();
	}
}
