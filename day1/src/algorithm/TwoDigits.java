package algorithm;

import java.util.Scanner;

public class TwoDigits {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.println("수를 입력해주세요.");
			n = scan.nextInt();
		} while (n < 10 || n > 99);
		
		System.out.println("입력한 수는 " + n + " 입니다.");
	}
}
