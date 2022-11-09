package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que va leyendo números por el teclado hasta que lee el cero, que indicará el fin de la entrada de datos. El programa calcula y escribe la suma de los números introducidos en lugar par y de los introducidos en lugar impar.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		int n;
		int contador = 1;
		int sumpar=0;
		int sumimpar=0;
		
		do {
			System.out.print("Ingresa un numero: ");
        	n = teclado.nextInt();
        	if(contador%2==0) {
        	sumpar=sumpar+n;
        	}
        	else {
        	sumimpar=sumimpar+n;
        	}
        contador++;
		}
		while(n!=0);
		System.out.print("La suma de los numeros en posicion par es "+ sumpar +" y la de los numeros en posicion impar "+ sumimpar);
	}
	
}