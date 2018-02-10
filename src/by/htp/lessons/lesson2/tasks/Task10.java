package by.htp.lessons.lesson2.tasks;

/**
 * 10. ����� ����������� ������� �������, ���������� � ������� 1. ��������� ���
 * �������� ������� �� ����������� �������, ��������� ������� ��������� � �����
 * ������ ���� double, ������� ���������� ������ ������� �� �����. ���������
 * ������� ����� ������������ ������, ��� ������������� ���������� ���� int
 * ��������� ������� ������������� ����������� �� ���������� ������ ��������,
 * �.�. �� 0.0.
 * 
 * @author Maria
 *
 */

public class Task10 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		double[] arrQ = new double[100];

		System.out.print("Array: ");
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) Math.floor(Math.random() * 100);
			System.out.print(arr[i] + ", ");
		}

		System.out.println();
		int min = arr[0];

		for (int i = 0; i < 100; i++) {
			if ((arr[i] < min) && (arr[i] != 0)) {
				min = arr[i];
			}
		}
		System.out.print("Min: " + min);
		System.out.println();
		System.out.print("Q: ");

		for (int i = 0; i < arrQ.length; i++) {
			double q = arr[i] / (double) min;
			arrQ[i] = q;
			System.out.printf("%.2f  ", arrQ[i]);
		}
	}
}
