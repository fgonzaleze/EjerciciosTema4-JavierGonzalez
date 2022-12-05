package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variables para cuando solicitemos los numeros
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca el tercer numero: ");
		num3 = sc.nextInt();
		
		// Las funciones iran a la funcion dependiendo de la cantidad de variables asignadas
		System.out.println("Función 1: ");
		NumerosAleatorios.numerosAleatorios(num1);						// Funcion 1 a la funcion que tiene 1 variable
		System.out.println("Función 2: ");
		NumerosAleatorios.numerosAleatorios(num1, num2);				// Funcion 2 a la funcion que tiene 2 variables
		System.out.println("Función 3: ");
		NumerosAleatorios.numerosAleatorios(num1, num2, num3);			// Funcion 3 a la funcion que tiene 3 variables
		sc.close();

	}

}
