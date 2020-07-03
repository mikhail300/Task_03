package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 39. Найдите произведение двух матриц.
// Произведение двух матриц можно найти только в случае, если количество столбцов левой матрицы совпадает с количеством строк правой.
public class Task_39 {
	public static void task () {
		System.out.println ("39. Найдите произведение двух матриц.");
		int a_m;
		int a_n;
		int b_m;
		int b_n;
		a_n = 3;
		a_m = b_n = 4;// Произведение двух матриц можно найти только в случае, если количество столбцов левой матрицы совпадает с количеством строк правой.
		b_m = 3;
		
		//a_m = (int)(Math.random() * 3 + 2);
		
		int[][]a = new int[a_n][a_m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		
		System.out.println("*");
		

		int[][]b = new int [b_n][b_m];
		matrixTool.matrixInitRandom(b);
		matrixTool.matrixPrint(b);
		System.out.println("=");
		
		int[][]c = new int[a_n][b_m];
		//matrixTool.matrixPrint(c);
		for (int i = 0 ; i < a_n  ; i ++) {
			for (int j = 0 ; j < b_m  ; j ++) {
				for (int p = 0 ; p < a_m ; p ++) {
				c[i][j] += a[i][p] * b[p][j];
				}
			}
		}
		matrixTool.matrixPrint(c);
		System.out.println ();
	}
}
