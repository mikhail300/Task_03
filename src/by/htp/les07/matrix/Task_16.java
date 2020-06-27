package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_16 {
	public static void task () {
		System.out.println ("16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int[][]a = new int [n][n];
		//matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println ();
		
		for (int i = 0 ; i < a.length ; i ++ ) {
			a[i][i] = (i + 1) * (i + 2);
		}
		matrixTool.matrixPrint(a);
		System.out.println();
		
	}
}
