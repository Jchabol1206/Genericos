package com.ies.PilaArray;


public class PilaArray<T> {
	private T[] listado;
	private int numero;
	
	public PilaArray(int numero) {
		this.numero=numero;
		this.listado= (T[]) new Object[numero]; 
	}
	
	public boolean estaVacia() {
		boolean resultado=true;
		
		if(listado[0]!=null) {
			resultado=false;
		}
		return resultado;
	}
	
	public T extraer() {
		T resultado=listado[numero-1];
		listado[numero-1]=null;
		return resultado;
	}
	
	public T primero() {
		T resultado=null;
		boolean respuesta=false;
		int contador=numero-1;
		do {
			if(listado[contador]!=null) {
				respuesta=true;
				resultado=listado[contador];
			}
			contador--;
		}while(!respuesta || contador>=0);
		return resultado;
	}
	
	public T aniadir(T objeto) {
		T resultado=null;
		boolean respuesta=false;
		int contador=numero-1;
		do {
			if(listado[contador]==null) {
				listado[contador]=objeto;
				respuesta=true;
			}
			contador--;
		}while(!respuesta || contador>=0);
		return resultado;
	}
	
	public String toString() {
		String lista="";
			for(int i=0; i<numero;i++) {
				lista = listado[i]+" ";
			}
		return lista;
	}

}
