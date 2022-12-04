package ejercicio03;

public class NumerosAleatorios {

	static void numerosAleatorios(int cantidad) {

		int numRandom = 0; 																// Guardamos los numeros aleatorios
		for (int i = 0; i < cantidad; i++) {
			numRandom = (int) (Math.random() * 2);
			System.out.print(numRandom + " ");
		}
		System.out.println();
	}

	static void numerosAleatorios(int cantidad, int max) {
		int numRandom = 0; 																// Guardamos los numeros aleatorios
		for (int i = 0; i < cantidad; i++) {
			numRandom = (int) (Math.random() * max);
			System.out.print(numRandom + " "); 											// Mostramos el resultado de los numeros aleatorios como se nos indica
		}
		System.out.println();
	}

	static void numerosAleatorios(int cantidad, int min, int max) {
		int numRandom = 0;
		for (int i = 0; i < cantidad; i++) {
			numRandom = (int) (Math.random() * (max - min) + min);
			System.out.print(numRandom + " ");
		}
	}

}
