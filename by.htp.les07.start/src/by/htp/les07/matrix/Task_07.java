package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 7. Дан двухмерный массив 5x5. Найти сумму модулей отрицательных нечетных элементов.
public class Task_07 {
	public static void task () {
		System.out.println ("7. Дан двухмерный массив 5x5. Найти сумму модулей отрицательных нечетных элементов.");
		int[][]a = new int [5][5];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println ();
		int sum;
		sum = 0;
		
		for (int i = 0 ; i < a.length ; i ++ ) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				if ( i % 2 == 0 && j % 2 == 0 && a[i][j] < 0) { 
					System.out.printf("%2d", a[i][j]);
					sum += Math.abs(a[i][j]);
				}
			}
		}
		System.out.println ();
		System.out.println ("Сумма модулей отрицательных нечетных элементов = " + sum);
		System.out.println ();
	}
}
