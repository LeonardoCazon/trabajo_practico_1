package ar.edu.unju.fi.ejercicio17.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio17.model.pocicion;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> listaJugadores = new ArrayList<>();
		int op=0;
		
		do {
			System.out.println("----MENU----");
			System.out.println("1)Alta de jugador");
			System.out.println("2)Mostrar los datos del jugador (el usuario debe ingresar el nombre "
								+ "y el apellido)");
			System.out.println("3)Mostrar todos los jugadores ordenados por apellido.");
			System.out.println("4)Modificar los datos de un jugador (el usuario debe ingresar el "
								+ "nombre y el apellido del jugador)");
			System.out.println("5)Eliminar un jugador (el usuario debe ingresar el nombre y apellido. "
								+ "Utilice Iterator). ");
			System.out.println("6)Mostrar la cantidad total de jugadores que tiene el ArrayList");
			System.out.println("7)Mostrar la cantidad de jugadores que pertenecen a una nacionalidad "
								+ "(el usuario ingresa la nacionalidad)");
			System.out.println("8)Salir");
			
			try {
				op = sc.nextInt();
				if(!(op >= 1 || op <= 8)) {
					System.out.println("Se debe ingresar una opcion del menu. Ingrese nuevamente:");
					sc.next();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Debe Ingresar una opcion del menu. Ingrese nuevamente:");
				
			}
			
			switch(op) {
			case 1:
				Jugador j =new Jugador();
				j=crearJugador();
				listaJugadores.add(j);
				break;
			case 2:
				mostrarPorNombre(listaJugadores);
				break;
			case 3:
				mostrarTodoOrdenado(listaJugadores);
				break;
			case 4:
				modificarJugador(listaJugadores);
				break;
			case 5:
				eliminarJugadorNombre(listaJugadores);
				break;
			case 6:
				System.out.println("---La cantidad de jugadores registrados es de:"+listaJugadores.size());
				break;
			case 7:
				filtroNacionalidad(listaJugadores);
				break;
			}
			System.out.println("Precione ENTER para continuar");
			sc.nextLine();
			sc.nextLine();

			
			
			
			
		}while(op != 8);
				
	}
	
	public static Jugador crearJugador() {
		Scanner sc= new Scanner(System.in);
		Jugador j = new Jugador();
		try {
			System.out.println("---Ingrese Datos---");
			System.out.println("Ingrese Nombre:");
			j.setNombre(sc.nextLine());
			System.out.println("Ingrese Apellido:");
			j.setApellido(sc.nextLine());
			System.out.println("Ingrese la fecha de nacimiento (formato dd/mm/yyyy):");
			String fechaNacStr = sc.nextLine();			
			String[] partFecha = fechaNacStr.split("/");
			int dia = Integer.parseInt(partFecha[0]);
			int mes = Integer.parseInt(partFecha[1]) - 1;
			int anio = Integer.parseInt(partFecha[2]);
			Calendar fechNac = new GregorianCalendar(anio, mes, dia);
			j.setFechNac(fechNac);
			System.out.println("Ingrese nacionalidad:");
			j.setNacionalidad(sc.nextLine());
			System.out.println("Ingrese estatura:");
			j.setEstatura(sc.nextFloat());
			System.out.println("Ingrese peso:");
			j.setPeso(sc.nextFloat());
			sc.nextLine();
			int op=0;
			do {
				System.out.println("\nIngrese la pocicion del jugador");
				System.out.println("1)Delantero");
				System.out.println("2)Medio");
				System.out.println("3)Defensa");
				System.out.println("4)Arquero");
				op = sc.nextInt();
				switch(op) {
				case 1:
					j.setPocicion(pocicion.DELANTERO);
					break;
				case 2:
					j.setPocicion(pocicion.MEDIO);
					break;
				case 3:
					j.setPocicion(pocicion.DEFENSA);
					break;
				case 4:
					j.setPocicion(pocicion.ARQUERO);
					break;
				}
			}while(op <= 1 && op >=4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR AL INGRESO DE DATOS]");
		}
		return j;
	}
	
	public static void mostrarPorNombre(ArrayList<Jugador> listaJugadores) {
		String nombreBusc,apellidoBusc;
		Scanner sc= new Scanner(System.in);
		
		if(listaJugadores.size() == 0) {
			System.out.println("---El registro de jugadores esta vacio---");
		}
		else {
			System.out.println("\n---Ingrese el nombre y apellido del jugador a buscar---");
			System.out.println("Ingrese el nombre:");
			nombreBusc=sc.nextLine();
			System.out.println("Ingrese el apellido:");
			apellidoBusc=sc.nextLine();
			for(Jugador list : listaJugadores) {
				if(nombreBusc.equalsIgnoreCase(list.getNombre()) && apellidoBusc.equalsIgnoreCase(list.getApellido())){
					System.out.println("\n----Datos del Jugador "+list.getApellido()+" "+list.getNombre()+"----");
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String fechaFormateada = sdf.format(list.getFechNac().getTime());
		            System.out.println("Fecha de nacimiento: " + fechaFormateada);					
		            System.out.println("Nacionalidad:"+list.getNacionalidad());
					System.out.println("Estatura:"+list.getEstatura());
					System.out.println("Peso:"+list.getPeso());
					System.out.println("Pocicion de juego:"+list.getPocicion());			
				}
				else {
					System.out.println("---No se encontro el jugador buscado---");	
				}
			}
		}
	}
	
	public static void mostrarTodoOrdenado(ArrayList<Jugador> listaJugadores) {
		System.out.println("---Lista de Jugadores Ordenado por Apellido y Nombre---");
		
		if(listaJugadores.size() == 0) {
			System.out.println("---El registro de jugadores esta Vacio---");
		}
		else {
			Collections.sort(listaJugadores, new Comparator<Jugador>() {
				public int compare(Jugador j1, Jugador j2) {
					return j1.getApellido().compareTo(j2.getApellido());
	            }
			});
			
			for(Jugador list : listaJugadores) {
				System.out.println("\n----Datos del Jugador "+list.getApellido()+" "+list.getNombre()+"----");
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String fechaFormateada = sdf.format(list.getFechNac().getTime());
	            System.out.println("Fecha de nacimiento: " + fechaFormateada);
				System.out.println("Nacionalidad:"+list.getNacionalidad());
				System.out.println("Estatura:"+list.getEstatura());
				System.out.println("Peso:"+list.getPeso());
				System.out.println("Pocicion de juego:"+list.getPocicion());
			}
		}	
	}
	
	public static void modificarJugador(ArrayList<Jugador> listaJugadores) {
		String nombreBusc,apellidoBusc;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n---Ingrese el nombre y apellido del jugador a modificar---");
		System.out.println("Ingrese el nombre:");
		nombreBusc=sc.nextLine();
		System.out.println("Ingrese el apellido:");
		apellidoBusc=sc.nextLine();
		
		for(Jugador list : listaJugadores) {
			int i=-1;
			i++;
			if(nombreBusc.equalsIgnoreCase(list.getNombre()) && apellidoBusc.equalsIgnoreCase(list.getApellido())){
				Jugador j = new Jugador();
				try {
					System.out.println("---Ingrese Datos para modificar al Jugador---");
					System.out.println("Ingrese Nombre:");
					j.setNombre(sc.nextLine());
					System.out.println("Ingrese Apellido:");
					j.setApellido(sc.nextLine());
					System.out.println("Ingrese la fecha de nacimiento (formato dd/mm/yyyy):");
					String fechaNacStr = sc.nextLine();			
					String[] partFecha = fechaNacStr.split("/");
					int dia = Integer.parseInt(partFecha[0]);
					int mes = Integer.parseInt(partFecha[1]) - 1;
					int anio = Integer.parseInt(partFecha[2]);
					Calendar fechNac = new GregorianCalendar(anio, mes, dia);
					j.setFechNac(fechNac);
					System.out.println("Ingrese nacionalidad:");
					j.setNacionalidad(sc.nextLine());
					System.out.println("Ingrese estatura:");
					j.setEstatura(sc.nextFloat());
					System.out.println("Ingrese peso:");
					j.setPeso(sc.nextFloat());
					sc.nextLine();
					int op=0;
					do {
						System.out.println("\nIngrese la pocicion del jugador");
						System.out.println("1)Delantero");
						System.out.println("2)Medio");
						System.out.println("3)Defensa");
						System.out.println("4)Arquero");
						op = sc.nextInt();
						switch(op) {
						case 1:
							j.setPocicion(pocicion.DELANTERO);
							break;
						case 2:
							j.setPocicion(pocicion.MEDIO);
							break;
						case 3:
							j.setPocicion(pocicion.DEFENSA);
							break;
						case 4:
							j.setPocicion(pocicion.ARQUERO);
							break;
						}
					}while(op <= 1 && op >=4);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("[ERROR AL INGRESO DE DATOS]");
				}
				
				listaJugadores.set(i, j);
			}
			else {
				System.out.println("---No se encontro el jugador buscado---");	
			}
		}
	}

	public static void eliminarJugadorNombre(ArrayList<Jugador> listaJugadores) {
		String nombreBusc,apellidoBusc;
		Scanner sc= new Scanner(System.in);
		
		if(listaJugadores.size() == 0 ) {
			System.out.println("---El registro de jugadores esta vacio---");
		}
		else {
			System.out.println("\n---Ingrese el nombre y apellido del jugador a eliminar---");
			System.out.println("Ingrese el nombre:");
			nombreBusc=sc.nextLine();
			System.out.println("Ingrese el apellido:");
			apellidoBusc=sc.nextLine();
			
			Iterator<Jugador> iterator = listaJugadores.iterator();
	        while (iterator.hasNext()) {
	            Jugador jugador = iterator.next();
	            if (jugador.getNombre().equals(nombreBusc) && jugador.getApellido().equals(apellidoBusc)) {
	                iterator.remove();
	                System.out.println("El jugador ha sido eliminado correctamente.");
	                break;
	            }
	            else {
	            	System.out.println("---No se encontro el jugador buscado---");
	            }
	        }
		}
	}
	
	public static void filtroNacionalidad(ArrayList<Jugador> listaJugadores) {
		String nacionBusc;
		Scanner sc= new Scanner(System.in);
		boolean flag=false;
		int n = 0;
		
		System.out.println("\n---Ingrese la nacionalidad de jugadores a buscar---");
		nacionBusc=sc.nextLine();
		
		for(Jugador list : listaJugadores) {
			if(nacionBusc.equalsIgnoreCase(list.getNacionalidad())){
				n++;
				flag = true;
			}
			else if(flag == false){
				System.out.println("---No existe ningun jugador de esta nacionalidad---");	
			}
			
			if(flag = true) {
				System.out.println("La cantidad de Jugadores con la nacionalidad "+nacionBusc+" es de:"
									+n);
			}
		}
		
		
	}
	
	
	
}