package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class interseccao {

	public static boolean contains(int n, ArrayList<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			if (n == l.get(i))
				return true;
		}
		return false;
	}

	public static ArrayList<Integer> interseccao(ArrayList<Integer> l, ArrayList<Integer> l2) {

		ArrayList<Integer> l3 = new ArrayList<Integer>();
        
		int smaller;
		
	    if(l.size() > l2.size()) smaller = l2.size();
	    else smaller = l.size();
		
		for (int i = 0; i < smaller; i++) {
			if (contains((int) l.get(i), l2))
				l3.add(l.get(i));
		}	
		return l3;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Type the first list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		System.out.println("Type the second list's size:");
		int size2 = var.nextInt();
		for (int i = 0; i < size2; i++) {
			System.out.print("Type an element of the list: ");
			list2.add(var.nextInt());
		}
		ArrayList<Integer> intersection = interseccao(list, list2);
		
		System.out.print("[");
		for (int i = 0; i < intersection.size(); i++) {
		      if(i + 1 < intersection.size())
		    	  System.out.print(intersection.get(i)+",");
		      else
		    	  System.out.print(intersection.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
