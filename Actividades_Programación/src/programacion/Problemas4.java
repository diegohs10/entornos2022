package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Programa que lee un número N y nos escribe en la pantalla mediante un mensaje si es o no primo.
		//Autor:Diego Herrera
		//Fecha:20/10/2022
		int n;
		int contador;
		
		System.out.print("Ingresa un numero: ");
        n = teclado.nextInt();
 
        contador = 0;
 
        for(int i = 1; i <= n; i++)
        {
            if((n % i) == 0)
            {
                contador++;
            }
        }
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}