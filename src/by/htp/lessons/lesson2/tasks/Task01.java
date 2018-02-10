package by.htp.lessons.lesson2.tasks;

/**
 * 1. Объявить массив целого типа и заполнить целыми 
   значениями от 1 до 100. Вывести содержимое массива на экран.
   Для заполнения использовать цикл for, для вывода - также цикл for
 * @author Maria
 *
 */

public class Task01 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int k = 1;

		for (int i = 0; i < 100; i++) {
			arr[i] = k;
			k++;
		}

		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
