package com.ies.matriz4;

public class Matriz {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] matriz = new Integer[4][2]; 
		int contador=1;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int b = 0; b<matriz[i].length; b++) {
				matriz[i][b] = contador;
				contador++;
			}
		}
		for(int i = 0; i<matriz.length;i++) {
			for(int b = 0; b<matriz[i].length;b++) {
				System.out.print(matriz[i][b]+"");
			}
			System.out.println();
		}
		System.out.println(matriz[0][1]);
	}

}
