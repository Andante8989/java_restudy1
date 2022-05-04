package day3;

public class question5 {
	public static void main(String[] args) {
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int total = 0;
		for(int mark : marks) {
			total += mark;
		}
		System.out.println(total / marks.length);
	}
}
