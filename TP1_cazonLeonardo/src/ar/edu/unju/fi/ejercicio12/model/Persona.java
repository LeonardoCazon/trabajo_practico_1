package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
	private Calendar fechNac;

	public int calcularEdad() {
		Calendar now = GregorianCalendar.getInstance();
		int edad = now.get(Calendar.YEAR) - fechNac.get(Calendar.YEAR);
		if (fechNac.get(Calendar.MONTH) > now.get(Calendar.MONTH) ||
		        (fechNac.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
		        		fechNac.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
		    edad--;
		}
		if (fechNac.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
				fechNac.get(Calendar.DAY_OF_MONTH) == now.get(Calendar.DAY_OF_MONTH)) {
		    System.out.println("\nFeliz cumpleaños!");
		}
		return edad;
	}
	   public String determinarSigno() {
	       int dia = fechNac.get(Calendar.DAY_OF_MONTH);
	       int mes = fechNac.get(Calendar.MONTH);
	       if ((mes == Calendar.MARCH && dia >= 21) || (mes == Calendar.APRIL && dia <= 19)) {
	           return "Aries";
	       } else if ((mes == Calendar.APRIL && dia >= 20) || (mes == Calendar.MAY && dia <= 20)) {
	           return "Tauro";
	       } else if ((mes == Calendar.MAY && dia >= 21) || (mes == Calendar.JUNE && dia <= 20)) {
	           return "Géminis";
	       } else if ((mes == Calendar.JUNE && dia >= 21) || (mes == Calendar.JULY && dia <= 22)) {
	           return "Cáncer";
	       } else if ((mes == Calendar.JULY && dia >= 23) || (mes == Calendar.AUGUST && dia <= 22)) {
	           return "Leo";
	       } else if ((mes == Calendar.AUGUST && dia >= 23) || (mes == Calendar.SEPTEMBER && dia <= 22)) {
	           return "Virgo";
	       } else if ((mes == Calendar.SEPTEMBER && dia >= 23) || (mes == Calendar.OCTOBER && dia <= 22)) {
	           return "Libra";
	       } else if ((mes == Calendar.OCTOBER && dia >= 23) || (mes == Calendar.NOVEMBER && dia <= 21)) {
	           return "Escorpio";
	       } else if ((mes == Calendar.NOVEMBER && dia >= 22) || (mes == Calendar.DECEMBER && dia <= 21)) {
	           return "Sagitario";
	       } else if ((mes == Calendar.DECEMBER && dia >= 22) || (mes == Calendar.JANUARY && dia <= 19)) {
	           return "Capricornio";
	       } else if ((mes == Calendar.JANUARY && dia >= 20) || (mes == Calendar.FEBRUARY && dia <= 18)) {
	           return "Acuario";
	       } else {
	           return "Piscis";
	       }
	   }
	   public String determinarEstacion() {
	       int mes = fechNac.get(Calendar.MONTH);
	       switch (mes) {
	           case Calendar.JANUARY:
	           case Calendar.FEBRUARY:
	           case Calendar.DECEMBER:
	               return "Verano";
	           case Calendar.MARCH:
	           case Calendar.APRIL:
	           case Calendar.MAY:
	               return "Otoño";
	           case Calendar.JUNE:
	           case Calendar.JULY:
	           case Calendar.AUGUST:
	               return "Invierno";
	           case Calendar.SEPTEMBER:
	           case Calendar.OCTOBER:
	           case Calendar.NOVEMBER:
	               return "Primavera";
	           default:
	        	   return "Estación no determinada";
	       }
	   }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechNac() {
		return fechNac;
	}
	public void setFechNac(Calendar fechNac) {
		this.fechNac = fechNac;
	}
}
