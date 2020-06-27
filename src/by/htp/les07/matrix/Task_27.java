package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
// соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры.
public class Task_27 {
	public static void task () {
		System.out.println ("27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на\r\n" + 
				"соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит\r\n" + 
				"пользователь с клавиатуры.");
		int n;
		int m;
		n = 3;
		m = 6;
		int[][]a = new int [10][10];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println();
		int tmp;
		for ( int i = 0 ; i < a.length ; i ++) {
			tmp = a[i][n];
			a[i][n] = a[i][m];
			a[i][m] = tmp;
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
