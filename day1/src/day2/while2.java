package day2;

public class while2 {

	public static void main(String[] args) {
		// while 문장을 반복해서 수행해야 할 경우에 사용한다
		
		// while (조건문) {
		// 	<수행할 문장1>;
		//  <수행할 문장2>;
		//  <수행할 문장3>;
		//  ....
		// }
		
		// 10번찍어 안넘어 가는 나무 없다" 라는 속담을 자바로 코딩해본다
		
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다,");
			if (treeHit == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}
		// 위의 예에서 while문의 문의 조건문은 treeHit < 10 이다. 즉, treeHit가 10보다 작은 동안에 while 문 안의 문장들을 수행한다.
		// 문장안에 treeHit++로 인해 treeHit 값이 계속 1씩 증가하고 10이되면 "나무 넘어갑니다" 출력후 빠져나가게 된다
		
		// 무한루프(Loop)
		
		// while (true) {
		// 	<수행할 문장1>;
		//  <수행할 문장2>;
		//  ....
		// }
		
		// while문 빠져 나가기
		// 커피자판기 - "돈을 받으면 커피를 줘라" 라는 조건문을 가진 while문 수행
		// 자판기가 제역할을 하려면 커피의 양을 따로이 검사를 해서 커피가 다 떨어지면 while문을 멈추게 하고 "판매중지"란 문구를
		// 자판기에 보여야 한다. while문을 강제로 멈춰야 할 때 사용하는것이 바로 break이다.
		
		int coffee = 10;
		int money = 300;
		while (money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다."); 
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다.");
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
		// money가 300으로 고정되어 있으니까 money는 0보다 크기 때문에 항상 참이다. 따라서 무한루프를 돌게 된다
		// 그리고 while 문이 수행되면 coffee-- 에 의해서 coffee개수가 한개씩줄어들게 된다
		// 만약 coffee가 0이 되면 if(coffee==0) 문장이 참이되므로 break가 호출되어 while문을 빠져 나간다
		
		// while 조건문으로 돌어가기
		// while문안의 문장을 수행할 때 어떤 조건을 검사해서 조건에맞지는 경우 while문을 빠져나가는 대신 while
		// 문의 맨처음 으로 돌아가게 하고싶은 경우
		
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue;    // 짝수인 경우 조건문으로 돌아간다
			}
			System.out.println(a);   // 홀수만 출력된다
		}
		
		// 1에서 10까지의 수중 홀수만 출력하는 예이다.
		// a가 10보다 작은동안 a는 1씩 계속 증가한다.
		// a % 2 == 0이 참이되는 경우는 a가 짝수일 때이다. 바로 continue가 수행디ㅗ며 처음조건으로 돌아가게 된다
		
	}

}
