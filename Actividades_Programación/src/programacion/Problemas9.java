package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Un número se dice que es perfecto cuando la suma de sus divisores propios –todos los divisores a excepción del propio número-, es igual a dicho número. Hacer un programa que lea un número y nos diga si es perfecto o no.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		int n;
		int suma = 0;
		
		System.out.println ("Introduzca un Numero: ");
	    n = teclado.nextInt();
		for (int i = 1 ; i < n ; i++)
	           if (n % i == 0)
	        	   suma=suma+i;
		if(suma==n) {
			System.out.println ("El numero "+ n +" es perfecto.");
		}
		else {
			System.out.println ("El numero "+ n +" no es perfecto.");
		}
		
	}
	
}