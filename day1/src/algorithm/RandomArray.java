package algorithm;

import java.util.Random;

public class RandomArray {
	
	static int maxOf(int a[]) {
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int num = 1 + ran.nextInt(10);
		System.out.println("배열의 갯수 : " + num);
		
		int height[] = new int[num];
		
		for(int i = 0; i < height.length; i++) {
			height[i] = 100 + ran.nextInt(100);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		
		System.out.println("최대값은 : " + maxOf(height));
		
		
		
		
	}
}
