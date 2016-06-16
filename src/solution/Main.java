package solution;

public class Main {

	public static void main(String[] args) {
		double x = 5.0;
		double epsilon = Mathf.initEpsilon(10);
		double[] array = Mathf.initVec(1.0, -4.0, 6.0, -4.0, 1.0);
		Way.newton(x, array, epsilon);
		Way.newton(-x, array, epsilon);
	}

}
