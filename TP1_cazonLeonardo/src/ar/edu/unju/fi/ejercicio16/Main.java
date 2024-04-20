package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//crear e ingresar datos a la lista
		String[] lista = new String[5]; 
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
			lista[i] = sc.nextLine();
		}
		//mostrar datos 
		System.out.println("---Valores guardados en la lista---");
		int i = 0;
		while (i < lista.length) {
			System.out.println("Posición " + i + ": " + lista[i]);
			i++;
		}
		System.out.println("\nTamaño del lista: " + lista.length);
		
		//eliminar elementos de la lista
		int indiceEliminar;
		do {
			System.out.print("Ingrese el índice [0-4] del elemento que desea eliminar (-1 para salir): ");
			indiceEliminar = sc.nextInt();
			if (indiceEliminar >= 0 && indiceEliminar < lista.length) {   
				for (i = indiceEliminar; i < lista.length - 1; i++) {
					lista[i] = lista[i + 1];
				}
				lista[lista.length - 1] = "";
			}else if (indiceEliminar != -1) {
				System.out.println("Índice inválido. Inténtelo nuevamente.");
			}
	       }while (indiceEliminar != -1);
		
		//mostrar lista actualizada
		System.out.println("\n---Lista después de la eliminación---");
		for (String list : lista) {
			System.out.println("Elemento en la lista:" + list);
		}
		sc.close();
		
	}

}
