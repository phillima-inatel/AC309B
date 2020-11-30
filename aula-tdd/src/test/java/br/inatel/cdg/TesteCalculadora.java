package br.inatel.cdg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.calculadora.Calculadora;

public class TesteCalculadora {

	Calculadora calc;
	
	@Before
	public void setUp(){
		calc = new Calculadora();
	}
	
	@Test
	public void testeSoma() {
		int res = calc.somar(2,3);
		assertEquals(5, res);
	}
	
	@Test
	public void testeSoma2() {
		int res = calc.somar(5,4);
		assertEquals(9, res);
	}
	@Test
	public void testeSubtracao() {
		int res = calc.subtracao(5,4);
		assertEquals(1, res);
	}
	
	@Test
	public void testeMultiplicacao() {
		int res = calc.multiplica(2,3);
		assertEquals(6, res);
	}

}