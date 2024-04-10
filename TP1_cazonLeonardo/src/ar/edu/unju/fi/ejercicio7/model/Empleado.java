
package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    public final double SALARIO_MINIMO = 210000;
    public final double AUMENTO_MERITO = 20000;

    public void asigSalario(double salario) {
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
            System.out.println("El salario se cambió a: $" + this.salario);
            
        } else {
            this.salario = SALARIO_MINIMO;
            System.out.println("Se cambió el salario por el mínimo posible: $" + SALARIO_MINIMO);
        }
    }

    public void mostrarSalario() {
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Salario: $" + this.salario);
    }

    public void aumentoPorMerito() {
        this.salario += AUMENTO_MERITO;
        System.out.println("Se aumentó el salario de " + this.nombre + " a: $" + this.salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
