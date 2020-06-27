package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_18 {
	public static void task () {
		System.out.println ("18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int[][]a = new int[n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();
		
		for (int i =0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a.length - i ; j ++) {
				a[i][j] = i + 1;
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println();
	}
}
