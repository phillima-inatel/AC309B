package br.inatel.cdg.inimigo;

public class Inimigo {

	private String nome,arma;
	private double vida;
	private Notifier notifier;
	
	public Inimigo(String nome, String arma, double vida) {
		this.nome = nome;
		this.arma = arma;
		this.vida = vida;
	}
	
	public void tomarDano(double dano) {
		this.vida -= dano;
		if(this.vida <= 0) {
			notifier.notificaMorte(this);
		}
	}
	
	
	
	
	
	
	//Getter e Setter
	public String getNome() {
		return nome;
	}
	public double getVida() {
		return vida;
	}
	public String getArma() {
		return arma;
	}
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
}