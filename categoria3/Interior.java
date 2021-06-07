package categoria3;

import java.util.ArrayList;
import java.util.Scanner;

public class Interior {
	public static ArrayList<Integer> removeextremes(ArrayList<Integer> l) {
	l.remove(0);
	l.remove(l.size()- 1);
	return l;
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
		
		ArrayList<Integer> l1 =removeextremes(list);
		System.out.print("[");
		for (int i = 0; i < l1.size(); i++) {
			if (i + 1 < l1.size())
				System.out.print(l1.get(i) + ",");
			else
				System.out.print(l1.get(i));
		}
		System.out.print("]");
		
		var.close();
	}
}
