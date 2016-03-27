package br.com.sgpf.app.financeiro.domain.valueobject.enums;

/**
 * Eumeração de moedas.
 */
public enum Moeda {
	
	/**
	 * Real (R$)
	 */
	BRL ("Real", "R$"),
	
	/**
	 * Euro (€)
	 */
	EUR ("Euro", "€");
	
	private String nome;
	
	private String simbolo;

	private Moeda(String nome, String simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
	}

	public String getNome() {
		return nome;
	}

	public String getSimbolo() {
		return simbolo;
	}
}
