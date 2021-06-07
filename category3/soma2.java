package categoria3;

import java.util.Scanner;

public class Soma {
 
	public static int soma2(int a, int b) {	
		return a + b;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int x = var.nextInt();
		System.out.println("Type the second value:");
		int y = var.nextInt();
		int sum= soma2(x, y);
		System.out.println(sum);		
		var.close();
	}
}
