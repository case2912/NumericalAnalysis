package lesson;

public class Lesson03 {

	public static void main(String[] args) {
		int[] a = {1,1,0,1};
		int[] b = {1,0,1};
		System.out.println(seisu(a) + syousu(b));
	}
	public static double hornerMethod(double x, double[] array) {
		double temp = 0d;
		for (int i = 0; i < array.length; i++) {
			temp = temp * x + array[i];
		}
		return temp;
	}
	public static int seisu(int[] array) {
		int temp = array[0];
		for (int i = 1; i < array.length; i++) {
			temp = temp * 2 + array[i];
		}
		return temp;
	}
	public static double syousu(int[] array) {
		double temp = array[array.length - 1];
		for (int i = array.length - 2; i >= 0; i--) {
			temp = temp * 0.5 + array[i];
		}
		return temp * 0.5;
	}

}
