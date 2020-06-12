package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 4. Дана матрица. Вывести на экран первую и последнюю строки.
public class Task_04 {
	public static void task() {
		System.out.println ("4. Дана матрица. Вывести на экран первую и последнюю строки.");
		int[][]a = new int[5][7];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println();
		
		printLine (0, a);
		printLine (a.length-1, a);
		System.out.println();
	}
	
	private static void printLine(int line, int matrix[][]) {
		for(int i = 0 ; i < matrix[line].length ; i ++) {
			System.out.printf("%3d", matrix[line][i]);
		}
		System.out.println();
	}
}
