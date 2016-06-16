package solution;

public final class Way {

	public static void newton(double x, double[] array, double epsilon) {
		int count = 0;
		while (Mathf.judge(x, array, epsilon)) {
			x = x - Mathf.f(x, array) / Mathf.df(x, array);
			count++;
			System.out.printf("%.2e\n",Math.abs(x - 1.0));
		}
		Debug.printCount(count);
		Debug.print(x);
		//%.2e\n
	}

	public static void parallelChord(double x, double[] array, double epsilon) {
		int count = 0;
		double df0 = Mathf.df(x, array);
		while (Mathf.judge(x, array, epsilon)) {
			x = x - Mathf.f(x, array) / df0;
			count++;
		}
		Debug.printCount(count);
		Debug.print(x);
	}

	public static void secant(double x0, double x1, double[] array, double epsilon) {
		int count = 0;
		double xk = x0;
		double xk1 = x1;
		double temp = 0;
		while (Mathf.judge(xk1, array, epsilon)) {
			temp = xk1 - Mathf.f(xk1, array) / (Mathf.f(xk1, array) - Mathf.f(xk, array)) * (xk1 - xk);
			xk = xk1;
			xk1 = temp;
			count++;
		}
		Debug.printCount(count);
		Debug.print(xk1);
	}
}
