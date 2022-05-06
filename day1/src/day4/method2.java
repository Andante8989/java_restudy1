package day4;

public class method2 {
	String say() {
		return "Hi";
	}
	
	void sum(int b, int c) {
		System.out.println(b + "과 " + c + "의 합은 " + (b + c) + "입니다.");
	}
	
	void say1() {
		System.out.println("Hi");
	}
	
	void sayNick(String nick) {
		if("fool".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은  " + nick + " 입니다.");
	}
	
	void varTest(int d) {
		d++;
		// return d;
	}

	public static void main(String[] args) {
		// 입력값이 없는 메소드
		// 입력 값 - 없음
		// 리턴 값 - String 자료형
		// say라는 이름의 메소드를 만들었다. 하지만 입력 인수부분을 나타내는 괄호 안이 비어있다.
		method2 sample = new method2();
		String a = sample.say();
		System.out.println(a);   // Hi 출력
		
		// say메소드는 쓰기 위해서는 say()처럼 괄호 안에 아무런 값도 넣지 않고 써야한다. say메소드는 입력값은 없지만
		// 리턴값으로 Hi라는 문자열을 돌려준다. String a = sample.say() 처럼 하면 a에는 Hi라는 문자열이 대입될 것이다
		// 리턴값받을변수 = 객체.메소드명()
		
		// 리턴값이 없는 메소드
		// sum메소드이 입출력 자료형은 다음과 같다
		// 입력값 - int 자료형 b, int 자료형 c
		// 리턴값 - void(없음)
		// 리턴값이 없는 메소드는 명시적으로 리턴타입 부분에 void라고 표기한다. 리턴값이 없는 메소드는 돌려주는 값이 없기 때문에
		// 다음과 같이 사용한다
		method2 sample2 = new method2();
		sample2.sum(3, 4);
		// 객체.메소드명(입력인수1, 입력인수2, ...) 
		// 3과 4의 합은 7입니다. 출력
		// 출력이 되었는데 왜 리턴값이 없다는것인가? 이 부분이 초보자들이 혼동스러워 하는 부분이기도 한데 System.out.println문은
		// 메소드내에서 사용되어지는 문장일뿐이다. 돌려주는 값은 당연히 없다. 돌려주는 값은 return 명령어로만 가능하다
		
		// 입력값도 리턴값도 없는 메소드
		// 입력값 - 없음
		// 리턴값 - void(없음)
		method2 sample3 = new method2();
		sample3.say1();   // Hi 출력
		// 객체.메소드명()
		
		// return의 또 다른 쓰임새
		// 특별한 경우에 메소드를 빠져나가기를 원할 때 return을 단독으로 사용하여 메소드를 즉시 빠져나갈 수 있다.
		method2 sample4 = new method2();
		sample4.sayNick("angel");
		sample4.sayNick("fool"); 
		// sayNick 메소드는 입력으로 받은 문자열 값을 받아서 출력하는 메소드이다. 이 메소드 역시 리턴값은 없다. 문자열을 출력한다는 것은
		// 리턴값이 있따는 것은 전혀 다른 말이다. 혼동하지 말도록 하자. 메소드의 리턴값은 오로지 return문에 의해서만 생성된다
		// 이 메소드는 입력값으로 fool 이라는 값이 들어오면 문자열을 출력하지 않고 메소드를 즉시 빠져나간다. 이렇게 메소드 수행 시 
		// 특정 조건에 따라 메소드를 즉시 빠져나가고 싶은 경우 return문을 이용하면된다.
		
		
		// 메소드 내에서 선언된 변수의 효력 범위
		int d = 1;
		method2 sample5 = new method2();
		sample5.varTest(d);
		System.out.println(d); // 1출력
		// 위 예제의 varTest 메소드는 입력으로 들어온 int자료형의 값을 1만큼 증가시키는 역할을 한다
		// 먼저 메소드에서 d라는 int자료형의 변수를 생성하고 1을 대입했다. 그리고 varTest 메소드를 입력 값 d를 주어 호출했다
		// 그 다음에 d의 값을 출력하게 하였다. 당연히 varTest d의 값을 1만큼 증가시켰으니 2가 출력되어야 할 것 같지만
		// 프로그램을 실행시켜 보면 1이라는 결과 값이 나온다
		// 그 이유는 메소드 내에서 사용되는 변수는 메소드 안에서만 쓰여지는 변수이기 때문이다. 즉 public void varTest(int d) {
		// 라는 문장에서 입력 인수를 뜻하는 변수 d는 메소드 안에서만 쓰이는 변수이지 메소드 밖의 변수 d가 아니라는 말이다
		
		// 즉, 메소드에서 쓰이는 변수는 메소드 밖의 변수 이름들과는 전혀 상관 없다. 그래서 이렇게 메소드 내에서만 쓰이는 변수를 
		// 로컬변수라고도 말한다
		// 그렇다면 varTest라는 메소드를 이용해서 메소드 외부의 d를 1만큼 즈가시킬수 있는 방법은 없을까?
		// d = sample5.varTest(d);
		
		// 해법은 예처럼 varTest메소드에 return문을 이용하는 방법이다. varTest메소드는 입력으로 들어온 값을 1만큼 증가시켜
		// 리턴한다. d의 값은 다시 varTest메소드의 리턴값으로 대입된다.
		
		
		
		
	}

}
