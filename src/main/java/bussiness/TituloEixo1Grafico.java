package bussiness;

import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLabelLocation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.ui.RectangleInsets;

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
		grafico.setEixo1(valor);
		return this.elementoDecorado.dadosGrafico();
	}
}
