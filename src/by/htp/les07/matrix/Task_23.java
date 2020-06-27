package by.htp.les07.matrix;
// 23. Сформировать квадратную матрицу порядка N по правилу: и подсчитать количество положительных элементов в ней.
public class Task_23 {
	public static void task () {
		System.out.println ("23. Сформировать квадратную матрицу порядка N по правилу: и подсчитать количество положительных элементов в ней.");
		int n;
		n = 8;
		double[][]a = new double[n][n];
		matrixDoublePrint (a);
		System.out.println();
		int count;
		count = 0;
		
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				a[i][j] = Math.asin((i * i - j * j) / n );
				if (a[i][j] > 0) {
					count ++;
				}
			}
		}
		matrixDoublePrint (a);
		System.out.println();
		System.out.println ("Количество положительных элементов = " + count);
	}
	
	private static void matrixDoublePrint (double a[][]) {
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				System.out.printf ("%8.3f", a[i][j]);
				}
			System.out.println();
		}
	}
}
