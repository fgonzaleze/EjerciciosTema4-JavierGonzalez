package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

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
		System.out.println("Función 1: ");
		NumerosAleatorios.numerosAleatorios(num1);
		System.out.println("Función 2: ");
		NumerosAleatorios.numerosAleatorios(num1, num2);
		System.out.println("Función 3: ");
		NumerosAleatorios.numerosAleatorios(num1, num2, num3);
		sc.close();

	}

}
