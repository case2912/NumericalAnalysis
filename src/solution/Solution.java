package solution;

public final class Solution {

	public static void newton(double x, double[] array, double epsilon) {
		while (Mathf.judge(x, array, epsilon)) {
			x = x - Mathf.f(x, array)/Mathf.df(x, array);
		}
		Debug.print(x);
	}
}
