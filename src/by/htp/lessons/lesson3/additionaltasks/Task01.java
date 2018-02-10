package by.htp.lessons.lesson3.additionaltasks;

/**
 * 1.	Модифицировать пример из учебника следующим образом: 
 * цикл for проходит по элементам от 300 до 197  и каждый 3 элемент выводит на экран.
 * @author Maria
 *
 */
public class Task01 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 300; i > 197; i--) {
			count++;
			if (count == 3) {
				System.out.println(i);
				count = 0;
			}
		}
	}

}
