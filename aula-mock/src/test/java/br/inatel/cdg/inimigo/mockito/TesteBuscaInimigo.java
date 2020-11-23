package br.inatel.cdg.inimigo.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.inimigo.BuscaInimigo;
import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.InimigoService;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaInimigo {

	@Mock
	private InimigoService inimigoService;
	
	
	private BuscaInimigo buscaInimigo;
	
	@Before
	public void setUp() {
		buscaInimigo = new BuscaInimigo(inimigoService);
	}
	
	@Test
	public void testeBuscaRingedKnight() {
		
		Mockito.when(inimigoService.busca(23)).
			thenReturn(InimigoConst.RINGED_KNIGHT);
		
		Inimigo iniRinged = buscaInimigo.buscaInimigo(23);
		
		assertEquals("Ringed Knight", iniRinged.getNome());
		assertEquals(200, iniRinged.getVida(),0.1);
		assertEquals("Ringed Knight Sword", iniRinged.getArma());
		
	}

}

class InimigoConst {
	
	public static String RINGED_KNIGHT = 
	          "{ \"nome\": \"Ringed Knight\", \n " + 
    		  "\"vida\": 200, \n " + 
    		  "\"arma\": \"Ringed Knight Sword\" }";  

	public static String HOLLOW =
			"{ \"nome\": \"Hollow\", \n " + 
		    "\"vida\": 20, \n " + 
		    "\"arma\": \"Broken Sword\" }"; 
}