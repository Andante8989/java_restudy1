package algorithm;

import java.util.Scanner;

public class TwoDigits {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.println("���� �Է����ּ���.");
			n = scan.nextInt();
		} while (n < 10 || n > 99);
		
		System.out.println("�Է��� ���� " + n + " �Դϴ�.");
	}
}
