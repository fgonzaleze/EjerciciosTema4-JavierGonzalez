package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
				int num; //Variable para guardar lo que pedimos por el escáner
				
				Scanner sc= new Scanner (System.in); 			
				System.out.print("Introduzca un número para saber si es capicua o primo:");
				num = sc.nextInt();
				
				// Vamos a crear un objeto ya que son funciones no estáticas.
				Numeros objeto = new Numeros();
				
				// Un if else para saber si el numero es primo o no, y lo mismo para el capicua
				if (objeto.primo(num)==true) {
					System.out.println(num + " es primo.");
				} else {
					System.out.println("El número no es primo");
				} if (objeto.capicua(num)==true) {
					System.out.println(num + " es capicúa.");
				} else {
					System.out.println("El numero no es capicúa");
				}
			
				//Cerramos el escáner.
				sc.close();


	}

}
