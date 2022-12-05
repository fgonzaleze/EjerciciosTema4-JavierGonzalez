package ejercicio05;

/**
 * Funciones recursivas para calcular el sumatorio factorial, la potencia y la serie de fibonacci
 * @author JGonzalez
 * @version 0.1, 05/12/2022
 */

public class FuncionesRecursivas {
	/**
	 * Calcula el sumatorio factorial del numero introducido
	 * @param num numero introducido
	 * @return suma de los numeros comprendidos entre 1 y n
	 */
	public static int sumatorio(int num) {
		int suma = 0;
		if (num == 1) {
			suma = 1;
		} else {
			suma = num + sumatorio(num - 1);											// La suma será el num más el sumatorio 
		}
		return suma;																	// Devolvemos el resultado de la suma
	}
	/**
	 * Calcula la potencia
	 * @param a potencia
	 * @param num numero introducido
	 * @return resultado de la elevación
	 */
	public static double potencia(double a, int num) {
		double resultado = 0;
		if (num == 0) {																	// Si es igual a 0
			resultado = 1;																// El resultado será 1 para la recursiva
		} else if (num != 0) {															// Si el num es diferente de 0
			resultado = a * potencia(a, num - 1);
		}
		return resultado;																// Devolvemos el resultado de la potencia
	}
	/**
	 * Calculo de la serie de Fibonacci
	 * @param num numero introducido
	 * @return 
	 */
	public static int serieFibonacci(int num) {
		int fibonacci = 0;
		if (num <= 1) {																		// Si el num es menor o igual a 1
			fibonacci = num;																// Fibonacci será igual al num
		} else {
			fibonacci = serieFibonacci(num - 1) + serieFibonacci(num - 2);					// El numero de fibonacci será el num dado - 1 más el num dado - 2
		}
		return fibonacci;																	// Devolvemos la serie de fibonacci
	}
}
