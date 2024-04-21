package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.Destino_Turistico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        List<Pais> paises = cargarPaises();
        List<Destino_Turistico> destinos = new ArrayList<>();

        int op;
        do {
            System.out.println("----MENU----");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar lista de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar destinos turísticos por país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");
            
            op = sc.nextInt();
            sc.nextLine();

            try {
                switch (op) {
                    case 1:
                        altaDestinoTuristico(destinos, paises);
                        break;
                    case 2:
                        mostrarTodosDestinos(destinos);
                        break;
                    case 3:
                        modificarPaisDestino(destinos, paises);
                        break;
                    case 4:
                        limpiarDestinos(destinos);
                        break;
                    case 5:
                        eliminarDestino(destinos);
                        break;
                    case 6:
                        mostrarDestinosOrdenadosPorNombre(destinos);
                        break;
                    case 7:
                        mostrarTodosPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(destinos);
                        break;
                } 
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor válido.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
            
            System.out.println("Precione ENTER para continuar");
			sc.nextLine();
        } while (op != 9);

        sc.close();
    }


    private static List<Pais> cargarPaises() {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("AR", "Argentina"));
        paises.add(new Pais("BR", "Brasil"));
        paises.add(new Pais("CL", "Chile"));
        paises.add(new Pais("UY", "Uruguay"));
        return paises;
    }

    private static void altaDestinoTuristico(List<Destino_Turistico> destinos, List<Pais> paises) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("----Agregar de Destino Turistico----");
        System.out.print("Ingrese codigo del destino turistico: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese nombre,paises turisticos habilitados:Argentina,Brazil,Bolivia,Uruguay ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese precio del destino turistico: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese código de país ");
        System.out.println("Codigos habilitados: \"AR\", \"BR\",\"CL\",\"UY\"");
        String codigoPais = sc.nextLine();

        Pais pais = buscarPaisPorCodigo(paises, codigoPais);
        if (pais == null) {
            System.out.println("País no encontrado. No se puede dar de alta el destino.");
        } else {
            System.out.print("Ingrese cantidad de días: ");
            int cantidadDias = sc.nextInt();

            Destino_Turistico nuevoDestino = new Destino_Turistico(codigo, nombre, precio, pais, cantidadDias);
            destinos.add(nuevoDestino);
            System.out.println("Destino turístico agregado correctamente.");
        }
    }

    private static void mostrarTodosDestinos(List<Destino_Turistico> destinos) {
        System.out.println("--- Todos los Destinos Turísticos ---");
        for (Destino_Turistico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void modificarPaisDestino(List<Destino_Turistico> destinos, List<Pais> paises) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("--- Modificar País de Destino Turístico ---");
        System.out.print("Ingrese código de destino turístico: ");
        String codigoDestino = sc.nextLine();

        Destino_Turistico destino = buscarDestinoPorCodigo(destinos, codigoDestino);
        if (destino == null) {
            System.out.println("Destino turístico no encontrado.");
        } else {
            System.out.print("Ingrese nuevo código de país: ");
            String nuevoCodigoPais = sc.nextLine();

            Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
            if (nuevoPais == null) {
                System.out.println("País no encontrado. No se puede modificar el país del destino.");
            } else {
                destino.setPais(nuevoPais);
                System.out.println("País modificado correctamente.");
            }
        }
    }

    private static void limpiarDestinos(List<Destino_Turistico> destinos) {
        System.out.println("--- Limpiar Lista de Destinos Turísticos ---");
        destinos.clear();
        System.out.println("Lista de destinos turísticos vaciada.");
    }

    private static void eliminarDestino(List<Destino_Turistico> destinos) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("--- Eliminar Destino Turístico ---");
        System.out.print("Ingrese código de destino turístico a eliminar: ");
        String codigoEliminar = sc.nextLine();

        Iterator<Destino_Turistico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            Destino_Turistico destino = iterator.next();
            if (destino.getCodigo().equals(codigoEliminar)) {
                iterator.remove();
                System.out.println("Destino turístico eliminado correctamente.");
                return;
            }
        }
        System.out.println("Destino turístico no encontrado.");
    }

    private static void mostrarDestinosOrdenadosPorNombre(List<Destino_Turistico> destinos) {
        System.out.println("--- Destinos Turísticos Ordenados por Nombre ---");
        Collections.sort(destinos, Comparator.comparing(Destino_Turistico::getNombre));
        mostrarTodosDestinos(destinos);
    }

    private static void mostrarTodosPaises(List<Pais> paises) {
        System.out.println("--- Todos los Países ---");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    private static void mostrarDestinosPorPais(List<Destino_Turistico> destinos) {
    	Scanner sc = new Scanner(System.in);

        System.out.println("----Mostrar Destinos Turísticos por País----");
        System.out.print("Ingrese código de país: ");
        String codigoPais = sc.nextLine();

        System.out.println("--- Destinos Turísticos del País ---");
        for (Destino_Turistico destino : destinos) {
            if (destino.getPais().getCodigo().equals(codigoPais)) {
                System.out.println(destino);
            }
        }
    }

    private static Pais buscarPaisPorCodigo(List<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equalsIgnoreCase(codigo)) {
                return pais;
            }
        }
        return null;
    }

    private static Destino_Turistico buscarDestinoPorCodigo(List<Destino_Turistico> destinos, String codigo) {
        for (Destino_Turistico destino : destinos) {
            if (destino.getCodigo().equalsIgnoreCase(codigo)) {
                return destino;
            }
        }
        return null;
	}

}
