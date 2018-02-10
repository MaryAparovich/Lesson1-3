package by.htp.lessons.lesson3.additionaltasks;

/**
 * 5.	—оздайте программу, вычисл€ющую факториал натурального числа n. 
 * ƒл€   вычислени€ факториала используйте цикл while (‘акториал натурального числа n 
 * определ€етс€ как произведение всех натуральных чисел от 1 до n включительно). 
 * @author Maria
 *
 */
public class Task05 {

	public static void main(String[] args) {
		int fact = 1;
		int i = 1;
		while (i <= 4) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
