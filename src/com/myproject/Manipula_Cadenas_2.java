package com.myproject;

public class Manipula_Cadenas_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo día para aprender a programar en Java.";
		
		String frase_resumen=frase.substring(29, 58);
		
		String frase_resumen1=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo...";
		
		String frase_resumen2=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo..." + " y " +
		 frase.substring(29, 58);
		
		System.out.println(frase_resumen);
		
		System.out.println(frase_resumen1);
		
		System.out.println(frase_resumen2);

	}

}
