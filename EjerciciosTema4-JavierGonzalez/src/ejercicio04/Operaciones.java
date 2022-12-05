package ejercicio04;
/**
 * Calculos de suma, resta, multiplicación y división
 * @author JGonzalez
 * @version 0.1, 05/12/2022
 */
public class Operaciones {

	double A; 					// Primer numero que escribe por teclado
	double B;					// Segundo numero que escribe por teclado

	/**
	 * 
	 * @return el valor de la suma
	 */
	public double suma() {
		double suma;
		suma = A + B;
		return suma;
	}
	/**
	 * 
	 * @return el valor de la resta
	 */

	public double resta() {
		double resta;
		resta = A - B;
		return resta;
	}
	/**
	 * 
	 * @return el valor de la multiplicacion
	 */

	public double multiplicacion() {
		double mult;
		mult = A * B;
		return mult;
	}
	/**
	 * 
	 * @return el valor de la division
	 */

	public double division() {
		double div;
		div = A / B;
		return div;
	}

}
