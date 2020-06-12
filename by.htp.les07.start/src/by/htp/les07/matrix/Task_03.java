package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 3. Дана матрица. Вывести на экран первый и последний столбцы.
public class Task_03 {
	public static void task() {
		System.out.println("3. Дана матрица. Вывести на экран первый и последний столбцы.");
		int i;
		int j;
		i = 5;
		j = 7;
		int[][]a = new int[i][j];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println ();
		for (int i1 = 0 ; i1 < a.length ; i1 ++ ) {
			System.out.printf("%3d", a[i1][0]);
			System.out.printf("%3d", a[i1][a[i1].length - 1]);
			System.out.println ();
		}
	}
	
	
}
