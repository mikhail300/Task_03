package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.
public class Task_01 {
	public static void task () {
		System.out.println ("1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и\r\n" + 
				"вывести на экран.");
		int[][]a = {{1,0,0,0}, {0,1,0,0},{0,0,1,0}};
		
		matrixTool.matrixPrint(a);
		System.out.println ();
		
	}
}
