package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task_32 {
	public static void task () {
		System.out.println ("32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.");
		int n;
		int m;
		n = 5;
		m = 9;
		int[][]a = new int[n][m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		
		System.out.println("Отсортированы значания в строках по возрастанию значений справа налево");
		int tmp;
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				for (int p = (j + 1) ; p < a[i].length  ; p ++) {
					if (a[i][j] > a[i][p]) {
						tmp = a[i][p];
						a[i][p] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
		matrixTool.matrixPrint(a);
		
		System.out.println("Отсортированы значания в строках по убыванию значений справа налево");
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				for (int p = (j + 1) ; p < a[i].length  ; p ++) {
					if (a[i][j] < a[i][p]) {
						tmp = a[i][p];
						a[i][p] = a[i][j];
						a[i][j] = tmp;
					}
				}
			}
		}
		matrixTool.matrixPrint(a);
		
		System.out.println();
	}
}
