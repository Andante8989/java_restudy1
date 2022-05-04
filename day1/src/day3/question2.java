package day3;

public class question2 {

	public static void main(String[] args) {
		int a = 1;
		int total = 0;
		while (true) {
			a++;
			if (a % 3 == 0) {
				total += a;
			}
			if (a > 1000) {
				break;
			}
		}
		System.out.println(total);
	}

}
