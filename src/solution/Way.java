package solution;

public final class Way {

	public static void newton(double x, double[] array, double epsilon) {
		int count = 0;
		while (Mathf.judge(x, array, epsilon)) {
			x = x - Mathf.f(x, array) / Mathf.df(x, array);
			count++;
		}
		Debug.printCount(count);
		Debug.print(x);
	}
}
