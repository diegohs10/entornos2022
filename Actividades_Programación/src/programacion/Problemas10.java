package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Dado un numero N leído por teclado encuentra el numero P primo mas cercano a él por exceso (o que es mayor).
		//Autor:Diego Herrera
		//Fecha:25/10/2022
		int n;
		boolean esPrimo=false;
		int primoExceso=n+1;
		boolean prueboPrimo;
		
		System.out.print("Pon un numero:");
		n=teclado.nextInt();
		
		while(!esPrimo)
			prueboPrimo=true;
			int i = 2 <= n - 1;
		for(i = 2; i < primoExceso; i++)
			if (primoExceso%i==0)
				prueboPrimo = false;
	}
	
}