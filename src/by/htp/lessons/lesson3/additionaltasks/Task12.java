package by.htp.lessons.lesson3.additionaltasks;

/**
 * В двумерном массиве натуральных случайных чисел от 0 до 199 найти количество
 * всех двузначных чисел, у которых сумма цифр кратна 2.
 * 
 * @author Maria
 *
 */

public class Task12 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		int sum = 0;
		int count = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int) Math.floor(Math.random() * 200);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] > 9 && arr[i][j] < 100) {
					int first = arr[i][j];
					int second = arr[i][j];
					first = first / 10;
					second = second % 10;
					sum = first + second;
					if ((sum % 2 == 0)) {
						count++;
					}
				}
			}
		}
		System.out.println();
		System.out.println("Count: " + count);
	}
}
