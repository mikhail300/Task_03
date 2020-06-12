package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
// строка слева направо, третья строка справа налево и так далее.
public class Task_11  {
	public static void task () {
		System.out.println ("11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая\r\n" + 
				"строка слева направо, третья строка справа налево и так далее.");
		int m;
		int n;
		m = 5;
		n = 7;
		int[][]a = new int[m][n];
		
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		
		System.out.println ();
		
		for (int i = 0 ; i <a.length ; i++) {
			if (i%2 == 1 ) {
				for (int j = 0 ; j < a[i].length ; j ++) {
					System.out.printf ("%3d", a[i][j]);
				}
				System.out.println();
			}else {
				for (int j = a[i].length -1 ; j >= 0 ; j --) {
					System.out.printf ("%3d", a[i][j]);
				}
				System.out.println();
			}
			
		}
		System.out.println();
	}
}
