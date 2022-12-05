package ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Creamos el objeto, en este caso con el nombre cuenta
		Operaciones cuenta = new Operaciones();

		// Introducimos por teclado
		System.out.print("Introduzca el primer numero: ");
		cuenta.A = sc.nextDouble();
		System.out.print("Introduzca el segundo numero: ");
		cuenta.B = sc.nextDouble();
		
		// Imprimimos llamando a la función 
		System.out.println("Suma: " + cuenta.A + " + " + cuenta.B + " = " + cuenta.suma());
		System.out.println("Resta: " + cuenta.A + " - " + cuenta.B + " = " + cuenta.resta());
		System.out.println("Multiplicación: " + cuenta.A + " x " + cuenta.B + " = " + cuenta.multiplicacion());
		System.out.println("División: " + + cuenta.A + " / " + cuenta.B + " = " + cuenta.division());

		sc.close();

	}

}
