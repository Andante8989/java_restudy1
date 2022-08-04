package algorithm;

public class Question8 {
	
	static int sumof(int a, int b) {
	int max = 0;
	int min = 0;
	int sum = 0;
	
	if(a > b) {
		max = a;
		min = b;
	} else {
		max = b;
		min = a;
	}
	
	for(int i = min; i <= max; i++) {
		sum += i;
	}
	return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumof(5, 2));
	}
}
