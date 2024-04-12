package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int Diametro;
    private int Precio;
    private double Area;
    private boolean ingredientesEspeciales;

    private static final int ADICIONAL_ESPECIALES_20 = 500;
    private static final int ADICIONAL_ESPECIALES_30 = 750;
    private static final int ADICIONAL_ESPECIALES_40 = 1000;
    
    public void calcularPrecio() {
        switch (Diametro) {
            case 20:
                this.Precio = ingredientesEspeciales ? 4500 + ADICIONAL_ESPECIALES_20 : 4500;
                break;
            case 30:
            	this.Precio = ingredientesEspeciales ? 4800 + ADICIONAL_ESPECIALES_30 : 4800;
                break;
            case 40:
            	this.Precio = ingredientesEspeciales ? 5500 + ADICIONAL_ESPECIALES_40 : 5500;
                break;
            default:
                System.out.println("Diámetro no válido.");
                break;
        }
    }
    
    public void calcularArea() {
        double radio = this.Diametro / 2.0;
        this.Area = Math.PI * Math.pow(radio, 2);
    }
    
	public int getDiametro() {
		return Diametro;
	}
	public void setDiametro(int diametro) {
		Diametro = diametro;
	}
	public int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		Area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public static int getAdicionalEspeciales20() {
		return ADICIONAL_ESPECIALES_20;
	}
	public static int getAdicionalEspeciales30() {
		return ADICIONAL_ESPECIALES_30;
	}
	public static int getAdicionalEspeciales40() {
		return ADICIONAL_ESPECIALES_40;
	}

	
	
}
