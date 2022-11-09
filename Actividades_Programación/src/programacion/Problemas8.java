package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Programa que lea un número N filtrando que debe ser mayor que cero y calcula su factorial.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		int n;
		int cont=1;
		int fact=1;
		
		System.out.print("Introduce un numero:");
		n=teclado.nextInt();
		
		while(cont<=n) {
			fact=fact*cont;
			cont++;
		}
		System.out.print(fact);
	}
	
}