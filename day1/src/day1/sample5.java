package day1;

public class sample5 {

	public static void main(String[] args) {
		// 문자 char
		// 한 개의 문자 값에 대한 자료형은 char를 이용한다
		// char 자료형은 다음과 같이 사용한다
		char a1 = 'a';
		// 주의할 점은 위와값이 문자값을 '(단일 인용부호)로 감싸주어야 한다는 점이다. char 자료형은 사실 프로그램
		// 작성 시 그리 많이 사용되는 편이 아니다. 어쩌면 거의 사용 할 일이 없을 정도로 활용성이 적다
		
		// char는 문자값을 표현하는 방식이 다양하기 때문에 주의해야 한다. 다음과 같은 소스코드를 작성하고 실행해 보자
		
		char a2 = 97; // 아스키코드로 표현
		char a3 = '\u0061'; // 유니코드로 표현
		// 세가지 모두 'a'라는 문자를 출력할 것이다. 즉 'a'라는 문자값을 위와 같이 'a', 97, '\u0061'과 같이
		// 설정해도 모두 같은 것이라는 말이다. 첫번째는 문자값, 두번째는 아스키코드, 세번째는 유니코드값으로 표현한 것이다
		
		// 문자열
		// 즉 위의 문자열을 자바에서 표현하려면 다음과 같이 사용해야 한다
		String a = "Happy Java";
		String b = "a";
		String c = "123";
		
		// 하지만 다음과 같이 표현해도 된다
		String d = new String("Happy Java");
		String e = new String("a");
		String f = new String("123");
		// 리터럴 표기
		// String a = "happy java"와 String a = new String("happy java") 는 같은 값을 갖게 되지만 완전히
		// 동일하지는 않다. 첫번째 방식을 리터럴 표기라고 하는데 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다
		// 위 예에서 리터럴 표기법은 "happy java"라는 문자열을 intern pool 이라는 곳에 저장하고 다음에 다시 동일한 문자열이
		// 선언될때는 cache된 문자열을 리턴한다. 두번째 방식은 항상 새로운 String 객체를 만든다.
		
		// 원시 자료형
		// 이전에 살펴보았던 int, long, double, float, boolean, char등을 자바는 원시자료형이라고 부른다.
		// 이런 primitive 자료형은 new키워드로 그 값을 생성할 수 없다
		
		boolean result = true;
		char cappitalC = 'C';
		int i = 100000;
		
		// 여기서 기억해둘 게 있다. String 은 "Happy Java"와 같이 리터럴로 표기가 가능하지만 primitive 자료형은 아니다
		// String 은 리터럴 표현식을 사용할 수 있도록 자바에서 특별 대우 해주는 자료형이다
		
		// int  Integer
		// long Long
		// double Double
		// float Float
		// boolean Boolean
		// char Char
		
		
		
	}

}
