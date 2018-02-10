package by.htp.lessons.lesson1.tasks;

/**
 * 1.5 Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее
 * каждому числу (используя цикл и оператор if else)
 * 
 * @author Maria
 *
 */
public class Task5 {
	public void run() {
		for (int i = 1; i <= 12; i++) {
			if (i == 1) {
				System.out.println("1: January");
			} else if (i == 2) {
				System.out.println("2: February");
			} else if (i == 3) {
				System.out.println("3: March");
			} else if (i == 4) {
				System.out.println("4: April");
			} else if (i == 5) {
				System.out.println("5: May");
			} else if (i == 6) {
				System.out.println("6: June");
			} else if (i == 7) {
				System.out.println("7: Jule");
			} else if (i == 8) {
				System.out.println("8: August");
			} else if (i == 9) {
				System.out.println("9: September");
			} else if (i == 10) {
				System.out.println("10: November");
			} else if (i == 11) {
				System.out.println("11: December");
			}
		}
	}
}
