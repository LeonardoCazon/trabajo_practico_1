package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos para pedir una pizza N° " + (i + 1) + ":");
            System.out.print("Elija el diametro de la pizza (20, 30 o 40): ");
            int diametro = scanner.nextInt();
            while (diametro != 20 && diametro != 30 && diametro != 40) {
                System.out.println("Diámetro no válido. El diametro debe ser: 20, 30 o 40.");
                diametro = scanner.nextInt();
            }
            
            System.out.print("¿Quiere q lleve ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            
            Pizza pizza = new Pizza();
            pizza.setDiametro(diametro);
            pizza.setIngredientesEspeciales(ingredientesEspeciales);
            pizza.calcularPrecio();
            pizza.calcularArea();
            
            System.out.println("Pizza " + (i + 1) + ":");
            System.out.println("Diametro: " + pizza.getDiametro() + " cm");
            System.out.println("Precio: $" + pizza.getPrecio());
            System.out.println("Área: " + pizza.getArea() + " cm²");
        }
        scanner.close();

	}

}
