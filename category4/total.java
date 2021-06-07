package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class total {
	public static int tot(ArrayList<Integer> l) {
	  int counter = 0;
		for(int elem: l) {
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
			int size2 = tot(list);
			System.out.println(size2);
			var.close();
		}
}
