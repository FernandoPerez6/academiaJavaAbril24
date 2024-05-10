package com.curso.v0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void test() {
		double dato = 5.0;
		double otroDato = 3.0 + 2.0;
		assertEquals(dato,otroDato);
	}
	
	@Test
	void testConstante() {
		double valor = 8.0;
		Component c1 = new LeafConstante(valor);
		assertEquals(valor, c1.getValor()); 
	}
	
	@Test
	void testSuma() {
		double valor1 = 4.0;
		double valor2 = 5.0;
		Component c1 = new LeafConstante(valor1);
		Component c2 = new LeafConstante(valor2);
		Component c3 = new CompositeSuma(c1,c2);
		assertEquals(valor1+valor2, c3.getValor());
	}
	
	@Test
	void testResta() {
		double valor1 = 4.0;
		double valor2 = 5.0;
		Component c1 = new LeafConstante(valor1);
		Component c2 = new LeafConstante(valor2);
		Component c3 = new CompositeResta(c1,c2);
		assertEquals(-1.0, c3.getValor(),0);
	}
	
	@Test
	void testMulti() {
		double valor1 = 4.0;
		double valor2 = 5.0;
		Component c1 = new LeafConstante(valor1);
		Component c2 = new LeafConstante(valor2);
		Component c3 = new CompositeMulti(c1,c2);
		assertEquals(20.0, c3.getValor(),0);
	}
	
	@Test
	void testDiv() {
		double valor1 = 10.0;
		double valor2 = 5.0;
		Component c1 = new LeafConstante(valor1);
		Component c2 = new LeafConstante(valor2);
		Component c3 = new CompositeDiv(c1,c2);
		assertEquals(valor1/valor2, c3.getValor(),0);
	}
	
	@Test
	void testComplejo() {
		Component c1 = new LeafConstante(4.0);
		Component c2 = new LeafConstante(6.0);
		Component c3 = new LeafConstante(200.0);
		Component c4 = new LeafConstante(3.0);
		Component c5 = new LeafConstante(83.0);
		
		Component c6 = new CompositeSuma(c1,c2);
		Component c7 = new CompositeMulti(c6,c3);
		Component c8 = new CompositeSuma(c4,c5);
		Component c9 = new CompositeDiv(c7,c8);
		
		assertEquals(23.25, c9.getValor(), 0.01);
	}

}
