package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
	    a[idx1] = a[idx2];
	    a[idx2] = t;
	}
	
	static void reverse(int a[]) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = scan.nextInt();
		}
		
		reverse(x);
		
		System.out.println("역순으로 배열한 결과");
		System.out.println("x = " + Arrays.toString(x));
	}

}
