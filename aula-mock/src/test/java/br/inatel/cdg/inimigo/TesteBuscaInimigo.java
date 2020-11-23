package br.inatel.cdg.inimigo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteBuscaInimigo {

	InimigoService service;
	BuscaInimigo buscaIni;
	
	@Before
	public void init() {
		service = new MockInimigoService();
		
		buscaIni = 
				new BuscaInimigo(service);
	}
	
	@Test
	public void testInimigoRingedKnight() {
		
		//tem o id 23
		Inimigo ringedKnight = buscaIni.buscaInimigo(23);
		assertEquals("Ringed Knight", ringedKnight.getNome());
		assertEquals(200, ringedKnight.getVida(),0.1);
		assertEquals("Ringed Knight Sword", ringedKnight.getArma());
	}
	
	@Test
	public void testeInimigoPadrao() {
		Inimigo hollow = buscaIni.buscaInimigo(-1);
		assertEquals("Hollow", hollow.getNome());
		assertEquals(20, hollow.getVida(),0.1);
		assertEquals("Broken Sword", hollow.getArma());
	}

}
