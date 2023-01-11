package bussiness.decorator;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BaseGrafico extends Componente {
	
	@Override
	public JFreeChart dadosGrafico(ArrayList<String[]> valor) {
		dataset = new DefaultCategoryDataset();
		this.setValueDataSet(valor);
		
		//System.out.println(grafico.toString());
		barChart = ChartFactory.createBarChart( "", "", "", dataset,
				PlotOrientation.VERTICAL, true, true, true);
		return barChart;
	}

	@Override
	public JPanel atributosVisuais() {
		chartPanel = new ChartPanel(dadosGrafico());
		chartPanel.setBorder(BorderFactory.createEmptyBorder(10, 190, 230, 200));
		return chartPanel;
	}
	
	public void setValueDataSet(ArrayList<String[]> dados) {
		for(String[] dado : dados) {
			dataset.setValue(Integer.valueOf(dado[0]), dado[1], dado[2]);
		}
	}

	@Override
	public JFreeChart dadosGrafico(String valor) {
		return barChart;
	}

	@Override
	public JFreeChart dadosGrafico(boolean valor) {
		return barChart;
	}

	@Override
	public JFreeChart dadosGrafico(PlotOrientation valor) {
		return barChart;
	}

	@Override
	public JFreeChart dadosGrafico() {
		return barChart;
	}

}
