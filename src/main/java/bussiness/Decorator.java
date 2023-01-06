package bussiness;

import java.util.ArrayList;

import javax.swing.JPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class Decorator extends Componente {
	
    protected IComponente elementoDecorado;

    public Decorator(IComponente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }
    
	@Override
	public JFreeChart dadosGrafico(ArrayList<String[]> valor) {
		return this.elementoDecorado.dadosGrafico(valor);
	}

	public JFreeChart dadosGrafico(String valor) {
		return this.elementoDecorado.dadosGrafico(valor);
	}

	public JFreeChart dadosGrafico(PlotOrientation valor) {
		return this.elementoDecorado.dadosGrafico(valor);
	}

	public JFreeChart dadosGrafico(boolean valor) {
		return this.elementoDecorado.dadosGrafico(valor);
	}

	public JFreeChart dadosGrafico() {
		return this.elementoDecorado.dadosGrafico();
	}

	public JPanel atributosVisuais() {
		return this.elementoDecorado.atributosVisuais();
	}
    
}
