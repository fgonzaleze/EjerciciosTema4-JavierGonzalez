package ejercicio02;

public class Esfera {
	static double radio;

	static double superficie() {
		double superficie;
		superficie = (4 * Math.PI) * (Math.pow(radio, 2));
		return superficie;
	}

	static double volumen() {
		double volumen;
		volumen = ((4 * Math.PI) / 3) * (Math.pow(radio, 3));
		return volumen;
	}

}
