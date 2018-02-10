package by.htp.lessons.lesson3.additionaltasks;

/**
 * Все элементы массива поделить на значение наибольшего элемента этого массива.
 * 
 * @author Maria
 *
 */
public class Task07 {

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 1, 5, 18, 2 };
		int max = arr[0];
		// int s = (int) Math.round(q);
		System.out.print("Array = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Max = " + max);
		System.out.print("Divided = ");
		for (int i = 0; i < arr.length; i++) {
			double q = arr[i] / (double) max;
			System.out.printf("%.2f  ", q);
		}

	}

}
