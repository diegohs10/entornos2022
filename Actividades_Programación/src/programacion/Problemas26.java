package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que va leyendo frase por teclado y escribe a continuación cuantas mayúsculas, minúsculas y números contiene.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		String frase;
		int longitud;
		int contnum=0;
		int num=0;
		int contmay=0;
		int contmin=0;
		
		do {
			System.out.print("Introduzca una frase: ");
			frase=teclado.nextLine();
			longitud=frase.length();
		}while(longitud>80);
		for (int cont=0;cont<longitud;cont++) {
			char caracter=frase.charAt(cont);
			num=caracter;
			if(num!=32) {
				if(num>=48&&num<=57) {
					contnum++;
				}else if (num>=65 && num<=90) {
					contmay++;
				}
				else {contmin++;}
			}
		}
		System.out.print("Hay " + contnum + " numeros, " + contmay + " mayusculas y " + contmin + " minusculas.");
	}
}