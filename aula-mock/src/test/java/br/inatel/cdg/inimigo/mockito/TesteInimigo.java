package br.inatel.cdg.inimigo.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.Notifier;

@RunWith(MockitoJUnitRunner.class)
public class TesteInimigo {

	@Mock
	private Notifier notifier1;
	
	private Inimigo inimigo;
	
	@Before
	public void init() {
		inimigo = new Inimigo("BK", "BK Axe", 120);
	}
	
	@Test
	public void testeChamouNotifier() {
		
		inimigo.setNotifier(notifier1);
		inimigo.tomarDano(121);
		Mockito.verify(notifier1).
				notificaMorte(inimigo);
	}
	
	@Test
	public void testeNaoChamouNotifier() {
		
		inimigo.setNotifier(notifier1);
		inimigo.tomarDano(119);
		Mockito.verifyNoInteractions(notifier1);
	}

}