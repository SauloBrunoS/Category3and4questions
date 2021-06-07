package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Elemento {

	public static int elemento(int n, ArrayList<Integer> l) {
		if (n >= 0)
			return l.get(n);
		return l.get(n + l.size());
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type the index of the element that you want:");
		int n = var.nextInt();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		int element = elemento(n, list);
		
		System.out.println(element);
		var.close();
	}

}
