package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculadoraEspecial calculo = new CalculadoraEspecial();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor \"n\" de la Sumatoria:");
		int n = scanner.nextInt();
		
		calculo.setN(n);
		calculo.calcularSumatoria(n);
	
		System.out.println("\nIngrese el valor \"n\" de la Productoria:");
		n = scanner.nextInt();
		calculo.setN(n);
		calculo.calcularProductoria(n);
      
		scanner.close();
	}

}
