package algorithm;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		int n;
		
		do {
			System.out.print("n의 값 : ");
			n = scan.nextInt();
		} while(n <= 0);
		
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		
		System.out.println("총합 : " + sum);
		
	}
}
