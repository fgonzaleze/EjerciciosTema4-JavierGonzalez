package ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variables para los num introducidos
		int num1; 
		int num2;

		Scanner sc = new Scanner(System.in);
		
		// Pedimos los numeros 
		System.out.print("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		num2 = sc.nextInt();
		
		// Imprimimos llamando a la función recursiva
		System.out.println("El sumatorio de " + num1 + " es: " + FuncionesRecursivas.sumatorio(num1));
		System.out.println("La potencia de " + num1 + " y " + num2 + " es: " + FuncionesRecursivas.potencia(num1, num2));
		System.out.println("La serie Fibonacci de " + num1 + " es: " + FuncionesRecursivas.serieFibonacci(num1));

		sc.close();
	}

}
