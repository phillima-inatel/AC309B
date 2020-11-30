package br.inatel.cdg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.pilha.Pilha;
import br.inatel.cdg.pilha.PilhaCheiaException;
import br.inatel.cdg.pilha.PilhaVaziaException;

public class TestePilha {
	
	Pilha pilha;
	int maxElementos;
	
	@Before
	public void setUp() {
		maxElementos = 10;
		pilha = new Pilha(maxElementos);
	}
	
	@Test
	public void testPilhaVazia() {
		assertTrue(pilha.isVazia());
	}
	
	@Test
	public void testePilhaPush() {
		pilha.push(23);
		assertEquals(23, pilha.mostraTopo());
		assertFalse(pilha.isVazia());
	}
	
	@Test
	public void testePilhaPop() {
		pilha.push(23);
		pilha.push(13);
		int elemento = pilha.pop();
		assertEquals(13, elemento);
		assertEquals(23, pilha.mostraTopo());
	}
	
	@Test(expected = PilhaVaziaException.class)
	public void testePilhaVazia() {
		pilha.pop();
	}
	
	@Test
	public void testePilhaCheia() {
		for (int i = 0; i < maxElementos; i++) {
			pilha.push(i);
		}
		try {
			pilha.push(42);
			fail();
		}catch (PilhaCheiaException e) {
			assertEquals(42, e.getElemento());
		}
		
	}
}