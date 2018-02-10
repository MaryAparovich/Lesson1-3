package by.htp.lessons.lesson1.tasks;

/**
 * 1.1	Вывести на экран все четные цифры от 1 до 100 (используя цикл for)
 * @author Maria
 *
 */
public class Task1 {
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
