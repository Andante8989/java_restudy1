package algorithm;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ��");
		System.out.println("n �� : ");
		int n = scan.nextInt();
		
		int sum = 0;
		int a = 1;
		
		while (a <= n) {
			sum += a;
			a++;
		}
		System.out.println(sum);
	}
}
