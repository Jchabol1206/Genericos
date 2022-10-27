package com.ies.interfazSimple;
public interface ColeccionSimpleGenerica<T> {

	
	public boolean estaVacia(Pila<T> pila);
	
	public T extraer(Pila<T> pila);
	
	public T primero(Pila<T> pila);
	
	public T aniadir(Pila<T> pila, T o);
}
