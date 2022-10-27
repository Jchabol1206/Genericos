package com.ies.matrizGenerica;

import java.util.Iterator;

public class Matriz<T> {
	private T[][] matriz;
	
	
	
	public Matriz(int fila, int col) {
		this.matriz= (T[][])new Object[fila][col];
	}
	
	public void set(int fila, int col, T cosa) {
		this.matriz[fila][col]=cosa;
	}
	
	public T get(int fila, int col) {
		T nuevo=null;
		
		nuevo = this.matriz[fila][col];
		
		return nuevo;
	}
	
	public int columnas() {
		int respuesta = 0;
		
		respuesta = this.matriz[0].length;
		
		return respuesta;
	}
	
	public int filas() {
		int respuesta=0;
		
		respuesta = this.matriz.length;
		return respuesta;
	}
	
	public String toString() {
		String respuesta="";
		
		for(int i=0; i<this.matriz.length;i++) {
			for(int b = 0; b<this.matriz[i].length;b++) {
				respuesta+=this.matriz[i][b]+", " ;
			}
			System.out.println();
		}
		
		return respuesta;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz matriz = new Matriz(5,7);
		
		System.out.println(matriz.toString());

	}














}
