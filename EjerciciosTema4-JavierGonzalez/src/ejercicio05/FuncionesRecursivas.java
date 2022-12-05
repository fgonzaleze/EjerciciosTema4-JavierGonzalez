package ejercicio05;

public class FuncionesRecursivas {
	public static int sumatorio(int num) {
		int suma = 0;
		if (num == 1) {
			suma = 1;
		} else {
			suma = num + sumatorio(num - 1);
		}
		return suma;
	}
	public static double potencia(double a, int num) {
		double resultado = 0;
		if (num == 0) {
			resultado = 1;
		} else if (num != 0) {
			resultado = a * potencia(a, num - 1);
		}
		return resultado;
	}
	public static int serieFibonacci(int num) {
		int fibonacci = 0;
		if (num <= 1) {
			fibonacci = serieFibonacci(num - 1) + serieFibonacci(num - 2);
		} else {
			fibonacci = num;
		}
		return fibonacci;
	}
}
