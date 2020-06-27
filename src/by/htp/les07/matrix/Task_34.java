package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
public class Task_34 {
	public static void task () {
		System.out.println ("34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число\r\n" + 
				"единиц равно номеру столбца.");
		int m;
		int n;
		m = (int)(Math.random()*20);
		n = (int)(Math.random()*20);
		if (n > m) {
			System.out.println("В матрице размерностью " + n + " x " + m + " выполнить условие невзможно.");
			System.out.println();
			return;
		}
		int[][]a = new int[m][n];
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				if (j >= i) {
					a[i][j] = 1;
				}
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println ();;
	}
}
