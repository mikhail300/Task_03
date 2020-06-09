package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.
public class Task_13 {
	public static void task () {
		System.out.println ("13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.");
		int n;
		n = 15;
		
		int M;
		M = 3;
		int L;
		L = 2;
		int N;
		N = 6;
		
		int []a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		int count;
		count = 0;
		
		for (int i =0;i< a.length;i++) {
			if ((a[i]%M) == 0 && L < a[i] && a[i] < N) {
				count ++;
			}
		}
		System.out.println ("Количество элементов =" + count);
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
