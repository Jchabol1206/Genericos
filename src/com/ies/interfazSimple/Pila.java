package com.ies.interfazSimple;

import java.util.LinkedList;
import java.util.List;

public class Pila<T> implements ColeccionSimpleGenerica<T>{
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

	@Override
	public boolean estaVacia(Pila<T> pila) {
		return pila.estaVacia();
	}

	@Override
	public T extraer(Pila<T> pila) {
		return pila.extraer();
	}

	@Override
	public T primero(Pila<T> pila) {
		return pila.primero();
	}

	@Override
	public T aniadir(Pila<T> pila, T o) {
		return pila.aniadir(pila, o);
	}
	

}


