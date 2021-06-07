package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Divide {

	public static ArrayList <ArrayList<Integer>> divide(ArrayList<Integer> l, int n) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			l1.add(l.get(i));
		}
		for (int i = n; i < l.size(); i++) {
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
		System.out.println("Type the value where the list will be divided:");
		int n = var.nextInt();
		ArrayList <ArrayList<Integer>> m = divide(list, n);
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
