package lesson;

public class Lesson02 {

	public static void main(String[] args) {
		radixConvert(2016.421, 100);
	}
	public static void radixConvert(double num, int significantFigure) {
		int[] array = myConvert(num, significantFigure);
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 2 && flag == false){
				System.out.print(".");
				flag =true;
			}else if (array[i] == 2 && flag == true) {
				System.out.println();
				System.out.println("complete!");
				return;
			}
			if(array[i] != 2) System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("not completed!");
	}
	public static int[] myConvert(double num, int significantFigure) {
		int[] array = new int[significantFigure];
		for (int i = 0; i < array.length; i++) {
			array[i] = 2;
		}
		int tempN = (int)num;
		double temp = num - tempN;
		int count = 0;
		while(tempN != 1){
			if(tempN % 2 == 0){
				tempN /= 2;
				array[count] = 0;
			}else {
				tempN = (tempN - 1) / 2;
				array[count] = 1;
			}
			count++;
		}
		int[] tempArray = new int[count];
		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = array[tempArray.length - 1 - i];
		}
		for (int i = 0; i < tempArray.length; i++) {
			array[i] = tempArray[i];
		}
		count++;
		while (temp != 0d && count != array.length) {
			temp = temp * 2;
			if(temp - 1 >= 0){
				array[count] = 1;
				temp -= 1d;
			}else {
				array[count] = 0;
			}
			count++;
		}
		return array;
	}
}
