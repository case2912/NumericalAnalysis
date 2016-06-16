package solution;

public final class Mathf {

	public static double[] initVec(double... number) {
		return number;
	}

	public static double initEpsilon(int order) {
		String epsilon = "1.0E";
		return Double.parseDouble(epsilon + Integer.toString(-order));
	}

	public static double f(double x, double[] array) {
		double temp = 0d;
		for (int i = 0; i < array.length; i++) {
			temp = temp * x + array[i];
		}
		return temp;
	}

	public static double df(double x, double[] array) {
		double temp = 0d;
		for (int i = 0; i < array.length - 1; i++) {
			temp = temp * x + array[i] * (array.length - i - 1);
		}
		return temp;
	}

	public static boolean judge(double x, double[] array, double epsilon) {
		return Math.abs(f(x, array)) > epsilon;
	}

	public static boolean judge(double x, double y, double epsilon) {
		return Math.abs((y - x) / y) > epsilon;
	}
}
