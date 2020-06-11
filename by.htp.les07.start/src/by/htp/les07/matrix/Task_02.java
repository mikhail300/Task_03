package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
public class Task_02 {
	public static void task() {
		System.out.println ("2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].");
		int[][]a = new int[2][3];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
	}
}
