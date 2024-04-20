package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		
		//cargar datos
		System.out.println("---Ingrese 8 datos para la lista---");
		for(int i=0; i < num.length;i++) {
			System.out.println("ingrese el dato en la pocicion [" + (i+1) + "] :");
			while (!sc.hasNextInt()) {
	            System.out.println("[Error]Ingrese nuevamente solo un numero entero:");
	            sc.next();
	        }
			num[i] = sc.nextInt();
		}
		//mostrar datos cargados
		System.out.println("---Datos ingresados---");
		for(int i = 0; i<num.length;i++) {
			System.out.println("Dato ingresado en la pocicion ["+ (i+1) +"] :" + num[i]);
		}
		sc.close();
	}
}
