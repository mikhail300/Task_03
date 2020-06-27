package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_17 {
	public static void task () {
		System.out.println ("17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int[][]a = new int[n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();

		for (int i = 0 ; i < a.length  ; i ++) {
			a[i][0] = 1;
			a[0][i] = 1;
			a[a.length - 1][i] = 1;
			a[i][a.length -1] = 1;
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
