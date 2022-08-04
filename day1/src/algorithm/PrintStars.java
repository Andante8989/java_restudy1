package algorithm;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ��� ���� ����Ұǰ���?");
		int total = scan.nextInt();
		System.out.print("����� ���� �����ǰ���?");
		int w = scan.nextInt();
		
		for(int i = 0; i < total/w; i++) {
			System.out.println("*".repeat(w));
		}
		int rest = total % w;
		if(rest != 0) {
			System.out.println("*".repeat(rest));
		}
		
	}
}
