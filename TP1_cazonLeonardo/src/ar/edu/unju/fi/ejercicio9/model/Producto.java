
package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String Nombre;
	private int Codigo;
	private double Precio;
	private int Descuento;
	
	public void mostrarProducto(){
		System.out.println("Producto:" + this.Nombre);
		System.out.println("Codigo:" + this.Codigo);
		System.out.println("Precio:" + this.Precio);
		System.out.println("Descuento:" + this.Descuento + "%");
	}
	
	public double calcularDescuento () {
		double Desc,PrecioDesc;
		
		if(this.Descuento == 0) {
			PrecioDesc = this.Precio;
		}
		else {
			Desc = (this.Descuento * this.Precio)/100;
			PrecioDesc = this.Precio - Desc;
		}
		
		return PrecioDesc;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getDescuento() {
		return Descuento;
	}
	public void setDescuento(int descuento) {
		if(descuento >= 0 && descuento <= 50) {
			this.Descuento = descuento;
		}
		else {
			this.Descuento = 0;
		}
		System.out.println("El descuento se a cambiado a:" + this.Descuento + "%");
	}
	
}
