package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class maximo {
	public static int maior(ArrayList<Integer> l) {
		int max = l.get(0);
		for (int i = 1; i < l.size(); i++) {
			if (l.get(i) > max)
				max = l.get(i);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		int maximum = maior(list);
		System.out.println(maximum);
		var.close();
	}
}
