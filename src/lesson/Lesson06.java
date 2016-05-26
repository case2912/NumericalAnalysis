package lesson;

import lesson.Lesson03;

public class Lesson06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = { 1.0, -4.0, 13.0 / 4.0, -3.0 / 4.0 };
		System.out.println(newton(6, Math.pow(10, -7), 100, array));
		System.out.println(newton(-6, Math.pow(10, -7), 100, array));

	}

	/*
	 * Newton法 非線形方程式f(x)=0の解x=aを 数値的に求める反復法の一つ
	 */
	public static double newton(double x, double eps, int count, double[] array) {
		int temp = 0;
		while (Math.abs(function(x, array)) > eps) {// 残差を利用した例
			x = x - function(x, array) / primeFunction(x, array);
			temp++;
			if (temp >= count) {
				System.out.println("Error has occurred! Count is " + temp);
				return x;
			}
		}
		System.out.println("Count is " + temp + ". Result is");
		return x;
	}

	public static double function(double x, double[] array) {
		x = Lesson03.hornerMethod(x, array);
		return x;
	}

	public static double primeFunction(double x, double[] array) {
		double temp = 0d;
		for (int i = 0; i < array.length - 1; i++) {
			temp = temp * x + array[i] * (double)(array.length - i - 1);
		}
		return temp;
	}

}
