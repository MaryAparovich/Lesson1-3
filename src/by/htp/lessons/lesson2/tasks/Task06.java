package by.htp.lessons.lesson2.tasks;

/**
 * 6. ��������� ������ �� 100 ��������� ������ ������� �� 1 �� 100, ������� ��
 * ����� ���������� ������� � ���� ������,�������� ������ ����� ������� �
 * ���������, ��������� ������� �� ����� � ���� ������.
 */
public class Task06 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int k=1;
		for (int i = 0; i < 100; i++) {
			arr[i] = k;
			k++;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
				
		for (int i = 0; i < 100; i+=2) {
			int b = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = b;
			System.out.print(arr[i]+" ");
			System.out.print(arr[i+1]+" ");
		}
	}
}