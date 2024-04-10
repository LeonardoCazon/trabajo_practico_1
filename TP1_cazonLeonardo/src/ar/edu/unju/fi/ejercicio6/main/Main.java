package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//primera persona
		Persona p01 = new Persona();
		
	    System.out.println("---Ingrese datos los datos de la persona---");
	    System.out.print("Nombre: ");
	    p01.setNombre(scanner.nextLine());
	    
	    System.out.print("DNI: ");
	    p01.setDni(scanner.nextLine());
	    
	    System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
	    p01.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
	    
	    System.out.print("Provincia: ");
	    p01.setProvincia(scanner.nextLine());
	    
	    p01.mostrarDatos();
	    
	    //segunda persona
	    Persona p02 = new Persona(null, null, null, null);
	  
	    System.out.println("\n---Ingrese los datos la persona---");
	    System.out.print("Nombre: ");
	    p02.setNombre(scanner.nextLine());
	    
	    System.out.print("DNI: ");
	    p02.setDni(scanner.nextLine());
	      
	    System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
	    p02.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
	    
	    System.out.print("Provincia: ");
	    p02.setProvincia(scanner.nextLine());
	       
	    p02.mostrarDatos();
	       
	    //persona 3
	    Persona p03 = new Persona(null, null, null);
	    
	    System.out.println("\n---Ingrese los datos la persona---");
	    System.out.print("Nombre: ");
	    p03.setNombre(scanner.nextLine());
	    
	    System.out.print("DNI: ");
	    p03.setDni(scanner.nextLine());
	      
	    System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
	    p03.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
	    
	    p03.mostrarDatos();
	    
	    
	    
	    
	    
	    scanner.close();
	}

}
