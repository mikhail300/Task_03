package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 29. Найти положительные элементы главной диагонали квадратной матрицы.
public class Task_29 {
	public static void task () {
		System.out.println ("29. Найти положительные элементы главной диагонали квадратной матрицы.");
		int n;
		n = 7;
		int[][]a = new int[n][n];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.print("Положительные элементы главной диагонали ");
		for (int i = 0 ; i < a.length ; i ++) {
			if (a[i][i] > 0) {
				System.out.print ( a[i][i] + ", ");
			}
		}
		System.out.println ();
	}
}
