package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Pertence {
	public static boolean pertence(int n, ArrayList<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			if (n == l.get(i)) return true;		
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type a value:");
		int n = var.nextInt();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		boolean belongs = pertence(n, list);
		System.out.println(belongs);
		var.close();
	}
}
