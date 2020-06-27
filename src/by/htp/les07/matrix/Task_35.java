package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task_35 {
	public static void task () {
		System.out.println ("35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.");
		int m;
		int n;
		m = 8;
		n = 7;
		int[][]a = new int [n][m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		int max;
		max = a[0][0];
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		System.out.println ("наибольший элемент матрицы равен " + max);
		System.out.println ("Матрица с замененными нечетными элементами на наибольший элемент");
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				if (a[i][j] % 2 != 0 ) {
					a[i][j] = max;
				}
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println();
	}
}
