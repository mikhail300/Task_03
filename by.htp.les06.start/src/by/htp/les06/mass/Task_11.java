package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
public class Task_11 {
	public static void task() {
		System.out.println ("11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).");
		int n;
		n = 15;
		int m;
		m = 2;
		int l;
		l = 1;
		
		System.out.println ("M = " + m);
		System.out.println ("L = " + l);
		
		int []a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		for (int i = 0; i < a.length ; i ++) {
			if ((a[i]%m) == l) {
				System.out.println (a[i] + " % " + m + " = " +(a[i]%m) + " = " + l );
			}
		}
	}
}
