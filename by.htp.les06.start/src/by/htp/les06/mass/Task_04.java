package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
public class Task_04 {
	public static void task() {
		System.out.println ("4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.");
		int n;
		n = 3;
		
		boolean riseMass;
		riseMass = true;
		
		double[] a = new double[n];
		massTool.initMasDouble(a);
		massTool.printMasDouble(a);
		
		for (int i = 1; i < a.length; i ++) {
			if (a[(i-1)] >= a[i]) {
				riseMass = false;
			}
		}
		if (riseMass) {
			System.out.println ("Последовательнось возрастающая");
		}
		System.out.println();
	}
}
