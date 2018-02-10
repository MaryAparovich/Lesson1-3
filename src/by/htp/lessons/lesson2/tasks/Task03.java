package by.htp.lessons.lesson2.tasks;
/**
 * 3. Заполнить массив целых чисел чётными значениями в диапазоне 2 - 100; 
 * @author Maria
 *
 */

public class Task03 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int k = 0;
		
		for (int i = 2; i <=100; i++) {
			if (i % 2 == 0) {
				arr[k] = i;
				System.out.print(arr[k]+" ");
				k++;
			}
		}
	
	}

}
