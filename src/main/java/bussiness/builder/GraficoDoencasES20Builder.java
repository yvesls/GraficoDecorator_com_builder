package bussiness.builder;

import java.util.ArrayList;
import bussiness.decorator.BaseGrafico;
import bussiness.decorator.SubtituloGrafico;
import bussiness.decorator.TituloEixo1Grafico;
import bussiness.decorator.TituloEixo2Grafico;
import bussiness.decorator.TituloGrafico;

public class GraficoDoencasES20Builder extends GraficoBuilder{ 
	
	@Override
	public void criaGrafico() {
		this.grafico = new BaseGrafico();
		ArrayList<String[]> dados = new ArrayList<>();
		String[] p1 = { "5229", "Mortes", "Covid" };
		String[] p2 = { "1376", "Mortes", "insuficiência respiratória" };
		String[] p3 = { "3828", "Mortes", "pneumonia" };
		String[] p4 = { "3411", "Mortes", "septicemia" };
		String[] p5 = { "341", "Mortes", "sars" };
		String[] p6 = { "12887", "Mortes", "outras causas" };
		dados.add(p1);
		dados.add(p2);
		dados.add(p3);
		dados.add(p4);
		dados.add(p5);
		dados.add(p6);
		this.grafico.dadosGrafico(dados);
	}

	@Override
	public void addSubtitulo() {
		this.grafico = new SubtituloGrafico(this.grafico);
		this.grafico.dadosGrafico("Doenças respiratórias e o surgimento do covid-19 em relação à outros tipos de mortes no ano.");
	}

	@Override
	public void addTituloEixo1() {
		this.grafico = new TituloEixo1Grafico(this.grafico);
		this.grafico.dadosGrafico("Doenças");
	}

	@Override
	public void addTituloEixo2() {
		this.grafico = new TituloEixo2Grafico(this.grafico);
		this.grafico.dadosGrafico("Quantidade de óbitos");
	}

	@Override
	public void addTitulo() {
		this.grafico = new TituloGrafico(this.grafico);
		this.grafico.dadosGrafico("Causas de mortes no estado do Espírito Santo no ano de 2020");
	}
}
