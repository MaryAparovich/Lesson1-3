package by.htp.lessons.lesson3.additionaltasks;

/**
 * 5.	�������� ���������, ����������� ��������� ������������ ����� n. 
 * ���   ���������� ���������� ����������� ���� while (��������� ������������ ����� n 
 * ������������ ��� ������������ ���� ����������� ����� �� 1 �� n ������������). 
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
