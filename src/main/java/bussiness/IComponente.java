package bussiness;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public interface IComponente {
	
	JFreeChart dadosGrafico();
	JFreeChart dadosGrafico(String valor);
	JFreeChart dadosGrafico(boolean valor);
	JFreeChart dadosGrafico(PlotOrientation valor);
	JFreeChart dadosGrafico(ArrayList<String[]> valor);
	JPanel atributosVisuais();
	
}
