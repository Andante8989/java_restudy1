package day6;

class HouseLee {
	static String lastname = "이";
}
class Counter {
	static int count = 0;
	Counter() {
		count++;
		System.out.println(count);
	}
	public static int getCount() {
		return count;
	}
}

class Singleton {
	private static Singleton one;
	private Singleton() {
	}
	public static Singleton getInstance() {
		// return new Singleton(); // 같은 클래스이므로 생성자 호출이 가능하다
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}
}
public class static1 {

	public static void main(String[] args) {
		HouseLee lee1 = new HouseLee();
		HouseLee lee2 = new HouseLee();
		// 이씨 집안을 나타내는 HouseLee 클래스이다. 위와 같은 클래스를 만들고 객체를 생성하면 객체마다 객체변수
		// lastname을 저장하기 위한 메모리가 별도로 할당된다. 생각해보면 HouseLee 클래스의 lastname은 어떤 객체이던지
		// 동일한 값이 "이"이어야 할 것 같지 않은가? 이렇게 항상 값이 변하지않으면 static사용시 메모리 이점을 얻을 수 있다
		
		// 위에 static 추가
		
		// 위와 같이 lastname 변수에 static키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점이 있다
		// static은 공유 개녕믈 들 수 있다. static으로 설정되면 같은 곳의 메모리 주소만을 바라보기 때문에 static변수값을 공유한다
		Counter c1 = new Counter();    // 1출력   , static 추가이후 1출력
		Counter c2 = new Counter();    // 1출력   , static 추가이후 2출력
		// c1.c2 객체 생성시 생성자에게 객체변수인 count값을 1씩 증가하더라고 c1과 c2count는 서로 다른 메모리를 가리키고 있기 때문에
		// 원하던 결과가 나오지않는다. 객체변수는 항상 독립적인값을 갖기 때문이다 
		// 보통 변수의 static키워드는 프로그래밍시 메모리의 효율보다는 공유의목적으로 훨씬 더 많이 사용한다
		System.out.println(Counter.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출
		
		// Counter 클래스에 getCount() 라는 static 메소드가 추가되었다. 메소드 앞에 static키워드를 붙이면 
		// Counter/getCount()같이 객체 생성없이 클래스를 통해 메소드를 직접 호출 할 수 있다.
		
		// 싱글턴 패턴
		// 이번에는 디자인 패턴중 하나인 싱글톤에 대해서 알아보자. 여러분은 static에 대한 개념이 생겼기 때문에 싱글톤을 이해하는것이
		// 어렵지 않다. 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다
		
		Singleton singleton = Singleton.getInstance();
		
		// 위와 같이 코드를 변경하면 이제 getInstance라는 static메소드를 이용하여 Singleton클래스의 객체를 생성할 수 있다
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2); // true 출력
		
		// Singleton클래스에 one이라는 static 변수를 두고 getInstance 메소드에서 one 값이 null인 경우에만 객체를
		// 생성하도록 하여 one객체가 닥 한번만 만들어지도록 했다
		// 최초 getInstance가 호출 되면 one이 null이므로 new에 의해서 객체가 생성이 된다. 이렇게 한번 생이 되면 one은
		// static 변수이기때문에 그 이후로는 null이 아니게 된다. 그런 후에 다시 getInstace메소드가 호출되면 이제 one은
		// null이 아니므로 이미 만들어진 싱글톤 객체인 one을 항상 리턴한다
		
		
		
		
		

	}

}
