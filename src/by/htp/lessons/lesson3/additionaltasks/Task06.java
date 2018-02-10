package by.htp.lessons.lesson3.additionaltasks;

/**
 * 6. Задайте натуральное число. Найдите сумму четных цифр, входящих в его
 * состав.
 * 
 * @author Maria
 *
 */
public class Task06 {

	public static void main(String[] args) {

		int n = 1241;
		int sum = 0;

		while (n > 0) {
			int b = n % 10;
			if (b % 2 == 0) {
				sum = sum + b;
			}
			n = n / 10;
		}
		System.out.println("Sum: " + sum);
	}
}
