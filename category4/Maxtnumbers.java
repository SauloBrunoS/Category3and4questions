package categoria4;

import java.util.Scanner;

public class Maxtnumbers {
	public static int max3(int a, int b, int c) {	
		if(a >= b && a >= c) return a;
		else if(b >= c) return b;
		else return c;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int x = var.nextInt();
		System.out.println("Type the second value:");
		int y = var.nextInt();
		System.out.println("Type the third value:");
		int z = var.nextInt();
		int maximum = max3(x, y, z);
		System.out.println(maximum);		
		var.close();
	}
}
