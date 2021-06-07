package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class sublist {
	public static ArrayList<Integer> sublist(int a, int b, ArrayList<Integer> l) {

		ArrayList<Integer> l3 = new ArrayList<Integer>();
       
		if(a < 0) a = a + l.size();
		if(b < 0) b = b + l.size();
		
		for (int i = a; i < b; i++) {
			l3.add(l.get(i));
		}
		return l3;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		System.out.println("Type the initial index of the list:");
		int initial = var.nextInt();
		System.out.println("Type the final index of the list:");
		int finin = var.nextInt();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		
		ArrayList<Integer> sublis = sublist(initial, finin, list);
		
		System.out.print("[");
		for (int i = 0; i < sublis.size(); i++) {
		      if(i + 1 < sublis.size())
		    	  System.out.print(sublis.get(i)+",");
		      else
		    	  System.out.print(sublis.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
