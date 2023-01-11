package bussiness.decorator;

import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.chart.title.Title;

public class SubtituloGrafico extends Decorator {

	public SubtituloGrafico(IComponente elementoDecorado) {
		super(elementoDecorado);
	}
	@Override
	public JFreeChart dadosGrafico(String valor) {
		List<Title> sub = new ArrayList<Title>();
		sub.add(new ShortTextTitle(valor)); barChart.setSubtitles(sub);

		return this.elementoDecorado.dadosGrafico();
	}
}
