package categoria3;

import java.util.ArrayList;
import java.util.Scanner;

public class Final {

	public static ArrayList<Integer> finall(int n, ArrayList<Integer> l) {
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = l.size() - n; i < l.size(); i++) {
			l2.add(l.get(i));
		}
		return l2;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type how many final elements you want:");
		int n = var.nextInt();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		ArrayList<Integer> l3 = finall(n, list);
		System.out.print("[");
		for (int i = 0; i < l3.size(); i++) {
			if (i + 1 < l3.size())
				System.out.print(l3.get(i) + ",");
			else
				System.out.print(l3.get(i));
		}
		System.out.print("]");

		var.close();
	}
}
