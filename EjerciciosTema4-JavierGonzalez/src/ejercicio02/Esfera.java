package ejercicio02;

/**
 * Calcular volumen y superficie de una esfera
 * @author JGonzalez
 * @version 0.1, 05/12/2022
 */

public class Esfera {
	static double radio;
	/**
	 * Calcular la superficie
	 * @return Superficie calculada  
	 */

	static double superficie() {
		double superficie;
		superficie = (4 * Math.PI) * (Math.pow(radio, 2));
		return superficie;
	}
	/**
	 * Calcular el volumen
	 * @return Volumen calculado
	 */
	static double volumen() {
		double volumen;
		volumen = ((4 * Math.PI) / 3) * (Math.pow(radio, 3));
		return volumen;
	}

}
