package categoria3;

import java.util.Scanner;

public class Iguais {

	public static int qtofequals(int a, int b, int c) {
		if (a == b && b == c)
			return 3;
		else if (a == b || b == c || a == c)
			return 2;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Type a value:");
			array[i] = var.nextInt();
		}
		int qt = qtofequals(array[0], array[1], array[2]);
		System.out.print("Quantity of equals: " + qt);
		var.close();
	}
}
