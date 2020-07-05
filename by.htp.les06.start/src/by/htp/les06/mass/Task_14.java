package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 14. Дан одномерный массив A[N]. Найти:max( , , , ) min( , , , )
public class Task_14 {
	public static void task () {
		System.out.println ("14. Дан одномерный массив A[N]. Найти:max( , , , ) min( , , , )");
		int n;
		n = 15;
		
		int[]a= new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		int max;
		max = a[1];
		for (int i = 1 ; i < a.length ; i = i + 2) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		
		int min;
		min = a[0];
		for (int i = 0 ; i < a.length ; i = i + 2) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println ("max = " + max);
		System.out.println ("min = " + min);
		System.out.println ();
	}
	
	
}
