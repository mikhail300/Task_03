package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task_33 {
	public static void task () {
		System.out.println ("33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.");
		int n;
		int m;
		n = 7;
		m = 8;
		int[][]a = new int [n][m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println();
		
		System.out.println("Отсортированы значания в столбцах по возрастанию значений сверху вниз");
		int tmp;
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				for (int p = (i + 1) ; p < a.length ; p ++) {
					if (a[i][j] > a[p][j]) {
						tmp = a[p][j];
						a[p][j] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println();
		System.out.println("Отсортированы значания в столбцах по убыванию значений сверху вниз");
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				for (int p = (i + 1) ; p < a.length ; p ++) {
					if (a[i][j] < a[p][j]) {
						tmp = a[p][j];
						a[p][j] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println();
	}
}
