package com.ies.Pila;

import java.util.*;
public class Pila<T> {
	private List<T> lista = new LinkedList<T>();
	
	public Pila() {
		
	}
	
	public boolean estaVacia() {
		return lista.isEmpty();
	}
	
	public T extraer() {
		T a = lista.get(lista.size()-1);
		lista.remove(lista.size()-1);
		return a;
	}
	
	public T primero() {
		return lista.get(lista.size()-1);
	}
	
	public void aniadir(T a) {
		lista.add(a);
	}
	
	public String toString() {
		return lista.toString();
	}
	

}
