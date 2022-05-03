package day2;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		// 리스트는 배열과 비슷한 자바의  자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
		// 리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다. 배열은 크기가 정해져 있다
		// 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을수는 없다.
		// 하지만 리스트는 크기가 정해져 있지 않아 원하는 만큼의 갑을 담을 수 있다
		
		// 박찬호 선수의 투구스피드를 저장해야한다고 가정해 보자
		// 배열을 이용하여 투구수를 저장 할 수 있을까? 프로그래밍 시 크기를 알 수 있는 상황도 있지만 명확한 크기를 
		// 알 수 없는 경우가 더 많다. 이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.
		
		
		// ArrayList
		// List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자
		// List 자료형
		// ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다. 
		
		// add
		// 박찬호 선수가 총 3번의 투그를 138, 129, 142(km)의 속도로 던졌다면 다음과 같이 코드를 작성할 수 있다
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		// ArrayList를 사용하기 위해서는 import해야한다
		
		// ArrayList 객체인 pitches에 add 라는 메소드를 이용하여 투구 스피드를 저장했다. 
		// 만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야한다
		pitches.add(0, 133); // 첫번째 위치에 133 삽입.
		// 만약 2번째 위치에 133을 삽입 할 경우에는 다음과 같이 코딩하면 된다
		pitches.add(1, "133");
		
		// 제네릭스
		// 자바는 J2SE 5.0 버전 이후부터 ArrayList<String> pitches = new ArrayList<>(); 처럼 객체를 포함하는 
		// 자료형도 어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을 권고하고 있다. 인텔리제이에서 위의 예제와 같이 제네릭스
		// 없이 코딩하면 타입을 명시하라는 warning이 표시될 것이다
		
		// get
		// 박찬호 선수의 2번째 투구 스피드를 출력하고 싶다면 다음과 같이 한다
		System.out.println(pitches.get(1));
		// ArrayList의 get메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.
		
		// size
		// size 메소드는 ArrayList의 갯수를 리턴한다
		System.out.println(pitches.size());
		// 위 코드를 실행하면 pitches에 담긴 갯수가 출력된다
		
		// contains
		// contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다
		System.out.println(pitches.contains("142"));
		// pitches 객체는 142값을 포함하고 있으므로 true가 출력된다.
		
		// remove
		// remove 메소드에는 2가지 방식이 있다. (이름은 같지만 입력파라미터가 다르다)
		// 1. remove(객체)
		// 2. remove(인덱스)
		// 객체의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴한다
		System.out.println(pitches.remove("129"));
		// "129"라는 항목이 성공적으로 삭제되고 true를 리턴한다
		// 두 번째 remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다
		System.out.println(pitches.remove(0));
		// 첫번째 항
		

	}

}
