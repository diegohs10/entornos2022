package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que va leyendo
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		String frase;
		int contador=0;
		int longitud;
		do {
			System.out.print("Ingrese una frase:");
			frase=teclado.nextLine();
			longitud=frase.length();
		}while(longitud>80);
		for (int contimp=0;contimp<longitud;contimp+=2) {
		System.out.println("Los caracteres impares son los siguientes: " + frase.charAt(contimp));
		}
		for (int contpar=1;contpar<longitud;contpar+=2) {
			System.out.println("Los caracteres pares son los siguientes: " + frase.charAt(contpar));
		}
	}
}