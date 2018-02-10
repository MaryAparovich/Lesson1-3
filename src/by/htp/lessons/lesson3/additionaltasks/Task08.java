package by.htp.lessons.lesson3.additionaltasks;

/**
 * Дан массив A вещественного типа, содержащий 20 положительных и отрицательных
 * элементов. Сформировать массив B из положительных элементов массива A,
 * имеющих четный индекс. Найти сумму квадратов элементов нового массива.
 * 
 * @author Maria
 *
 */
public class Task08 {

	public static void main(String[] args) {

		double[] arr = { 10.25, 1, -2, 4.11, 4, 6.20, 8.20, -5, -7, 10, 2 };
		double[] arrEven = new double[arr.length];
		int arrEvenIndex = 0;
		double sum = 0;
		System.out.print("Array B = ");

		for (int i = 2; i < arr.length; i += 2) {
			if (arr[i] > 0) {
				arrEven[arrEvenIndex] = arr[i];
				System.out.print(arrEven[arrEvenIndex] + "  ");
				arrEvenIndex++;
			}
		}
		
		for (int i = 0; i < arrEven.length; i++) {
			if (arrEven[i]==0) {
				break;
			}
			sum = sum + Math.pow(arrEven[i], 2);
		}
		System.out.println();
		System.out.print("sq. sum = " + sum);
	}

}
