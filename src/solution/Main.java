package solution;

public class Main {

	public static void main(String[] args) {
		double a = -3.0;
		double b = 0.2;
		double epsilon = Mathf.initEpsilon(12);
		double[] array = Mathf.initVec(1.0, -2.0, -1.0, 2.0);
		Way.bisection(a, b, array, epsilon);
		System.out.printf("%.2e\n", Mathf.f(1.0000000000009095, array));
		System.out.println((Math.log(1.5) + 12 * Math.log(10))/Math.log(2) - 1);
	}
}
