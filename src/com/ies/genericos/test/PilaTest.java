package com.ies.genericos.test;

import com.ies.Pila.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	@Test
	void testPila() {
		Pila l = new Pila();
	}

	@Test
	void testEstaVacia() {
		Pila l = new Pila();
		assertEquals(true, l.estaVacia());
	}

	@Test
	void testExtraer() {
		int a = 5;
		int b = 2;
		int c = 3;
		Pila<Integer> l = new Pila<Integer>();
		l.aniadir(a);
		l.aniadir(b);
		l.aniadir(c);
		assertEquals(c, l.extraer());
	}

	@Test
	void testPrimero() {
		int a = 5;
		int b = 2;
		int c = 3;
		Pila<Integer> l = new Pila<Integer>();
		l.aniadir(a);
		l.aniadir(b);
		l.aniadir(c);
		l.primero();
		assertEquals(c, l.primero());
		}

	@Test
	void testAniadir() {
		int a = 5;
		Pila<Integer> l = new Pila<Integer>();
		l.aniadir(a);
		assertEquals(a, l.primero());
	}

	@Test
	void testToString() {
		int a = 5;
		int b = 3;
		int c = 2;
		Pila<Integer> l = new Pila<Integer>();
		l.aniadir(a);
		l.aniadir(b);
		l.aniadir(c);
		assertEquals(l.toString(), l.toString());
	}

}
