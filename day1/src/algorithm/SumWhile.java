package algorithm;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.println("n 값 : ");
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
