package by.htp.lessons.lesson2.tasks;

/**
 * 7. Подсчитать количество чётных и нечётных элементов в массиве из задания 1,
 * вывести количество четных и нечетных на экран
 * 
 * @author Maria
 *
 */

public class Task07 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int Even = 0;
		int unEven = 0;
		int k = 1;

		System.out.print("Array: ");
		for (int i = 0; i < 100; i++) {
			arr[i] = k;
			k++;
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < 100; i++) {
			if (arr[i] % 2 == 0) {
				Even++;
			} else
				unEven++;
		}
		System.out.println();
		System.out.println("Even: " + Even);
		System.out.println("unEven: " + unEven);
	}

}
