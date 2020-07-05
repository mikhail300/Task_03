package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.
public class Task_08 {
	public static void task() {
		System.out.println ("8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.");
		
		int n;
		n = 30;
		
		double[]a = new double [n];
		massTool.initMasDouble(a);
		massTool.printMasDouble(a);
		
		int pos;
		int neg;
		int zero;
		pos = 0;
		neg = 0;
		zero = 0;
		
		for (int i = 0; i < a.length ; i ++ ) {
			if (a[i] > 0) {
				pos ++;
			}else if ( a[i] < 0) {
				neg ++;
			}else {
				zero ++;
			}
		}
		System.out.println ("Положительных " + pos);
		System.out.println ("Отрицательных " + neg);
		System.out.println ("Нулевых " + zero);
		System.out.println();
	}
}
