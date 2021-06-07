package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class swap {

	public static ArrayList<Integer> troca(int a, int b, ArrayList<Integer> l) {
		 if(a <= 0 || a >= l.size()) return l;
		 if(b <= 0 || b >= l.size()) return l;
		
		 int temp = l.get(a);
		 
		 l.set(a, l.get(b));
		 l.set(b, temp);
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
		System.out.println("Type the first index of the list:");
		int initial = var.nextInt();
		System.out.println("Type the second index of the list:");
		int finin = var.nextInt();
		
		ArrayList<Integer> swap = troca(initial, finin, list);
		
		System.out.print("[");
		for (int i = 0; i < swap.size(); i++) {
		      if(i + 1 < swap.size())
		    	  System.out.print(swap.get(i)+",");
		      else
		    	  System.out.print(swap.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
