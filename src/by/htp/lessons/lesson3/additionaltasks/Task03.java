package by.htp.lessons.lesson3.additionaltasks;

/**
 * 3. ¬ывести на экран все четные цифры от 1 до 100 не использу€ остаток от
 * делени€ (использу€ цикл for)
 * 
 * @author Maria
 *
 */
public class Task03 {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i += 2) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}

}
