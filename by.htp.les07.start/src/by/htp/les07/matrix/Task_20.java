package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_20 {
	public static void task () {
		System.out.println ("20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int[][]a = new int [n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();
		for (int i =0 ; i < a.length ; i ++) {
			for (int j = i ; j < a.length - i ; j ++) {
				a[j][i] = 1;
			}
			for (int j = a.length - i -1 ; j <= i ; j ++) {
				a[j][i] = 1;
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println();
		
	}
}
