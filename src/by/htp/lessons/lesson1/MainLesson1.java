package by.htp.lessons.lesson1;

import java.util.Scanner;

import by.htp.lessons.lesson1.tasks.Task1;
import by.htp.lessons.lesson1.tasks.Task2;
import by.htp.lessons.lesson1.tasks.Task3;
import by.htp.lessons.lesson1.tasks.Task4;
import by.htp.lessons.lesson1.tasks.Task5;


public class MainLesson1 {

	public static void main(String[] args) {

		Scanner myScanner;
		while (true) {
			myScanner = new Scanner(System.in);
			int number = myScanner.nextInt();
			switch (number) {
			case 1:
				Task1 task1 = new Task1();
				task1.run();
				break;
			case 2:
				Task2 task2 = new Task2();
				task2.run();
				break;
			case 3:
				Task3 task3 = new Task3();
				task3.run();
				break;
			case 4:
				Task4 task4 = new Task4();
				task4.run();
				break;
			case 5:
				Task5 task5 = new Task5();
				task5.run();
				break;
			}
			break;
		}
		myScanner.close();
	}
}
