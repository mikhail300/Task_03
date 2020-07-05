package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 15. Дана последовательность действительных чисел a1 ,a2 , ,an . Указать те ее элементы, которые принадлежат отрезку [с, d].
public class Task_15 {
	public static void task () {
		System.out.println("15. Дана последовательность действительных чисел a1 ,a2 , ,an . Указать те ее элементы, которые принадлежат отрезку [с, d].");
		int n;
		n =15;
		
		double c;
		c = -1.55;
		System.out.println("c = " + c);
		double d;
		d = 3.66;
		System.out.println("d = " + d);
		
		double [] a = new double [n];
		massTool.initMasDouble(a);
		massTool.printMasDouble(a);
		
		for (int i = 0 ; i < a.length ; i ++) {
			if (a[i] > c && a[i] < d) {
				System.out.printf("%.3f   ", a[i]);
			}
		}
		System.out.println ();
		System.out.println ();
	}
}
