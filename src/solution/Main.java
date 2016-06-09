package solution;

public class Main {

	public static void main(String[] args) {
		double x = 30.0;
		double[] array = { 1.0, 1.0, -5.0, 3.0 };
		double epsilon = Mathf.initEpsilon(12);
		Way.newton(x, array, epsilon);
		Way.newton(-x, array, epsilon);
	}

}
