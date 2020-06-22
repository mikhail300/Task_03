package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_21 {
	public static void task () {
		System.out.println ("21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int[][]a = new int [n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();
		
		for (int i =0 ; i < a.length ; i ++ ) {
			for (int j = 0 ; j <= i ; j ++) {
				a[i][j] = a.length +j-i;
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
