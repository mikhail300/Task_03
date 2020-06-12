package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task_06 {
	public static void task () {
		System.out.println ("6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
		int[][]a = new int [7][9];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println();
		for (int i =0 ; i < a.length ; i ++) {
			for ( int j = 0 ; j < a[i].length ; j++) {
				if (j%2==0 && a[0][j] > a[a.length - 1][j]) {
				System.out.printf ("%3d", a[i][j]);
				}
			}
			System.out.println ();
		}
		System.out.println ();
	}
}
