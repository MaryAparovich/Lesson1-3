package by.htp.lessons.lesson3.additionaltasks;

/**
 * Найти максимальный элемент для каждого столбца матриц размерностью NxN.
 */

public class Task10 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		int max = arr[0][0];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = k;
				k++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}

		System.out.println();
		System.out.println("Max: ");

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++)
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			System.out.print(max + "       ");

		}
	}
}
