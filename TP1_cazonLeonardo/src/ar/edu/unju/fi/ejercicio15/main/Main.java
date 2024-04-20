package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		//Crear Array
		System.out.println("Ingrese El tamanio de la lista de 5 a 10");
		while (true) {
		    if (sc.hasNextInt()) {
		        n = sc.nextInt();
		        if (n >= 5 && n <= 10) {
		            break;
		        } else {
		            System.out.println("El número ingresado debe estar entre 5 y 10. Intente nuevamente:");
		        }
		    } else {
		        System.out.println("Error: Se debe ingresar un número entero. Intente nuevamente:");
		        sc.next();
		    }
		}		
		String[] list = new String[n];
		
		//Guardar datos de manera iterativa
		System.out.println("---Ingrese " + n + " datos para la lista---");
		for(int i = 0; i<list.length;i++) {
			System.out.println("ingrese el dato en la pocicion [" + (i+1) + "] :");
			list[i] = sc.next();
		}
		
		//Mostrar datos
		System.out.println("---Datos ingresados---");
		for(int i = 0; i<list.length;i++) {
			System.out.println("Dato ingresado en la pocicion ["+ (i+1) +"] :" + list[i]);
		}
		
		System.out.println("---Datos ingresados inversamente---");
		for(int i = list.length-1; i>=0;i--) {
			System.out.println("Dato ingresado en la pocicion ["+ (i+1) +"] :" + list[i]);
		}
		sc.close();
	}
}
