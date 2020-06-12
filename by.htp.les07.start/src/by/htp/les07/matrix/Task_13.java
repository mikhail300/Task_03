package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 13. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
public class Task_13 {
	public static void task () {
		System.out.println ("13. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):");
		int n;
		n = 8;
		int [][]a = new int [n][n];
		matrixTool.matrixPrint(a);
		for ( int i = 0 ; i < a.length ; i++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
				if (i%2 == 0) {
				a[i][j] = j + 1;
				}else {
					a[i][-1 * j + a[i].length-1] = j + 1;
				}
			}
//			for (j = a[i].length - 1 ; j >= -0 ; j --) {
//				
//			}
		}
		System.out.println ();
		matrixTool.matrixPrint(a);
		System.out.println ();
	}

}
