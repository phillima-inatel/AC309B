package br.inatel.cdg.pilha;

public class PilhaCheiaException extends RuntimeException {

	int elemento;
	
	public PilhaCheiaException(int elemento) {
		this.elemento = elemento;
		System.out.println("Elemento " + elemento + 
				" deu ruim");
	}
	
	public int getElemento() {
		return elemento;
	}

}
