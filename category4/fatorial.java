package categoria4;

import java.util.Scanner;

public class Fatorial {
	public static int fatorial(int n) {
		if (n < 2)
			return 1;
		return n * fatorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		int result = fatorial(n);
		System.out.println(result);
		var.close();
	}
}
