package algorithm;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    int result = (1 + n)*(n / 2) + (n % 2 ==0 ? 0 : (n+1)/2);
		
	    System.out.println(result);

		
      
       
	}
}