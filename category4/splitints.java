package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class split {
	public static ArrayList <ArrayList<Integer>> split(ArrayList<Integer> l) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = 0; i < l.size(); i++) {
			if(l.get(i) % 2 == 1)
			l1.add(l.get(i));
			else
			l2.add(l.get(i));
		}
		ArrayList <ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		m.add(l1);
		m.add(l2);
		return m;
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
		
		ArrayList <ArrayList<Integer>> m = split(list);
		System.out.print("(");
		for(int i = 0; i < m.size(); i++) {
			System.out.print("[");
			for(int j = 0; j < m.get(i).size(); j++) {
				if(j + 1 < m.get(i).size())
			    	  System.out.print(m.get(i).get(j)+",");
			      else
			    	  System.out.print(m.get(i).get(j));
			}
			System.out.print("]");
			if(i+1 < m.size()) System.out.print(",");
		}
		System.out.print(")");
		var.close();
	}
}
