package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		boolean creado = false;
		
		while(!creado) {
			System.out.println("Ingrese un numero de tabla de multiplica:");
			
			if(scanner.hasNextInt()) {
				num = scanner.nextInt();
				creado = true;
				
				System.out.println("La tabla del \"" + num +"\" es:");
				for(int i = 0; i <= 10; i++) {
					
					System.out.println(num + " x " + i + " = " + (num * i));
				}
			}else {
				System.out.println("Error: se debe ingresar un numero\n \"Precione enter para continuar\"");
				scanner.nextLine();
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}
