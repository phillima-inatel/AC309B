package br.inatel.cdg.ac309_pilha_junit;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {

	private List<T> elementos = new ArrayList<T>();
	
	private int qtdElementos = 0;
	
	public int getTamanho() {
		return qtdElementos;
	}
	
	public boolean isVazia() {
		return (qtdElementos==0);
	}
	
	public void push(T elem) {
		elementos.add(elem);
		qtdElementos++;
	}
	
	public T pop() throws EmptyStackException {
		if(isVazia())
			throw new EmptyStackException();
		T elem = elementos.remove(qtdElementos-1);
		qtdElementos--;
		return elem;
	}
	
}