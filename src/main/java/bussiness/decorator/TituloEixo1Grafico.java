package bussiness.decorator;

import org.jfree.chart.JFreeChart;

public class TituloEixo1Grafico extends Decorator {

	public TituloEixo1Grafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		/* retorna a lista de categorias dos dados
		 * barChart.getCategoryPlot().getCategories() 
		 * */
		/* seta a localização do eixo inferior
		 * barChart.getCategoryPlot().setDomainAxisLocation(AxisLocation.TOP_OR_LEFT);
		 * */
		/* seta a orientação do gráfico
		 * barChart.getCategoryPlot().setOrientation(PlotOrientation orientation)
		 * */
		/* modifica a orientação dos nomes dos dados
		 * barChart.getCategoryPlot().getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		 * */
		barChart.getCategoryPlot().getRangeAxis().setLabel(valor);
		
		/* define a posição do titulo do eixo inferior 
		 * barChart.getCategoryPlot().getDomainAxis().setLabelLocation(AxisLabelLocation.HIGH_END);
		 */
		return this.elementoDecorado.dadosGrafico();
	}
}
