package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que va leyendo una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada, hace un cifrado por sustitución (denominado cifrado CESAR) de la frase de modo que cada carácter se transforma en 3 códigos ASCII más.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		String frase;
		String frase2;
		int longitud;
		int num;
		int cont2=0;
		
		do {
			System.out.println("Ingrese una frase:");
			frase=teclado.nextLine();
			longitud=frase.length();
		}while(longitud>80);
		frase2=frase.toUpperCase();
		for (int cont=0;cont<longitud;cont++) {
			char caracter=frase.charAt(cont);
			num=caracter+3;
			char cosa=(char) num;
			System.out.print(cosa);
		}
		
	}
}
