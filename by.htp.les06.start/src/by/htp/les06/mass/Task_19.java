package by.htp.les06.mass;
// 19. � ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. ���� ����� ����� ���������, �� ���������� ���������� �� ���.

import by.htp.les06.view.massTool;


public class Task_19 {
	public static void task() {
		System.out.println ("19. � ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. ���� ����� �����\r\n" + 
				"���������, �� ���������� ���������� �� ���.");
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
			//System.out.println ("����� " + a[i] + " ����������� " + count + " ���.");
			if (count > maxcount ) {
				maxcount = count; 
				number = a[i];
			}else if (count == maxcount) {
				if (a[i] > number) {
					number = a[i];
				}
			}
		}
		System.out.println ("�������� ����� ������������� ����� ������������ " + maxcount + " ���(a), �������� ��� �����-�� ����� ����������� " + maxcount + " ���(�), �� ����� " + number + " ���������� �� ���.");
		System.out.println ();
	}
}
