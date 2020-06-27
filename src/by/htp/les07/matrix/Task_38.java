package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

//38. Найдите сумму двух матриц
public class Task_38 {
	public static void task () {
		System.out.println ("38. Найдите сумму двух матриц");
		int m;
		int n;
		m = 4;
		n = 3;
		int[][]a = new int [n][m];
		int[][]b = new int [n][m];
		int[][]c = new int [n][m];
		
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixInitRandom(b);
		
		matrixTool.matrixPrint(a);
		System.out.println ("+");
		matrixTool.matrixPrint(b);
		System.out.println ("=");
		
		for (int i = 0 ; i < n ; i ++) {
			for (int j = 0 ; j < m ; j ++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		matrixTool.matrixPrint(c);
		System.out.println ();
	}
}
