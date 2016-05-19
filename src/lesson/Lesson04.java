package lesson;

public class Lesson04 {

	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.3;
		double c = 0.4;
		System.out.println((a + b) + c);
		System.out.println(a + (b + c));

		System.out.println(method01(Math.pow(10, -7)));
		System.out.println(method02());
		System.out.println(method01b(Math.pow(10, -7)));

		System.out.println(method03b(500));
		System.out.println(method03b(5000));
		System.out.println(method03b(50000));
		int l = 1;
		while (method03b(l) != method03b(l + 1)) {
			l++;
		}
		System.out.println(l);

		System.out.println(method03(500));
		System.out.println(method03(5000));
		System.out.println(method03(50000));
		int k = 1;
		while (method03(k) != method03(k + 1)) {
			// System.out.println(k);
			// System.out.println(method03(k));
			k++;
		}
		System.out.println(k);
		System.out.println(method03(2597));
		System.out.println(method03(2598));

	}

	public static double method01(double x) {
		return (1 - Math.cos(x)) / (x * x);

	}

	public static double method02() {
		return Math.pow(10, 14) - Math.pow(10, 14) * Math.cos(Math.pow(10, -7));
	}

	public static float method03(int number) {
		float sum = 0;
		for (int i = number; i > 0; i--) {
			sum += 1 / (float) (i * i);
		}
		return sum;
	}

	public static float method03b(int number) {
		float sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += 1 / (float) (i * i);
		}
		return sum;
	}
	public static double method01b(double x) {
		return Math.pow(Math.sin(x), 2) / (x * x * (1 + Math.cos(x)));
		
	}
}
