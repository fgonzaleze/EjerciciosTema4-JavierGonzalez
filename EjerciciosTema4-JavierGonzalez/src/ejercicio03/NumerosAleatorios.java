package ejercicio03;
/**
 * Tres funciones que se encargarán de generar numeros aleatorios
 * @author JGonzalez
 * @version 0.1, 05/12/2022
 */

public class NumerosAleatorios {
	/**
	 * Indica la cantidad de num enteros a generar
	 * @param cantidad Cantidad de num que se van a generar introducida por el usuario
	 */

	static void numerosAleatorios(int cantidad) {

		int numRandom = 0; 																// Guardamos los numeros aleatorios
		for (int i = 0; i < cantidad; i++) {
			numRandom = (int) (Math.random() * 2);
			System.out.print(numRandom + " ");
		}
		System.out.println();
	}
/**
 * Valor máximo del numero aleatorio
 * @param cantidad cantidad de num que va a generar 
 * @param max Para establecer el maximo
 */
	static void numerosAleatorios(int cantidad, int max) {
		int numRandom = 0; 																// Guardamos los numeros aleatorios
		for (int i = 0; i < cantidad; i++) {
			numRandom = (int) (Math.random() * max);									
			System.out.print(numRandom + " "); 											// Mostramos el resultado de los numeros aleatorios como se nos indica
		}
		System.out.println();
	}
/**
 * Valores generados aleatoriamente comprendidos en el valor maximo y el minimo
 * @param cantidad cantidad de numeros a mostrar
 * @param min variable para el numero minimo
 * @param max variable para el numero maximo
 */
	static void numerosAleatorios(int cantidad, int min, int max) {
		int numRandom = 0;
		for (int i = 0; i < cantidad; i++) {
			numRandom = (int) (Math.random() * (max - min) + min);
			System.out.print(numRandom + " ");
		}
	}

}
