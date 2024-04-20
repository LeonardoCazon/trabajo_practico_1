package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		//crear array
		System.out.println("Ingrese El tamanio de la lista de 3 a 10");
		while (true) {
		    if (sc.hasNextInt()) {
		        n = sc.nextInt();
		        if (n >= 3 && n <= 10) {
		            break;
		        } else {
		            System.out.println("El número ingresado debe estar entre 3 y 10. Intente nuevamente:");
		        }
		    } else {
		        System.out.println("Error: Se debe ingresar un número entero. Intente nuevamente:");
		        sc.next();
		    }
		}		
		int[] list = new int[n];

		//cargar datos
		System.out.println("---Ingrese " + n + " datos para la lista---");
		for(int i = 0; i<list.length;i++) {
			System.out.println("ingrese el dato en la pocicion [" + (i+1) + "] :");
			list[i] = sc.nextInt();
		}
		
		//mostrar datos solicitados
		System.out.println("---Datos Ingresados---:");
	       int suma = 0;
	       for (int i = 0; i < n; i++) {
	           System.out.println("Posición " + i + ": " + list[i]);
	           suma += list[i];
	       }
	       System.out.println("La suma de todos los valores de la lista es: " + suma);

		
		
		
		
	}

}
