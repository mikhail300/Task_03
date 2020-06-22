package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.
public class Task_26 {
	public static void task () {
		System.out.println ("26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:\r\n");
		int n;
		int m;
		n = 7;
		m = 8;
		int[][]a = new int[n][m];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
		System.out.println ("а) вычислить сумму отрицательных элементов в каждой строке;\r\n");
		int sum;
		for (int i = 0 ; i < a.length ; i++ ) {
		sum = 0;
			for (int j = 0 ; j < a[i].length ; j ++) {
				if (a[i][j] < 0) {
					sum += a[i][j];
				}
			}
			System.out.println("Сумма отрицательных элементов в строкке " + i + " равна " + sum);
		}
		System.out.println ();
		System.out.println ("б) определить максимальный элемент в каждой строке;\r\n");
		int max;
		for (int i = 0 ; i < a.length ; i ++) {
			max = a[i][0];
			for (int j = 1 ; j < a[i].length ; j ++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			System.out.println ("Максимальный элемент в строке " + i + " равен " + max);
			
		}
		System.out.println ();
		System.out.println ("в) переставить местами максимальный и минимальный элементы матрицы.");
		System.out.println ();
		int i_max;
		int j_max;
		int i_min;
		int j_min;
		int value_max;
		int value_min;
		value_max = a[0][0];
		value_min = a[0][0];
		i_max = 0;
		j_max = 0;
		i_min = 0;
		j_min = 0;
		for (int i = 0 ; i < a.length ; i ++) {
			for (int j = 0 ; j < a[i].length ; j ++) {
			if (a[i][j] > value_max) {
				value_max = a[i][j];
				i_max = i;
				j_max = j;
			}
			if (a[i][j] < value_min) {
				value_min = a[i][j];
				i_min = i;
				j_min = j;
			}
			}
		}
		System.out.println ("Максимальный элемент матрицы " + value_max + " расположен в " + i_max + " строке " + j_max + " столбце");
		System.out.println ("Минимальный элемент матрицы " + value_min + " расположен в " + i_min + " строке " + j_min + " столбце");
		a[i_min][j_min] = value_max;
		a[i_max][j_max] = value_min;
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
