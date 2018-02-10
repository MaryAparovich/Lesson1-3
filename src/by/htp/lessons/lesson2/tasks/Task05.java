package by.htp.lessons.lesson2.tasks;

/**
 * 5. Вывести из массива (задание 1) все чётные элементы на экран
 * 
 * @author Maria
 *
 */
public class Task05 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int k = 1;

		for (int i = 0; i < 100; i++) {
			arr[i] = k;
			k++;
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < 100; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
