package by.htp.lessons.lesson3.additionaltasks;

/**
 * Дана матрица (двумерный массив). Поменять местами две любые ее строки.
 */

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.print("Input 1 row number: ");
		int number1 = myScanner.nextInt();
		number1 = number1 - 1;

		System.out.print("Input 2 row number: ");
		int number2 = myScanner.nextInt();
		number2 = number2 - 1;

		myScanner.close();

		int[][] arr = new int[3][4];
		int k = 0;
		int buff = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		for (int j = 0; j < 4; j++) {
			buff = arr[number1][j];
			arr[number1][j] = arr[number2][j];
			arr[number2][j] = buff;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
