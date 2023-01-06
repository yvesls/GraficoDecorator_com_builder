package bussiness;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import model.Grafico;

public abstract class Componente implements IComponente {
	protected static Grafico grafico;
	protected static DefaultCategoryDataset dataset;
	protected static JFreeChart barChart;
	protected static ChartPanel chartPanel;
	
	public Componente() {
		grafico = new Grafico();
    }
	
	public abstract JFreeChart dadosGrafico(ArrayList<String[]> valor);
	public abstract JFreeChart dadosGrafico(String valor);
	public abstract JFreeChart dadosGrafico(boolean valor);
	public abstract JFreeChart dadosGrafico(PlotOrientation valor);
	
	public abstract JPanel atributosVisuais();
}
