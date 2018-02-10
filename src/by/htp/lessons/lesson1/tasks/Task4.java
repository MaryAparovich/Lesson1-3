package by.htp.lessons.lesson1.tasks;

/**
 * 1.4	Посчитать сумму цифр от 20 до 200 и результат вывести на экран 
 * (используя цикл for)
 * @author Maria
 *
 */
public class Task4 {
	public void run() {
		int sum = 0;
		for (int i = 20; i <= 200; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
