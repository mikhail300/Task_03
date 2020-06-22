package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 24. Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить действительную квадратную матрицу порядка n:
public class Task_24 {
	public static void task () {
		System.out.println ("и подсчитать количество положительных элементов в ней.");
		int size = 4;
		int[] a = new int[size];

		init(a);
		print(a);

		int[][] a2 = new int[size][size];
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++) {
				a2[i][j] = (int) Math.pow(a[j], (i + 1));
			}
		}

		System.out.println();
		System.out.println();

		matrixTool.matrixPrint(a2);
	}

	public static void init(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 5 + 1);
		}
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
	}
	}

