package lesson;

public class Lesson01 {

	public static void main(String[] args) {
		double a = Math.pow(4, 7);
		double b = Math.pow(7, 9);
		System.out.println(Math.sqrt(a / b));
		double c = Math.cos(3d / 4d * Math.PI);
		double d = Math.pow(Math.E, 6) * Math.sqrt(Math.log(5));
		System.out.println(Math.abs(c - d));
		long f1 = 0;
		long f2 = 1;
		int count = 1;
		long num = 0;
		while (count < 50) {
			num = frac(f1, f2);
			f1 = f2;
			f2 = num;
			count++;
		}
		System.out.println(num);
		double f = 1;
		int count02 = 0;
		while (f > Math.pow(10, -5)) {
			f /= 3d;

			count02++;
		}
		System.out.println(count02);
		double e = Math.pow(3, 11);
		System.out.println((e - 1d) / (2 * e));

		int num2 = 9;
		double result = 1;
		while (num2 >= 1) {
			result += 1d / factorial(num2);
			num2--;
		}
		System.out.println(result);
		double[][] array1 = new double[3][3];
		double[][] array2 = new double[3][3];
		double[][] resultArray = new double[3][3];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				array2[i][j] = (double)(i + j + 2);
				double temp = (i + 1) * (j + 1);
				array1[i][j] = (double)Math.sqrt(temp);
				resultArray[i][j] = array1[i][j] + array2[i][j];
				System.out.println("i:"+ i + "j:" + j + "result:" + resultArray[i][j]);
			}
		}
		
	}

	public static long frac(long fn, long fn1) {
		return fn + fn1;
	}

	static int factorial(int n) {
		int fact = 1;
		if (n == 0)
			return fact;
		else { // in case of n > 0
			for (int i = n; i > 0; i--)
				fact *= i;
			return fact;
		}
	}
}
