package pruebaseclipse;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = s.nextInt();
		System.out.println("El número introducido es:" + numero);
		System.out.println("Contando... ");
		for(int i=0;i<=numero;i++) {
			System.out.println(i);
		}
	}

}
