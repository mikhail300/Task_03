package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
public class Task_05 {
	public static void task () {
		System.out.println ("5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.");
		int[][]a = new int[5][7];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println ();
		
		for (int i = 1 ; i < a.length ; i+=2) {
			printLine (i, a);
			
		}
		System.out.println();
	}
	
	private static void printLine(int line, int matrix[][]) {
		for(int i = 0 ; i < matrix[line].length ; i ++) {
			System.out.printf("%2d", matrix[line][i]);
		}
		System.out.println();
	}
}
