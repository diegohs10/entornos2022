package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que va leyendo números por el teclado hasta que lee el cero, que indicará el fin de la entrada de datos. El programa calcula y escribe la suma de los números introducidos en lugar par y de los introducidos en lugar impar.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		String frase;
		int longitud;
		
		
		System.out.print("Ingrese una frase:");
		frase=teclado.nextLine();
		longitud=frase.length();
		
		for(int cont=0;cont<=longitud;cont++) {
			System.out.println(frase.substring(0,cont));
			
		}
	}
}