package algorithm;

import java.util.Scanner;

public class Gaus {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ��(���콺)");
		System.out.println("n�� �� : ");
		
		int n = scan.nextInt();
		int result;
		
		result = (1 + n)*(n / 2) + (n%2==0? 0 : (n + 1)/2);
		
		System.out.println(result);

	}
}
