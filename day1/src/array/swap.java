package array;

import java.util.Arrays;

public class swap {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3};
		System.out.println(Arrays.toString(a));
		
		swap(a, 0, 2);
		System.out.println(Arrays.toString(a));
	}
}
