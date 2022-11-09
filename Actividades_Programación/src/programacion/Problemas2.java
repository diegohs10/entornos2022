package programacion;

import java.util.Iterator;
import java.util.Scanner;

public class Problemas2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Lee un número N que debe filtrarse entre 1 y 10 y a continuación calcula y escribe la tabla de multiplicar
		//Autor:Diego Herrera
		//Fecha:18/10/2022
		int N;
        System.out.print("Introduce un número entero: ");                                                         
        N = teclado.nextInt();
        System.out.println("TABLA DE MULTIPLICAR DEL " + N);
        for(int i = 1; i<=10; i++){
             System.out.println(N + " * " + i + " = " + N*i);
		}

	}

}

