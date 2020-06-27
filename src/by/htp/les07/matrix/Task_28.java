package by.htp.les07.matrix;

import by.htp.les07.tool.massTool;
import by.htp.les07.tool.matrixTool;

// 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
// содержит максимальную сумму.
public class Task_28 {
	public static void task () {
		System.out.println("28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец\r\n" + 
				"содержит максимальную сумму.");
		int n;
		int m;
		n = 10;
		m = 8;
		int[][]a = new int [n][m];
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j =0 ; j < a[i].length ; j ++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		matrixTool.matrixPrint(a);
		int[]b = new int [m];
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				b[j] += a[i][j];
			}
		}
		System.out.print ("Сумма эжлементов в каждом столбце ");
		massTool.printMasInt(b);
		int j_max;
		j_max = 0;
		for (int j = 1 ; j < b.length ; j ++) {
			if (b[j - 1] < b[j]) {
				j_max = j;
			}
		}
		System.out.println ("Столбец " + j_max + " содержит максимальную сумму равную " + b[j_max]);
		System.out.println ();
	}
}
