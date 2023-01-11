package bussiness.builder;

import bussiness.decorator.Componente;

public class Diretor {
	public Componente build(GraficoBuilder builder) {
		builder.criaGrafico();
		builder.addTitulo();
		builder.addSubtitulo();
		builder.addTituloEixo1();
		builder.addTituloEixo2();
		return builder.getGrafico();
	}
}
