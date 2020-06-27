package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
// как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
// сглаживания заданной матрицы
public class Task_36 {
	public static void task () {
		System.out.println ("36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается\r\n" + 
				"как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат\r\n" + 
				"сглаживания заданной матрицы");
		int n;
		int m;
		n = 3;
		m = 3;
		int[][]a = new int[n][m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println ();
		int[][]b = new int[n][m];
		int sum;
		int count;
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				sum = 0;
				count = 0;
				for (int i_small = i - 1 ; i_small < i + 2 ; i_small ++ ) {
					for (int j_small = j -1 ; j_small < j + 2 ; j_small ++) {
						if (i_small >= 0 && i_small <= n -1 && j_small >= 0 && j_small <= m -1 && !(i== i_small && j == j_small)) {
							sum += a[i_small][j_small];
							count ++;
							
						}
					}
					
				}
				System.out.println (count + " " + sum);
				b[i][j] = sum / count;
			}
			
		}
		System.out.println ();
		matrixTool.matrixPrint(b);
		System.out.println ();
	}
}
