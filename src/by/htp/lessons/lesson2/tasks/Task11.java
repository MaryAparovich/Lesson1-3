package by.htp.lessons.lesson2.tasks;

/**
 * 11. Создать 2 массива длинной 50 элементов, поменять местами элементы в четной
 * позиции первого массива с элементами в нечетной позиции второго массива.
 * 
 * @author Maria
 *
 */
public class Task11 {

	public static void main(String[] args) {

		int[] arr1 = new int[50];
		int[] arr2 = new int[50];
		int k1 = 1;
		int k2 = 1;
		System.out.print("Array1: ");

		for (int i = 0; i < 50; i++) {
			arr1[i] = k1;
			k1++;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Array2: ");

		for (int i = 0; i < 50; i++) {
			arr2[i] = k2;
			k2++;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
			int b = arr1[i];
			arr1[i] = arr2[i + 1];
			arr2[i + 1] = b;
			}
		}
		System.out.println();
		System.out.print("Array1: ");

		for (int i = 0; i < 50; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Array2: ");

		for (int i = 0; i < 50; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
