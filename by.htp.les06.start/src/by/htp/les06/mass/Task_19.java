package by.htp.les06.mass;
// 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.

import by.htp.les06.view.massTool;


public class Task_19 {
	public static void task() {
		System.out.println ("19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел\r\n" + 
				"несколько, то определить наименьшее из них.");
		int n;
		n = 1000;
		
		int[]a = new int[n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
	
		int count;
		int maxcount;
		maxcount = 0;
		int number;
		number = a[0];
		for ( int i = 0; i < a.length ; i ++) {
			count = 1;
			for ( int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count ++;
				}
				
			}
			//System.out.println ("Число " + a[i] + " встречается " + count + " раз.");
			if (count > maxcount ) {
				maxcount = count; 
				number = a[i];
			}else if (count == maxcount) {
				if (a[i] > number) {
					number = a[i];
				}
			}
		}
		System.out.println ("наиболее часто встречающееся число всетречается " + maxcount + " раз(a), возможно еще какое-то число встречается " + maxcount + " раз(а), но число " + number + " наименьшее из них.");
		System.out.println ();
	}
}
