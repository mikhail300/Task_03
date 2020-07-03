package by.htp.les07.matrix;
// 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2n
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат. Пример магического квадрата порядка 3:
import by.htp.les07.tool.matrixTool;
import java.util.Scanner;
public class Task_40 {
	public static void task () {
	System.out.println ("40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2n\r\n" + 
			"так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.\r\n" + 
			"Построить такой квадрат. Пример магического квадрата порядка 3:");
		int n;
		n = 5; // 3, 5, 7, .... 
		if (n%2 == 0 || n < 3) {
			System.out.println("Incorrect input, try again");
			return;
		}
		int[][] a = new int[n][n];
		
		int i = 0, j = n / 2;

		for (int k = 1; k <= n * n; k++) {
			a[i][j] = k;
			i--;
			j++;
			if (k % n == 0) {
				i += 2;
				j--;
			} else {
				if (j == n) {
					j -= n;
				} else if (i < 0) {
					i += n;
				}
			}
		}
		matrixTool.matrixPrint(a);
		System.out.println ();
	}
}
