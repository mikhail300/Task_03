package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное.
public class Task_03 {
	public static void task() {
		System.out.println ("3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное.");
		int n;
		n = 10;
		int[] a = new int[n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println ("Первым встречается отрицательное число " + a[i] + " с индексом = " + i);
				break;
			}else if (a[i] > 0) {
				System.out.println ("Первым встречается положительное число " + a[i]+ " с индексом = " + i);
				break;
			}
		}
		System.out.println();
	}
}
