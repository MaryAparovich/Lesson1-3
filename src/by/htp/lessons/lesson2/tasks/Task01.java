package by.htp.lessons.lesson2.tasks;

/**
 * 1. �������� ������ ������ ���� � ��������� ������ 
   ���������� �� 1 �� 100. ������� ���������� ������� �� �����.
   ��� ���������� ������������ ���� for, ��� ������ - ����� ���� for
 * @author Maria
 *
 */

public class Task01 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int k = 1;

		for (int i = 0; i < 100; i++) {
			arr[i] = k;
			k++;
		}

		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
