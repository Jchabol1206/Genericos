package com.ies.genericos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ies.PilaArray.PilaArray;

class TestArrayPila {

	@Test
	void testPilaArray() {
		int numero=5;
		PilaArray<Integer> l = new PilaArray<Integer>(numero);
	}

	@Test
	void testEstaVacia() {
		int numero=5;
		PilaArray l = new PilaArray(numero);
		l.estaVacia();
		assertEquals(true, l.estaVacia());
	}

	@Test
	void testExtraer() {
		fail("Not yet implemented");
	}

	@Test
	void testPrimero() {
		fail("Not yet implemented");
	}

	@Test
	void testAniadir() {
		fail("Not yet implemented");
	}

}
