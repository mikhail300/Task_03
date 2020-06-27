package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 12. Получить квадратную матрицу порядка n:
public class Task_12 {
	public static void task() {
		System.out.println("12. Получить квадратную матрицу порядка n:");
		int n;
		n = 8;
		int [][]a = new int [n][n];
		
		for( int i = 0 ; i < a.length ; i ++) {
			a[i][i] = i;
		}
		
		matrixTool.matrixPrint(a);
		System.out.println();
	}
}
