package categoria3;

import java.util.Scanner;

public class Min {
 
	public static int min2(int a, int b) {	
		if(a > b) return b;
		else return a;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int a = var.nextInt();
		System.out.println("Type the second value:");
		int b = var.nextInt();
		int minimum = min2(a, b);
		System.out.println(minimum);		
		var.close();
	}
	
}
