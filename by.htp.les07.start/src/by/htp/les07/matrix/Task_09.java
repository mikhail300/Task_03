package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task_09 {
	public static void task() {
		System.out.println ("9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.");
		int[][]a = new int [6][6];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		
		for (int i = 0 ; i < a.length ; i ++) {
			System.out.println (a [i][i]);
		}
		System.out.println ();
		for (int i = 0 ; i < a.length ; i ++) {
			System.out.println (a [i][-1 * i+a.length -1]);
		}
		System.out.println ();
	}
}
