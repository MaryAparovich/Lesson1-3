package by.htp.lessons.lesson3.additionaltasks;

/**
 * ¬ двумерном массиве целых чисел определить, сколько раз в нем встречаетс€
 * элемент со значением X.
 * 
 * @author Maria
 *
 */

public class Task11 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 3, 3, 4 }, { 3, 3, 6 } };
		int x = 3;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == x) {
					count++;
				}
			}
		}
		System.out.println("Number of 3: " + count + " times");
	}
}
