package ar.edu.unju.fi.ejercicio18.model;

public class Destino_Turistico {
	private String Codigo;
	private String Nombre;
	private double Precio;
	private Pais pais;
	private int CantDias;
	
	@Override
	public String toString() {
		return "----Destino_Turistico----" + "\nNombre:" + Nombre + "\nCodigo:" + Codigo +  "\nPrecio:" + Precio + "\nPais=" + pais
				+ "\nCantDias=" + CantDias;
	}
	
	public Destino_Turistico(String codigo, String nombre, double precio, Pais pais, int cantDias) {
		Codigo = codigo;
		Nombre = nombre;
		Precio = precio;
		this.pais = pais;
		CantDias = cantDias;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getCantDias() {
		return CantDias;
	}
	public void setCantDias(int cantDias) {
		CantDias = cantDias;
	}
}
