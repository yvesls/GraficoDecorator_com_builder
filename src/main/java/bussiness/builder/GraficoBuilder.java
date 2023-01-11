package bussiness.builder;

import bussiness.decorator.Componente;

public abstract class GraficoBuilder {
	protected Componente componente;
	
	public abstract void criaGrafico();
	public abstract void addSubtitulo();
	public abstract void addTituloEixo1();
	public abstract void addTituloEixo2();
	public abstract void addTitulo();
	public final Componente getGrafico() {
		return this.componente;
	}
}

