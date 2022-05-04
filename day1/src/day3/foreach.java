package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class foreach {

	public static void main(String[] args) {
		// for each는 J3SE 5.0 부터 추가되었다. for each라는 키워드가 따로 있는 것은 아니고 동일한 for를 이용한다
		
		String[] numbers = {"one", "two", "three"};
		for (String number : numbers) {
			System.out.println(number);
		}
		// for each문은 보기에 매우 직관적이다
		// for each문의 구조는 다음과 같다
		// for (type car : iterate) {
		//     body-of-loop
		// }
		
		// 위에서 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 순차적으로 var에 대입되어 for문이 수행된다
		// iterate로 사용할 수 있는 자료형은 루프를 돌릴 수 있는 자료형(배열 및 ArrayList등)만 가능하다
		
		ArrayList<String> numberss = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String number : numberss) {
			System.out.println(number);
		}
		
		// 단, for each문은 따로 반복회수를 명시적으로 주는것이 불가능하고 1스템씩 순찬적으로 반복될때만 사용가능하다는 제약이 있다.
		
		
		
		
		
		

	}

}
