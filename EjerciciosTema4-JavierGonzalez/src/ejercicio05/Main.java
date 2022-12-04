package ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num1; 
		int num2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número y pulse Intro: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2 = sc.nextInt();

		System.out.println("El sumatorio de " + num1 + " es: " + FuncionesRecursivas.sumatorio(num1));
		System.out.println("La potencia de " + num1 + " y " + num2 + " es: " + FuncionesRecursivas.potencia(num1, num2));
		System.out.println("La serie Fibonacci de " + num1 + " es: " + FuncionesRecursivas.serieFibonacci(num1));

		sc.close();
	}

}
