package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que lee una secuencia de datos numéricos de longitud indefinida, de manera que cuando el número sea el cero cesará la entrada de dicha secuencia. El programa imprime la media de todos ellos, el mayor y el menor.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		int n;
		int mayor = 0;
		int menor = 0;
		double contador = 1;
		double total = 0;
		
		do {
			System.out.print("Ingresa un numero: ");
        	n = teclado.nextInt();
        	if (mayor<n) {
        		mayor=n;
        		if(menor==0);
        			menor=mayor;
        	}
		}
		while (n!=0);
		
		double media=total/contador;
		contador++;
		System.out.print("La media es "+ media +" el mayor es "+ mayor +" el menor es "+ menor);
	}
	
}