package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int resultado = 0;
		boolean creado = false;
		
		while(!creado) {
			System.out.println("ingrese un numero:");
			 if(scanner.hasNextInt()) {
				 num = scanner.nextInt();
				 creado = true;
			 }
			 else {
				 System.out.println("El dato ingresado no es un numero");
				 scanner.next();
			 } 
		}
		if(num % 2 != 0) {
			resultado = num * 3;
			System.out.println("El numero ingresado es par \nEl triple del numero ingreso:" + num + " es:" + resultado);
		}
		else {
			resultado = num * 2;
			System.out.println("El numero ingresado es impar \nEl doble del numero ingresado:" + num + " es:" + resultado);
		}
		scanner.close();
		
	}

}
