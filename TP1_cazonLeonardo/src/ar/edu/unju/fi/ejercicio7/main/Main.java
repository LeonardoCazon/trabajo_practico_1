package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado01 = new Empleado();
        int op;

        do {
            System.out.println("---MENU---");
            System.out.println("1) Crear Empleado(solo se puede crear un trabajador)");
            System.out.println("2) Mostrar Empleados");
            System.out.println("3) Aumentar Salario ($20.000)");
            System.out.println("4) Salir");

            while (!scanner.hasNextInt()) {
                System.out.println("Se debe ingresar un número");
                System.out.println("Ingrese nuevamente el número:");
                scanner.nextLine();
            }
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    empleado01 = crearEmpleado(scanner);
                    break;
                case 2:
                    if (empleado01 != null) {
                        System.out.println("---Empleado---");
                        empleado01.mostrarSalario();
                    } else {
                        System.out.println("No se ha creado ningún empleado.");
                    }
                    System.out.println("\"PRECIONE ENTER PARA VOLVER AL MENU\"");
                    scanner.nextLine();
                    break;
                case 3:
                    if (empleado01 != null) {
                        empleado01.aumentoPorMerito();
                    } else {
                        System.out.println("No se ha creado ningún empleado.");
                    }
                    break;
            }
            scanner.nextLine();

        } while (op != 4);

        scanner.close();
    }

    public static Empleado crearEmpleado(Scanner scanner) {
        Empleado empleado = new Empleado();
        System.out.println("---Ingrese los datos del trabajador---");
        System.out.println("Ingrese el nombre completo:");
        empleado.setNombre(scanner.next());
        scanner.nextLine();

        System.out.println("Ingrese número de legajo:");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Se debe ingresar un número entero");
            scanner.nextLine();
        }
        empleado.setLegajo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ingrese el sueldo en pesos:");
        System.out.println("El sueldo mínimo posible es: " + empleado.SALARIO_MINIMO);
        
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Se debe ingresar un número");
            scanner.nextLine();
        }
        empleado.asigSalario(scanner.nextDouble());
        System.out.println("\"PRECIONE ENTER PARA VOLVER AL MENU\"");
        scanner.nextLine();

        return empleado;
    }
}
