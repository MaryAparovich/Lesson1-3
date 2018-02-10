package by.htp.lessons.lesson2.tasks;

/**
 * 4.«аполнить массив размером из 100 элементов случайными целыми числами 
 * @author Maria
 *
 */
public class Task04 {

	public static void main(String[] args) {
		int[] arr = new int[100];

		for (int i = 0; i < 100; i++) {
			// double k = Math.random() * 100;
			// int mas = (int) k;
			// arr[i] = mas;
			arr[i] = (int) Math.floor(Math.random() * 100);
			System.out.print(arr[i]+" ");
		}

	}

}
