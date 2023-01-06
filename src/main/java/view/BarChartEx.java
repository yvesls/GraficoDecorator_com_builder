package view;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChartEx  extends JPanel {
	public BarChartEx() {

		initUI();
	}
	
	/*
	 * Componente grafico = new grafico(); // createChart(); 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	private void initUI() {

		CategoryDataset dataset = createDataset();

		JFreeChart chart = createChart(dataset);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setBorder(BorderFactory.createEmptyBorder(10, 190, 250, 200));
		chartPanel.setBackground(Color.white);
		add(chartPanel);
	}

	private CategoryDataset createDataset() {
		int covid = 0, insufResp = 0, pneumonia = 0, septicemia = 0, sars = 0;
		try {
			FileReader fr;
			fr = new FileReader("obtos-por-doencas-respiratorias-ES-2020.csv");
			BufferedReader bf;

			bf = new BufferedReader(fr);
			String linha = bf.readLine();
			linha = bf.readLine();
			System.out.println(linha);
			int x = 1;
			while (x < 13) {
				String[] dados = linha.split(",");
				if (x == 12) {
					covid = Integer.parseInt(dados[2]);
					insufResp = Integer.parseInt(dados[4]);
					pneumonia = Integer.parseInt(dados[6]);
					septicemia = Integer.parseInt(dados[7]);
					sars = Integer.parseInt(dados[8]);

				}

				x++;
				linha = bf.readLine();
			}
			var dataset = new DefaultCategoryDataset();
			dataset.setValue(covid, "Mortes", "Covid");
			dataset.setValue(insufResp, "Mortes", "Insuficiência Respiratória");
			dataset.setValue(pneumonia, "Mortes", "Pneumonia");
			dataset.setValue(septicemia, "Mortes", "Septicemia");
			dataset.setValue(sars, "Mortes", "Sars");
			return dataset;
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo");
			System.out.println("Working Directory = " + System.getProperty("user.dir"));
			e.printStackTrace();
			return null;
		}
	}

	private JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart barChart = ChartFactory.createBarChart("Óbtos por doencas respiratorias no ES em 2020", "Doenças", "Quantidade de mortes", dataset,
				PlotOrientation.VERTICAL, false, false, false);
		
		return barChart;
	}
}
