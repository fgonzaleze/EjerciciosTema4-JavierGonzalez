package ejercicio02;

import java.util.Scanner;

public class Main {

	static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el radio: ");
	
		Esfera.radio = sc.nextDouble();
		
		System.out.println("La superficie es " + Esfera.superficie() + " y el volumen es " + Esfera.volumen());
		
		sc.close();
	}

}
