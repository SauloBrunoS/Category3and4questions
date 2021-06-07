package categoria3;

import java.util.Scanner;
public class Gangorra {
	public static int seesaw(int p1, int c1, int p2, int c2) {
		if(p1 * c1 == p2 * c2) return 0;
		else if(p1*c1 > p2 * c2) return -1;
		else return 1;
		}
	
		public static void main(String[] args) {
			Scanner var = new Scanner(System.in);
			int[] array = new int[2];
			int[] array2 = new int[2];
			for (int i = 0; i < 2; i++) {
				System.out.println("Type the p" + (i+1));
				array[i] = var.nextInt();
				System.out.println("Type the c" + (i+1));
				array2[i] = var.nextInt();
			}	
			int result = seesaw(array[0], array2[0], array[1], array2[1]);
			System.out.println(result);
			var.close();
		}

}
