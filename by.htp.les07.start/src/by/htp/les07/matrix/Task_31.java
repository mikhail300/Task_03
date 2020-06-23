package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
public class Task_31 {
	public static void task () {
		System.out.println ("31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.");
		int n;
		int m;
		n = 8;
		m = 9;
		int[][]a = new int [n][m];
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				a[i][j] = (int) (Math.random() * 1000);
			}
		}
		matrixTool.matrixPrint(a);
		int count;
		count = 0;
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				if (a[i][j] > 9 && a[i][j] < 100) {
					count ++;
				}
			}
		}
		System.out.println();
		System.out.println("Колличество двузначных чисел равно " + count);
		System.out.println();
	}
}
