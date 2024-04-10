package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = 0, aux = 1, fact = 1;
		boolean flag = false;
		
		do {
			
			System.out.println("ingrese un numero entre 0 y 10: ");
			 if(scanner.hasNextInt()) {
				 num = scanner.nextInt();
				 if(num>=0 && num<11) {
					 flag = true;
			 	}
			 }
			 else {
				 scanner.next();
				 flag = false;
			 } 
			
		}while(!flag);

		if(num != 0 && num != 1) {
			while(aux <= num) {
				fact = fact * aux;
				aux = aux + 1;
			}
		}
		System.out.println("El factorial de " + num + " es:" + fact);
	}

}
