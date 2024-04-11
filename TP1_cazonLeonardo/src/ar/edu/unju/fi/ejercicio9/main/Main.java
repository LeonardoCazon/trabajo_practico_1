
package ar.edu.unju.fi.ejercicio9.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Producto p01 = new Producto();
		Producto p02 = new Producto();
		Producto p03 = new Producto();
		
		int op = 0;
		
		do {
			System.out.println("---MENU---");
			System.out.println("1)Crear 3 productos");
			System.out.println("2)Mostrar productos creados");
			System.out.println("3)Mostrar descuento de cada producto");
			System.out.println("4)Salir");
			
			if(scanner.hasNextInt()) {
				op = scanner.nextInt();
			}
			else {
				System.out.println("Se debe ingresar una opcion del menu");
			}
			scanner.nextLine();
			
			switch (op) {
			case 1:
				crearProducto(p01, p02, p03, scanner);
				break;
			case 2:
				System.out.println("-Producto 1-");
				p01.mostrarProducto();
				System.out.println("\n-Producto 2-");
				p02.mostrarProducto();
				System.out.println("\n-Producto 3-");
				p03.mostrarProducto();
				System.out.println("\"Precione Enter Para Continuar\"");
				scanner.nextLine();
				break;
			case 3:
				System.out.println("-Producto 1-");
				p01.mostrarProducto();
				System.out.println("El producto con un descuento de " + p01.getDescuento() + "% quedaria en:" + p01.calcularDescuento());
				System.out.println("\n-Producto 2-");
				p02.mostrarProducto();
				System.out.println("El producto con un descuento de " + p02.getDescuento() + "% quedaria en:" + p02.calcularDescuento());
				System.out.println("\n-Producto 3-");
				p03.mostrarProducto();
				System.out.println("El producto con un descuento de " + p03.getDescuento() + "% quedaria en:" + p03.calcularDescuento());
				break;	
			}
		}while(op != 4);
		
	}
	
	public static void crearProducto(Producto p01,Producto p02,Producto p03,Scanner scanner) {
		
		//----Primer Producto----
		System.out.println("Ingrese el nombre del producto N°1");
		p01.setNombre(scanner.nextLine());
		
		System.out.println("Ingrese el codigo del producto N°1");
		while(!scanner.hasNextInt()) {
			System.out.println("El codigo solo debe contener numeros enteros");
			scanner.nextLine();
		}
		p01.setCodigo(scanner.nextInt());
			
		System.out.println("Ingrese el precio del producto N°1");
		while(!scanner.hasNextDouble()) {
			System.out.println("Se debe ingresar unicamente numeros:");
			scanner.nextLine();
		}
		p01.setPrecio(scanner.nextDouble());
		
		System.out.println("Ingrese descuento del producto (maximos de 50%):");
		while(!scanner.hasNextInt()) {
			System.out.println("Se debe ingresar unicamente el numero:");
			scanner.nextLine();
		}
		p01.setDescuento(scanner.nextInt());
		scanner.nextLine();
		
		//----segundo Producto----
		System.out.println("Ingrese el nombre del producto N°2");
		p02.setNombre(scanner.nextLine());
		
		System.out.println("Ingrese el codigo del producto N°2");
		while(!scanner.hasNextInt()) {
			System.out.println("El codigo solo debe contener numeros enteros");
			scanner.nextLine();
		}
		p02.setCodigo(scanner.nextInt());
			
		System.out.println("Ingrese el precio del producto N°2");
		while(!scanner.hasNextDouble()) {
			System.out.println("Se debe ingresar unicamente numeros:");
			scanner.nextLine();
		}
		p02.setPrecio(scanner.nextDouble());
		
		System.out.println("Ingrese descuento del producto (maximos de 50%):");
		while(!scanner.hasNextInt()) {
			System.out.println("Se debe ingresar unicamente el numero:");
			scanner.nextLine();
		}
		p02.setDescuento(scanner.nextInt());
		scanner.nextLine();
		//----tercer Producto----
		System.out.println("Ingrese el nombre del producto N°3");
		p03.setNombre(scanner.nextLine());
		
		System.out.println("Ingrese el codigo del producto N°3");
		while(!scanner.hasNextInt()) {
			System.out.println("El codigo solo debe contener numeros enteros");
			scanner.nextLine();
		}
		p03.setCodigo(scanner.nextInt());
			
		System.out.println("Ingrese el precio del producto N°3");
		while(!scanner.hasNextDouble()) {
			System.out.println("Se debe ingresar unicamente numeros:");
			scanner.nextLine();
		}
		p03.setPrecio(scanner.nextDouble());
		
		System.out.println("Ingrese descuento del producto (maximos de 50%):");
		while(!scanner.hasNextInt()) {
			System.out.println("Se debe ingresar unicamente el numero:");
			scanner.nextLine();
		}
		p03.setDescuento(scanner.nextInt());
		
			
	}
	
	
	

}
