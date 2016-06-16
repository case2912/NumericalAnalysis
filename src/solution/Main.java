package solution;

public class Main {

	public static void main(String[] args) {
		// double x = 5.0;
		// double epsilon = Mathf.initEpsilon(10);
		// double[] array = Mathf.initVec(1.0, -4.0, 6.0, -4.0, 1.0);
		// Way.newton(x, array, epsilon);
		// Way.newton(-x, array, epsilon);
		double x = -5.0;
		n(x);
		s(x);
		p(x);
	}

	public static double f(double x) {
		return Math.sin(x) / (x - 1.0);
	}

	public static double df(double x) {
		return (x * Math.cos(x) - Math.cos(x) - Math.sin(x)) / ((x - 1.0) * (x - 1.0));
	}

	public static void p(double x) {
		int count = 0;
		double x0 = x;
		while (Math.abs(f(x)) > 1.0E-10) {
			x = x - f(x) / df(x0);
			count++;
		}
		Debug.printCount(count);
		Debug.print(x);
	}

	public static void n(double x) {
		int count = 0;
		while (Math.abs(x)>0) {
			x = x - f(x) / df(x);
			count++;
		}
		Debug.printCount(count);
		Debug.print(x);
	}

	public static void s(double x) {
		int count = 0;
		double x1 = x + 1.0;
		double temp = x;
		while (Math.abs(f(x1)) > 1.0E-10) {
			temp = x1 - f(x1) / (f(x1) - f(x)) * (x1 - x);
			x = x1;
			x1 = temp;
			count++;
		}
		Debug.printCount(count);
		Debug.print(x);
	}
}
