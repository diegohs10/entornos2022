package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que calcule e imprima la suma de los números enteros comprendidos entre A y B que deben leerse por teclado y filtrarse para que A<=B. Los valores de A y B no deben incluirse en la suma.
		//Autor:Diego Herrera
		//Fecha:18/10/2022
		int A;
		int B;
		int suma=0;
		
		System.out.print("Ingrese un numero:");
		A=teclado.nextInt();
		System.out.print("Ingrese otro numero:");
		B=teclado.nextInt();
		for (int i = A+1; i < B; i++) {
			suma+=i;	
		}
		System.out.print(suma);
			
	}

}

