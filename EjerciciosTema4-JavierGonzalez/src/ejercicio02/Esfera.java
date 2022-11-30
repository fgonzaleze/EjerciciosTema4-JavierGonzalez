package ejercicio02;

public class Esfera {
	public static double radio;

	public static double superficie() {
		double superficie;
		superficie = (4 * Math.PI) * (Math.pow(radio, 2));
		return superficie;
	}

	public static double volumen() {
		double volumen;
		volumen = ((4 * Math.PI) / 3) * (Math.pow(radio, 3));
		return volumen;
	}

}
