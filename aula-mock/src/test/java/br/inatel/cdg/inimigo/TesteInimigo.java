package br.inatel.cdg.inimigo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteInimigo {

	UIMockNotifier uiMock;
	Inimigo inimigo;
	
	@Before
	public void setUp() {
		uiMock = new UIMockNotifier();
		inimigo = 
				new Inimigo("BK", "BK Axe", 100);
		inimigo.setNotifier(uiMock);
	}
	
	@Test
	public void testUIMockNotifierChamado() {
		
		inimigo.tomarDano(120);
		assertTrue(uiMock.isExecuted());
		
	}
	
	@Test
	public void testeNaoFoiChamado() {
		inimigo.tomarDano(90);
		assertFalse(uiMock.isExecuted());
	}

}
