package by.htp.lessons.lesson2.tasks;

/**
 * 8. Найти максимальный элемент массива из задания 1, вывести значение
 * максимального элемента на экран
 * 
 * @author Maria
 *
 */

public class Task08 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int k = 1;
		for (int i = 0; i < 100; i++) {
			arr[i] = k;
			k++;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max = arr[0];
		for (int i = 0; i < 100; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max: " + max);
	}
}
