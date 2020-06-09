package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task_01 {
	public static void task () {
		int k;
		int n;
		k = 3;
		n = 15;
		
		System.out.println ("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
		System.out.println ("k = " + k);
		System.out.println ("n = " + n);
		
		int[] a = new int[n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		int sum;
		sum = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % k) == 0) {
				sum = sum + a[i];
				System.out.println ("Элемент " + i + " = " + a [i] + " кратен " + k );
			}
		}
		
		System.out.println ("Сумма кратных элементов = " + sum);
		System.out.println ();
	}
}
