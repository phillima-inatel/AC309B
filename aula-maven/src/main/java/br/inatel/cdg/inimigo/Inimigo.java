package br.inatel.cdg.inimigo;

public class Inimigo {
	
	private String nome;
	private double vida;
	
	public Inimigo() {}
	
	public Inimigo(String nome, double vida) {
		this.nome = nome;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
	
	
}
