package ar.edu.unju.fi.ejercicio17.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jugador {
	private String Nombre;
	private String Apellido;
	private Calendar fechNac;
	private String Nacionalidad;
	private float Estatura;
	private float Peso;
	private pocicion Pocicion;


	public int calcularEdad () {
		Calendar now = GregorianCalendar.getInstance();
		int edad = now.get(Calendar.YEAR) - fechNac.get(Calendar.YEAR);
		if (fechNac.get(Calendar.MONTH) > now.get(Calendar.MONTH) ||
		        (fechNac.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
		        		fechNac.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
		    edad--;
		}
		if (fechNac.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
				fechNac.get(Calendar.DAY_OF_MONTH) == now.get(Calendar.DAY_OF_MONTH)) {
		    System.out.println(" Es el cumpleaños de " + this.Nombre);
		}
		return edad;
	}
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Calendar getFechNac() {
		return fechNac;
	}
	public void setFechNac(Calendar FechNac) {
		fechNac = FechNac;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public float getEstatura() {
		return Estatura;
	}
	public void setEstatura(float estatura) {
		Estatura = estatura;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public pocicion getPocicion() {
		return Pocicion;
	}
	public void setPocicion(pocicion pocicion) {
		Pocicion = pocicion;
	}

	
}
