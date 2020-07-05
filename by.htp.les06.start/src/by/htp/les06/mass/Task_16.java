package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 16. Даны действительные числа  a ,a , ,a 1 2  . Найти max( , , , ) 
public class Task_16 {
	public static void task () {
		System.out.println ("16. Даны действительные числа  a ,a , ,a 1 2  . Найти max( , , , )");
		int n;
		n = 15;
		
		double []a = new double [n];
		massTool.initMasDouble(a);
		massTool.printMasDouble(a);
		
		double max = 0;
		
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			if (a[i] + a[j] > max) {
				max = a[i] + a[j];
			}
		}
		System.out.printf("Max = "+ max);
		System.out.println ();
		System.out.println ();
	}
}
