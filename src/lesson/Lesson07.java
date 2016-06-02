package lesson;

import lesson.Lesson06;

public class Lesson07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = { 1.0, -4.0, 13.0 / 4.0, -3.0 / 4.0 };
		double eps = 1.0E-10;
		int count = 300;
		double x = 6.0;
		
		//System.out.println(Lesson06.newton(x, eps, count, array));
		System.out.println(secant2(x, eps, count, array));
	//	System.out.println(parallelChord(x, eps, count, array));
		System.out.println();
	//	System.out.println(Lesson06.newton(-x, eps, count, array));
		System.out.println(secant2(-x, eps, count, array));
	//	System.out.println(parallelChord(-x, eps, count, array));
		System.out.println();
		System.out.println();
		System.out.println(Lesson06.newton(x, eps, count, array));
		System.out.println(secant(x, eps, count, array));
		System.out.println(parallelChord(x, eps, count, array));
		System.out.println();
		System.out.println(Lesson06.newton(-x, eps, count, array));
		System.out.println(secant(-x, eps, count, array));
		System.out.println(parallelChord(-x, eps, count, array));
	}

	public static boolean decide(double a, double eps, double[] array) {
		return (Math.abs(Lesson06.function(a, array)) >= eps);
		
	}
	public static double secant(double x, double eps, int count, double[] array) {
		double temp = x + 1.0;
		int iter = 0;
		while (decide(temp, eps, array) && (iter < count)) {
			double a = temp;
			temp = temp - Lesson06.function(temp, array)
					* ((temp - x) / (Lesson06.function(temp, array) - Lesson06.function(x, array)));
			x = a;
			iter++;
		}
		System.out.println("Count is " + iter + ". Result is");
		return temp;
	}

	public static double parallelChord(double x, double eps, int count, double[] array) {
		double x0 = x;
		int iter = 0;
		while (decide(x, eps, array) && (iter < count)) {
			x = x - Lesson06.function(x, array) / Lesson06.primeFunction(x0, array);
			iter++;
		}
		System.out.println("Count is " + iter + ". Result is");
		return x;
	}
	public static boolean decide2(double a,double b, double eps, double[] array) {
		return Math.abs((a - b)/a) < eps;
	}
	public static double secant2(double x, double eps, int count, double[] array) {
		double temp = x + 1.0;
		int iter = 0;
		while (decide2(temp,x, eps, array) && (iter < count)) {
			double a = temp;
			temp = temp - Lesson06.function(temp, array)
					* ((temp - x) / (Lesson06.function(temp, array) - Lesson06.function(x, array)));
			x = a;
			iter++;
		}
		System.out.println("Count is " + iter + ". Result is");
		return temp;
	}
	

}
