package day2;

import java.util.ArrayList;

public class iiff {

	public static void main(String[] args) {
		boolean money = true;
		if(money) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		// 조건문을 테스트해서 참이면 if문에 속한 문장들을 수행하고 조건문이 거짓이면 else문에 속한 문장들을 수행한다.
		
		// 조건문이란?
		// if(조건문)에 사용한 조건문은 참과 거짓을 판단하는 문장이다
		// 위의 예시에서는 money 는 true이기 대문에 "택시를 타고가라"이 출력된다
		
		// 비교연산자
		// <, >, ==, !=, >=, <= 
		int x = 3;
		int y = 2;
		System.out.println(x > y); // true 출력
		System.out.println(x == y); // false 출력
		System.out.println(x != y); // true 출력
		// 예시를 바꿔보자 "만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
		int money2 = 2000;
		if(money2 >= 3000) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		// money >= 3000 이란 조건문이 거짓이 되기 때문에 else 문의 문장이 수행되어 "걸어가라"가 출력된다
		
		// and(&&), or(||), not(!)
		// x || y - x와 y 중 적어도 하나가 참이면 참이다
		// x && y - x와 y 모두 참이어야 참이다
		// !x - x가 거짓이면 참이다
		
		boolean hasCard = true;
		if(money2 >= 3000 || hasCard) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		// money는 2000으로 3000보다 작지만 hasCard가 true이기 때문에 money >= 3000 || hasCard 조건문이
		// 참이되어 "택시를 타고 가라"가 출력된다

		// contains
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		// pocket리스트 안에 money가 있으므로 참이되어 "택시를 타고 가라"가 출력된다
		
		// else if(다중조건 판단)
		if(pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else {
			if (hasCard) {
				System.out.println("택시를 타고 가라");
			} else {
				System.out.println("걸어가라");
			}
		}
		// if와 else가 여러번 사용되어 이해하기 어렵다 이럴때 else if를 사용한다
		if(pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else if (hasCard) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		// else if 는 이전 조건문이 거짓일 때 수행된다. 
		// else if 는 개수에 재한 없이 사용 할 수 있다.
		
		
		
		
		
		
		
		
		
		
	}

}
