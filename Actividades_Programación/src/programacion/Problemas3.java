package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que, una vez que lea un número N por teclado, calcula y escribe los divisores propios de N por la pantalla.
		//Autor:Diego Herrera
		//Fecha:20/10/2022
		int n;
		
	    System.out.println ("Introduzca un Numero: ");
	    n = teclado.nextInt();
	    for (int i = 1 ; i <= n ; i++)
	           if (n % i == 0)
	               System.out.println (i);
	    }
	}