package com.myproject;

public class Manipula_Cadenas_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alumno1, alumno2;
		
		alumno1="Oscar";
		
		alumno2="Oscar";
		
		System.out.println(alumno1.equals(alumno2));
		
		//cambio de mayúscula por minúscula
		
		String alumno3, alumno4;
		
        alumno3="Oscar";
		
		alumno4="oscar";
		
		System.out.println(alumno3.equals(alumno4));
		
        //ignorecase
		
		String alumno5, alumno6;
		
        alumno5="Oscar";
		
		alumno6="oscar";
		
		System.out.println(alumno5.equalsIgnoreCase(alumno6));

	}

}
