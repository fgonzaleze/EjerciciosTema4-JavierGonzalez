package ejercicio01;
/**
 * Ejercicio sobre num primos y capicua
 * @author JGonzalez
 * @version 0.1, 05/12/2022
 */

public class Numeros {
	/**
	 * 
	 * @param num variable del num introducido para saber si es primo
	 * @return true si es primo, false si no lo es
	 */
	
	boolean primo(int num) {					// Establecemos una función no estática para saber si un número es primo
		boolean primo = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
	/**
	 * 
	 * @param num variable del num introducido para saber si es capicua
	 * @return true si es capicua, false si no lo es
	 */
	boolean capicua(int num) {					// Establecemos una función no estática para saber si un número es capícua
		boolean capicua = true;
		int numGuardado;
		int inverso = 0;
		int unidad = 0;
		if (num < 10) {							// Condicional ya que cualquier numero menor que 10 es capicua al ser un solo numero

			capicua = true; // Capicua será true

		} else if (num >= 10) {
			// Vamos a buscar el número que se corresponde en el metodo capicua con su
			// contrario desde atrás, y lo guardamos en una variable para no perderlo
			numGuardado = num;
			// El bucle while se repetirá mienstras el numero sea distinto de 0.
			while (numGuardado != 0) {
				// Hacemos el módulo del num guardado entre 10 y lo guardamos en la variable
				// unidad para ir llevando la última
				unidad = numGuardado % 10;
				// A inverso lo multiplicamos por 10 y le sumamos la unidad
				inverso = inverso * 10 + unidad;

				// Le quitamos la última cifra de nuevo al numGuardado.
				numGuardado = numGuardado / 10;
			}
			// Condicional para que capicua vuelva con su valor correspondiente
			if (num == inverso) {
				capicua = true;
			} else {
				capicua = false;
			}
		}
		// Return para devolver la variable
		return capicua;

	}
}
