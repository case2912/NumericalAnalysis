package solution;

public class Main {

	public static void main(String[] args) {
		double x = 6.0;
		double[] array = { 1.0, -4.0, 13.0 / 4.0, -3.0 / 4.0 };
		double epsilon = Mathf.initEpsilon(10);
		Solution.newton(x, array, epsilon);
		System.out.println(Math.pow(3.0000002469569567, 3.0));
		System.out.println(3.0000002469569567*3.0000002469569567*3.0000002469569567);
		x = 6.0;
		while (Math.abs(fu(x)) >= epsilon) {

			x = x - fu(x) / dfu(x);
		}
		System.out.println(x);
	}

	public static double fu(double x) {
		System.out.println(x);
		return x * x * x - 4.0 * x * x + 13.0 / 4.0 * x - 3.0 / 4.0;
	}


	public static double dfu(double x) {
		return 3.0 * x * x - 8.0 * x + 13.0 / 4.0;
	}

}
