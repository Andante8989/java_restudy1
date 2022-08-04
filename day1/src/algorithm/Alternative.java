package algorithm;

import java.util.Scanner;

public class Alternative {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
	}
}
