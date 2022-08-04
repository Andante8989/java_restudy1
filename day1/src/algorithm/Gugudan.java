package algorithm;

public class Gugudan {

	public static void main(String[] args) {
		
		for(int dan = 1; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + dan * num);
			}
			System.out.println("-------------------");
		}
	}
}
