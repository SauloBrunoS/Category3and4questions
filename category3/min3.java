package categoria3;

import java.util.Scanner;

public class Minnumbers {
		
		public static int min3(int a, int b, int c) {	
			if(a <= b && a <= c) return a;
			else if(b <= c) return b;
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
			int minimum = min3(x, y, z);
			System.out.println(minimum);		
			var.close();
		}
	
}
