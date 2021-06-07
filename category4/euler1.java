package categoria4;

import java.util.Scanner;

public class multiplos {
	public static int euler1(int n) {
		int sum = 0;
		if(n - 1 < 0) return 0;
		if(n - 1 == 0) return 0;
	    if((n-1) % 3 == 0 || (n-1) % 5 == 0) sum= sum + (n-1) + euler1(n-1);
	    else sum += euler1(n-1);
		return sum;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		int result = euler1(n);
		System.out.println(result);
		var.close();
	}
}
