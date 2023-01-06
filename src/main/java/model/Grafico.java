package model;

import java.util.ArrayList;

import org.jfree.chart.plot.PlotOrientation;

public class Grafico {
	private String titulo;
	private String eixo1;
	private String eixo2;
	private ArrayList<String[]> dados;
	private PlotOrientation orientacao;
	private boolean isLegenda;
	
	public Grafico() {
		titulo = "";
		eixo1 = "";
		eixo2 = "";
		dados = new ArrayList<>();
		orientacao = PlotOrientation.VERTICAL;
		isLegenda = false;
	}

	@Override
	public String toString() {
		return "Grafico [titulo=" + titulo + ", eixo1=" + eixo1 + ", eixo2=" + eixo2 + ", dados=" + dados
				+ ", orientacao=" + orientacao + ", isLegenda=" + isLegenda + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEixo1() {
		return eixo1;
	}

	public void setEixo1(String eixo1) {
		this.eixo1 = eixo1;
	}

	public String getEixo2() {
		return eixo2;
	}

	public void setEixo2(String eixo2) {
		this.eixo2 = eixo2;
	}

	public ArrayList<String[]> getDados() {
		return dados;
	}

	public void setDados(ArrayList<String[]> dados) {
		this.dados = dados;
	}

	public PlotOrientation getOrientacao() {
		return orientacao;
	}

	public void setOrientacao(PlotOrientation orientacao) {
		this.orientacao = orientacao;
	}

	public boolean isLegenda() {
		return isLegenda;
	}

	public void setLegenda(boolean isLegenda) {
		this.isLegenda = isLegenda;
	}
}
