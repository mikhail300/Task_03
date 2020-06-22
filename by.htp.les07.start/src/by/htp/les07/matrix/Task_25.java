package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 25. Получить квадратную матрицу порядка n:
public class Task_25 {
	public static void task() {
		System.out.println ("25. Получить квадратную матрицу порядка n:");
		int n;
		n = 8;
		int[][]a = new int[n][n];
		matrixTool.matrixPrint(a);
		System.out.println();
		for (int i = 0 ; i < a.length ; i ++ ) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				a[i][j] = i * n + (j + 1 );
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println ();		
	}
}
