package by.htp.lessons.lesson2.tasks;

/**
 * 6. * (������� ������, ������, ���� ���������� ������� �� ������� ���������� �
 * ������ � �������� ��������� ������) ��������� ������ �� 100 ��������� ������
 * ���������� �������, ������� �� ����� ���������� ������� � ���� ������,
 * �������� ������ ����� ������� � ���������, ��������� ������� �� ����� � ����
 * ������. ���� ��� ������� ����� ��� ���� �� ������� - ������ �� �����������.
 * 
 * @author Maria
 *
 */

public class Task09 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int uneven = 0;
		int even = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) Math.floor(Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		/*
		 * for (int i = 0; i < 4; i++) { if (arr[i] % 2 == 0) { even = arr[i];
		 * System.out.print(arr[i]); } else { uneven = arr[i]; } if (arr[i] % 2 == 1) {
		 * even = arr[i]; System.out.print(arr[i]); }
		 * 
		 * int a = even; even = uneven; uneven=even; System.out.print(arr[i]); }
		 */

		for (int i = 0; i < 10; i += 2) {
			int b = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = b;
			System.out.print(arr[i] + " ");
			System.out.print(arr[i + 1] + " ");
		}
	}

}
