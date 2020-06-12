package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 15. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
public class Task_15 {
	public static void task () {
		System.out.println ("15. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):");
		int n;
		n = 7;
		int [][]a = new int[n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();
		for (int i = 0 ; i < a.length ; i ++) {
			a[i][i] = -1 * i + a.length;
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
