package day3;

public class for1 {

	public static void main(String[] args) {
		// 전형적인 for 문
		String[] numbers = {"one", "two", "three"};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// numbers 배열의 첫번째 요소부터 마지막 요소까지 출력하는 예이다
		// for문의 조건문은 세미콜론(;)을 구분자로 세 부분으로 나뉘어진다
		// for (초기치; 조건문; 증가치) {
		//      ...
		// }
		// 초기치는 int i = 0 이 되고 조건문은 i<numbers.length 그리고 증가치는 i++이 된다.
		// 즉 i값이 numbers의 갯수보다 작은 동안 계쏙 i값을 1씩 증가시킨다는 의미이다.
		// while문과 비슷하지만 뭔가 컴팩트하게 잘 자여진 느낌이 나는것이 for문의 매력이라고 할 수 있다.
		
		
		// for문의 예제
		// for문의 쓰임새를 알기 위해서 다음을 가정해 보자.
		// "총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다.
		int[] marks = {90, 25, 67, 45, 80};
		for (int i = 0; i<marks.length; i++) {
			if(marks[i] >= 60) {
				System.out.println((i+1) + "번 학생은 합격입니다.");
			} else {
				System.out.println((i+1) + "번 학생은 불합격입니다.");
			}
		}
		// i값이 1씩 증가하며 for문 안의 문장들이 수행된다. 따라서 marks[i] 차례로 90, 25, 67, 45, 80의 값을 갖게 된다
		// marks[i]가 60 이상이면 합격 메시지를 출력하고 60을 넘지 않으면 불합격 메시지를 출력한다
		// i가 marks의 갯수인 5보다 크게되면 for문이 중지된다.
		
		// for와 continue
		// while문에서 알아보았던 continue가 for문에도 동일하게 적용된다
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 60) {
				continue;
			}
			System.out.println((i+1) + "번 학생 축하합니다. 합격입니다.");
		}
		// 점수가 60점 미만인 학생일 경우에는 marks[i] < 60 이 참이 되어 continue문이 수행된다.
		// 따라서 축하 메시지를 출력하는 부분을 수행하지 않고 for문의 첫부분으로 돌아가게 된다.
		
		// 이중 for문
		// for문을 두 번 이용하면 아주 간단하게 구구단을 출력해 볼 수가 있다.
		
		for(int a= 2; a<10; a++) {
			for(int b = 1; b<10; b++) {
				System.out.print(a*b+" ");
			}
			System.out.println("");
		}
		// 먼저 2부터 9까지의숫자가 차례로 a에 대입된다. a 가 처음 2일때 다시 for문을 만나게 된다.
		// 이제 1부터 9까지의 숫자가 b에 대입되고 그다음 문장인 System.out.print(a*b+" "); 를 수행한다
		// 그 다음에는 a가 3일때 역시 마찬가지로 수행될것이가 a가 9일때까지 계속 반복되게 된다
		
		
		
		
		
		
		

	}

}
