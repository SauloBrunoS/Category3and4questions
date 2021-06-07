package categoria3;

import java.util.Scanner;
import java.util.ArrayList;

public class CountNeg {
	public static int countneg(ArrayList<Integer> l) {
		int counter = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) < 0)
				counter++;
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
		int qt = countneg(list);
		System.out.println("Quantity of negative numbers:" + qt);
		var.close();
	}

}
