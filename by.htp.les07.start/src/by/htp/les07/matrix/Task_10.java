package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task_10 {
	public static void task() {
		System.out.println("10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.");
		int[][]a = new int [5][7];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		
		int k;
		int p;
		k = 3;
		p = 4;
		System.out.println("Столбец");
		for (int i = 0 ; i < a.length ; i ++) {
			System.out.println ( a [i][p-1]);
		}
		System.out.println ("Строка");
		for (int j = 0 ; j < a[k-1].length ; j ++) {
			System.out.println ( a [k-1][j]);
		}
		System.out.println ();
	}
}
