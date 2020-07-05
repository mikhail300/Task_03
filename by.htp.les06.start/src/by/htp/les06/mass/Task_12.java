package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class Task_12 {
	public static void task() {
		System.out.println ("12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.");
		int n;
		n = 15;
		
		int sum;
		sum = 0;
		
		int []a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		for (int i = 1; i<a.length; i++) {
			if (isSimple(i)) {
				sum = sum + a[(i - 1)];
				System.out.println (" " + i + " " + a[(i - 1)]);
			}
		}
		System.out.println("Сумма чисел порядковые номера которых являются простыми числами " + sum);
		System.out.println ();
	}
	
	
	public static boolean isSimple (int k) {
		if (k % 2 == 0 && k != 2) return false;
		int maxDiv = (int) Math.sqrt(k);
		for (int i = 3; i <= maxDiv; i+=2) {
			if (k % i == 0) return false;
		}
		return true;
		}
}
