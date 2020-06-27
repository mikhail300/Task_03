package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 37. Переставить строки матрицы случайным образом.
public class Task_37 {
	public static void task () {
		System.out.println ("37. Переставить строки матрицы случайным образом.");
		int m;
		int n;
		m = 8;
		n = 7;
		int[][]a = new int[n][m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println();
		for (int i = 0 ; i < n ; i ++) {
			int line_1;
			int line_2;
			do { 
			line_1 = (int)(Math.random() * n);
			line_2 = (int)(Math.random() * n);
			}while (line_1 == line_2);
			System.out.println ( line_1 +" " + line_2);
			swapLine(line_1,line_2,a);
		}
			
		System.out.println ();
		matrixTool.matrixPrint(a);
		System.out.println();
	}
	
	
	private static void swapLine (int line_1, int line_2, int[][]a ) {
		int tmp;
		for (int j = 0 ; j < a[line_1].length ; j ++ ) {
			tmp = a[line_1][j];
			a[line_1][j] = a[line_2][j];
			a[line_2][j] = tmp;
		}
	}
}
