package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Paridade {
	public static boolean paridade(ArrayList<Boolean> l) {
		int counter = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i))
				counter++;
		}
		if(counter % 2 == 1) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextBoolean());
		}
 		boolean state = paridade(list);
		System.out.println(state);
		var.close();
	}
}
