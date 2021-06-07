package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaImpares {
	public static int oddsum(ArrayList<Integer> l) {
		int counter = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) % 2 == 1)
				counter += l.get(i);
		}
		return counter;
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
		int sum = oddsum(list);
		System.out.println(sum);
		var.close();
	}
}
