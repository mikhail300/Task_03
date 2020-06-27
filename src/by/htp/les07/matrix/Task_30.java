package by.htp.les07.matrix;

import by.htp.les07.tool.massTool;
import by.htp.les07.tool.matrixTool;

// 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Task_30 {
	public static void task () { 
		System.out.println ("30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в\r\n" + 
				"которых число 5 встречается три и более раз.");
		int n;
		int m;
		n = 10;
		m = 20;
		int[][]a = new int[n][m];

		int[]b = new int[n];
		for (int i =0 ; i < a.length ; i ++) {
			
			for (int j = 0 ; j < a[i].length ; j ++) { 
				a[i][j] = (int) (Math.random()*16);
				if (a[i][j] == 5) {
					b[i] ++;
				}
			}
			
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
		massTool.printMasInt(b);
		for ( int i = 0 ; i < b.length ; i ++) {
			if (b[i] >= 3) {
				System.out.println("В строке " + i + " число 5 встречается три или более раз");
				
			}
		}
		System.out.println();
	}
}
