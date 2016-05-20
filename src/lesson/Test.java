package lesson;

public class Test {

	public static void main(String[] args) {
		int number = 21;
		System.out.println("結果は" + exam(number));

	}

	public static void init(long[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = 0;
			}
		}
		array[0][0] = 0;

	}

	public static void init_x(long[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
			}
		}
		array[0][0] = 0;

	}

	public static void init_y(long[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (j == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}

			}
		}
		array[0][0] = 0;

	}

	public static void print(long[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void vertical(long[][] a, long[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != 0) {
					for (int j2 = 0; j2 < b.length; j2++) {
						b[j2][j] += a[i][j];
					}
					b[i][j] -= a[i][j];
				}
			}
		}
	}

	public static void horizontal(long[][] a, long[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != 0) {
					for (int j2 = 0; j2 < b[0].length; j2++) {
						b[i][j2] += a[i][j];
					}
					b[i][j] -= a[i][j];
				}
			}
		}

	}

	public static int exam(int number) {
		int count = number;
		long[][] cache1 = new long[4][5];
		long[][] cache2 = new long[4][5];
		int result = 0;
		init(cache1);
		init(cache2);
		init_x(cache1);
		System.out.println("横から進むとき");
		print(cache1);
		
		while (count > 0) {
			vertical(cache1, cache2);
			long[][] temp = cache1;
			cache1 = cache2;
			cache2 = temp;
			print(cache1);
			init(cache2);
			count--;
			if (count == 0) {
				break;
			}

			horizontal(cache1, cache2);
			temp = cache1;
			cache1 = cache2;
			cache2 = temp;
			print(cache1);
			init(cache2);
			count--;
			if (count == 0) {
				break;
			}
		}
		result += cache1[cache1.length - 1][cache1[0].length - 1];

		init(cache1);
		init(cache2);
		init_y(cache1);
		System.out.println("縦から進むとき");
		print(cache1);
		count = number;
		
		while (count > 0) {
			horizontal(cache1, cache2);
			long[][] temp = cache1;
			cache1 = cache2;
			cache2 = temp;
			print(cache1);
			init(cache2);
			count--;
			if (count == 0) {
				break;
			}

			vertical(cache1, cache2);
			temp = cache1;
			cache1 = cache2;
			cache2 = temp;
			print(cache1);
			init(cache2);
			count--;
			if (count == 0) {
				break;
			}
		}
		result += cache1[cache1.length - 1][cache1[0].length - 1];
		System.out.println();
		return result;

	}
}
