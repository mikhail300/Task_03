package by.htp.les06.view;

public class massTool {
	
	

	public static void initMasInt (int mass[]) {
		for (int i=0;i < mass.length;i++) {
			mass[i] = (int) (Math.random()*20) -10;
			}
	}

	public static void initMasDouble (double mass[]) {
		for (int i=0;i < mass.length;i++) {
			mass[i] = (Math.random()*20) -10;
			}
	}
	
	public static void printMasInt (int mass[]) {
		for (int i=0;i < mass.length;i++) {
			System.out.print (mass[i] + ", ");
			}
		System.out.println ();
	}
	
	public static void printMasDouble (double mass[]) {
		for (int i=0;i < mass.length;i++) {
			System.out.printf ("%.3f ", mass[i] );
			}
		System.out.println ();
	}
}
