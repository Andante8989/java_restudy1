package algorithm;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("총 몇개의 별을 출력할건가요?");
		int total = scan.nextInt();
		System.out.print("몇개마다 줄을 내릴건가요?");
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
