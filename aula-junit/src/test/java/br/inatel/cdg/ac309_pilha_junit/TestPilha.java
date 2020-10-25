package br.inatel.cdg.ac309_pilha_junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPilha {
	
	@Test
	public void testePilhaVazia() {
		Pilha<Integer> pilha = new Pilha<Integer>();
		assertTrue(pilha.isVazia());
	}
	
}