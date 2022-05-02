package day1;

public class sample6 {

	public static void main(String[] args) {
		// 문자열 내장 메소드
		// equals
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false 출력
		System.out.println(a.equals(c)); // true 출력
		
		// 문자열 a와 문자열 b는 "hello"와 "java"로 서로 같지 않다. 따라서 equals 메소드 호출 시 false를 리턴한다
		// 문자열 a와 문자열 c는 "hello"와 "hello"로 서로 같다. 따라서  true를 리턴한다
		
		// 문자열의 값을 비교할때는 반드시 equals를 사용해야한다. == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다
		String d = "hello";
		String e = new String("hello");
		System.out.println(d.equals(e)); // true
		System.out.println(d == e); // false
		
		// d와e는 값은 같지만 서로 다른 객체이다.== 은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 
		// false를 리턴한다
		
		// indexOf
		String g = "Hello Java";
		System.out.println(g.indexOf("Java")); // 6출력
		// "Hello Java" 라는 문자열에서 "Java"라는 문자열은 일곱번째 문자 'J'부터 시작이다.
		// 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문이다
		
		// contains
		System.out.println(g.contains("Java")); // true 출력
		// 문자열 g는 "Java"라는 문자열을 포함하고 있기 때문에 true출력
		
		// charAt
		System.out.println(g.charAt(6)); // "J"출력
		// "Hello Java"라는 문자열에서 "J" 라는 문자는 일곱번째 문자이다. 하지만 6으로 문자를 찾아야하는 이뉴는 자바는
		// 숫자를 0부터 세기 때문이다
		
		// replaceAll
		System.out.println(g.replaceAll("Java", "World")); // Hello World 출력
		// "Hello Java"라는 문자열에서 "Java"가 "World"로 바뀌엇다
		
		// subString
		System.out.println(g.substring(0, 4)); // Hell 출력
		// 위처럼 subString(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다
		// 단 끝위치는 포함이 안된다는 점에 주의하자. 이것은 다음과 같은 수학의식과 비슷하다
		// 시작위치 <= g < 끝위치
		
		// toUpperCase
		System.out.println(g.toUpperCase()); // HELLO JAVA 출력
		
		// split
		String h = "a : b : c : d";
		String[] result = g.split(":"); // result 는 {"a", "b", "c", "d"}
		
		// 문자열 포매팅
		// 1. 숫자 바로대입
		System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples. 출력
		// 예제처럼 문자열안에 정수 3을 삽입하는 방법을 보여준다. 숫자를 넣고 싶은 자리에 %d 문자를 넣어주고 
		// 삽입할 숫자 3은 두번째 파라미터로 전달했다. 여기에서 %d는 문자열 포맷 코드라고 부른다
		
		// 2. 문자열 바로 대입
		System.out.println(String.format("I eat %s apples", "five")); // I eat five apples 출력
		// 위와다르게 %d가 아닌 %s를 썻다. 어쩌면 눈치 빠른 독자는 벌써 유추하였을 것이다
		// 숫자를 넣기 위해서는 %d를 써야 하고, 문자열을 넣기 위해서는 %s를 써야 한다
		
		// 3. 숫자값을 나타내는 변수로 대입
		int number = 3;
		System.out.println(String.format("I eat %d apples.", number)); // I eat 3 apples 출력
		
		// 4. 2개 이상의 값 넣기
		int num = 10;
		String day = "three";
		// I ate 10 apples. so I was sick for three days 출력
		System.out.println(String.format("I ate %d apples. so I was sick for %s.", number, day ));
		
		
		

	}

}
