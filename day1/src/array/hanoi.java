package array;

import java.util.Scanner;

public class hanoi {

	static void move(int no, int x, int y) {
		if(no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		System.out.printf("����[%d]�� %d�� ��տ��� %d������� �ű�\n" , no, x, y);
		if(no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("������ ���� : ");
		int n = scan.nextInt();
		
		move(n, 1, 3);
		
	}
}
