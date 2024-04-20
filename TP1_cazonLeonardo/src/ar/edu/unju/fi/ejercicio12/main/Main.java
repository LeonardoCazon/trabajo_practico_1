package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Persona persona = new Persona();

		//Ingreso de datos
		System.out.print("Ingrese el nombre de la persona: ");
		persona.setNombre(sc.nextLine());		
		System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
		String fechaNacStr = sc.nextLine();
		
		//cambiar fechNac str a int
		String[] partFecha = fechaNacStr.split("/");
		int dia = Integer.parseInt(partFecha[0]);
		int mes = Integer.parseInt(partFecha[1]) - 1;
		int anio = Integer.parseInt(partFecha[2]);
		Calendar fechNac = new GregorianCalendar(anio, mes, dia);
		persona.setFechNac(fechNac);
		
		//Mostrar datos ingresados	
		System.out.println("----Datos Ingresados----");
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio);
		System.out.println("Edad: " + persona.calcularEdad() + " años");
		System.out.println("Signo del zodiaco: " + persona.determinarSigno());
		System.out.println("Estación del año: " + persona.determinarEstacion());
		sc.close();
	}

}
