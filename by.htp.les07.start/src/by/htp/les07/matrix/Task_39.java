package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 39. Найдите произведение двух матриц.
public class Task_39 {
	public static void task () {
		System.out.println ("39. Найдите произведение двух матриц.");
		int a_m;
		int a_n;
		a_m = (int)(Math.random() * 3 + 2);
		a_n = (int)(Math.random() * 3 + 2);
		int[][]a = new int[a_n][a_m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		
		System.out.println();
		
		int b_m;
		int b_n;
		b_m = (int)(Math.random() * 3 + 2);
		b_n = (int)(Math.random() * 3 + 2);
		int[][]b = new int [b_n][b_m];
		matrixTool.matrixInitRandom(b);
		matrixTool.matrixPrint(b);
		System.out.println();
		int[][]c = new int[a_n][b_m];
		matrixTool.matrixPrint(c);
	}
}
