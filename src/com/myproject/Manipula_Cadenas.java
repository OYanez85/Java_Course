package com.myproject;

public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Oscar"; //declaración de variable.
		
		System.out.println("Mi nombre es " + nombre +"."); // Imprime en consola.
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras."); //Imprime en consola.Método .length
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0) + ".");//Método charAt
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("La última letra es la " + nombre.charAt(ultima_letra-1) + ".");

	}

}
