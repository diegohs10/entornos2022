package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas29 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que va leyendo
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		String frase;
		String frase2;
		int num = 0;
		int longitud;
		int cont2=0; 
		char cosa = 0;
		char caracter = 0;
		
		do {
			System.out.println("Ingrese una frase:");
			frase=teclado.nextLine();
			longitud=frase.length();
		}while(longitud>80);
		frase2=frase.toUpperCase();
		for (int cont=0;cont<longitud;cont++) {
			caracter=frase.charAt(cont);}
			System.out.print("Dime un numero del 1 al 10:");
			num=teclado.nextInt() ;
			cosa=(char) (caracter+num);
			System.out.print("la palabra es " + cosa);
		
		
		
	}
}
