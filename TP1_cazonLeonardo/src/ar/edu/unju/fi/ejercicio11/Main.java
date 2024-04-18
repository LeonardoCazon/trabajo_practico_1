package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j, num = 80;
		
		for(i = 2, j = 40; j > 0; i++, j--) {
			System.out.print(num + " ");
			num += (j-i-1);
		}
	}
}
