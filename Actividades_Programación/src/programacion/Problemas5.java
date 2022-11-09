package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que lee una serie de números por teclado de manera que cuando el número leído sea el cero ya no se introduzcan más; el programa debe calcular y escribir la suma de los números de la serie y cuántos se han introducido en total.
		//Autor:Diego Herrera
		//Fecha:24/10/2022
		int n;
		int contador = 0;
		int suma=0;
		
		do {
			System.out.print("Ingresa un numero: ");
        	n = teclado.nextInt();
        	suma = n + suma;
        	contador++;
		}
        while (n!=0);
		System.out.print("Se han escrito "+ contador +" numeros y su suma es "+ suma);
        }
    }