package by.htp.les07.matrix;
// 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import by.htp.les07.tool.matrixTool;

public class Task_22 {
	public static void task () {
		System.out.println ("22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int[][]a = new int [n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();
		
		for (int i = 0 ; i < a.length ; i ++ ) {
			for (int j = 0 ; j < a.length -i ; j ++) {
				a[i][j] = i + 1 + j;
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
