package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен.
public class Task_07 {
	public static void task() {
		System.out.println ("7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.");
		int n;
		n = 15;
		int z;
		z = 2;
		double [] a = new double [n];
		massTool.initMasDouble(a);
		massTool.printMasDouble(a);
		
		for (int i = 0 ; i < a.length ; i ++) {
			if (a[i] > z) {
				a[i] = z;
			}
		}
		
		massTool.printMasDouble(a);
		System.out.println();
	}
}
