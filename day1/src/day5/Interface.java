package day5;

interface Predator {
	
}

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator{
	
}
class Lion extends Animal implements Predator{
	
}
class ZooKeeper {
	void feed(Tiger tiger) { // 호랑이가 오면 사과를 던져 준다
		System.out.println("feed apple");
	}
	void feed(Lion lion) {
		System.out.println("feed banana");
	}
}

public class Interface {

	public static void main(String[] args) {
		// 난 동물원의 사육사이다
		// 육식동물이 들어오면 난 먹이를 던져준다
		// 호랑이가 오면 사과를 던져준다
		// 사자가 오면 바나나를 던져준다
		// 이런 케이스를 코드로 담아보자
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);  // feed apple 출력
		zookeeper.feed(lion);  // feed banana 출력
		// 이전 챕터에서 보았떤 Dog 클래스와 마찬가지로 Animal을 상속한 Tiger와 Lion이 등장했다. 그리고 사욕사 클래스인
		// Zookeeper클래스를 위처럼 정의 하였다. ZooKeeper클래스는 호랑이가 왔을 때, 사자가 왔을 때 각각 다른 feed 메소드가 호출된다.
		
		// 동물원에 동물들이 계속 추가된다면 void feed 메소드를 추가해야된다,
		// 이렇게 추가될때마다 feed 메소드를 추가하면 얼마나 귀찮겟는가 이럴때 인터페이스의 도움이 필요하다
		/*
		class ZooKeeper {
			void feed(Predator predator) {
				System.out.println("feed apple");
			}
		} */
		// feed메소드의 입력으로 Tiger, Lion을 각각 필요로 했지만 이제 이것을 Predator 라는 인터페이스로 대체할 수 있게 되었다
		// tiger, lion은 각각 Tiger, Lion의 객체이기도 하지만 Predator인터페이스의 객체이기도 하기 때문에 위와같이
		// Predator를 자료형의 타입으로 사용할 수 있는 것이다. 상속에서 공부했던 IS-A관계가 인터페이스에도 마찬가지로 적용된다
		// 이제 어떤 육식동물이 추가되더라도 ZooKeeper는 feed메소드를 추가할 피룡가 없다. 다만 육식동물이 추가 될 때마다
		// 다음과 같이 Predator인터페이스를 구현한 클래스를 작성하기만 하면 되는 것이다.
		
		// 눈치가 빠르다면 이제 왜 인터페이스가 필요한지 감을 잡았을 것이다. 보통 중요 클래스를 작성하는 입장이라면 (여기서는
		// ZooKeeper가 중요한 클래스이다) 클래스의 구현체와 상관없이 인터페이스를 기준으로 중요 클래스 작성해야만 한다. 구현체는
		// 늘어날수 있지만 인터페이스는 하나이기 때문이다.
		
		// 인터페이스의 핵심과 개념
		// 육식 동물들의 종류만큼의 feed 메소드가 필요했던 ZooKeeper클래스를 Predator 인터페이스르를 이용하여 구현했더니 단 한개의
		// feed 메소드로 구현이 가능해졌다. 여기서 중요한 점은 메소드의 갯수가 줄어들었따는 점이 아니라 ZooKeeper 클래스가 동물들의
		// 종류의 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다. 바로 이점이 인터페이스의 핵심이다
		
		// 이번에는 좀 더 개념적으로 인터페이스를 생각해보자
		// 아마도 여러분은 컴퓨터의 usb포트에 대해서 알고 있을 것이다. usb 포트에 연결할 수 있는 기기는 하드디스크, 메모리스틱, 스마트폰
		// 무척많다. 바로 이 usb포트가 물리적 세계의 인터페이스라고 할 수 있다. usb포트의 규격만 알면 어떤 기기도 만들 수 있다.
		// 또 컴퓨터는 usb포트만 제공하고 어떤 기기가 만들어지는 지 신경 쓸 필요가없다. 바로 이점이 인터페이스와 매우 비슷하다.
		
		// 물리적 세계     자바 세계
		// 컴퓨터         ZooKeeper
		// USB 포트      Predator
		// 하드디스크,..   Tiger,Lion, Crocodile..
		
		// 디폴트 메서드
		// 자바 8버전 이후부터는 디폴트 멧드를 사용할 수 있다. 인터페이스의 메서드는 몸통을 가질 수 없지만 
		// 디폴트 메서드를 사용하면 실제 구현된 형태의 메서드를 가질 수 있다.
		/*
		interface Predator {
			String getFood();
			
			default void printFood() {
				System.out.printf("my food is %s\n", getFood());
			}
		}   */
		// 디폴트 메서드는 메소드명 가장 앞에 "default"라고 표기해야한다. 이렇게 Predator 인터페이스에 printFood 디폴트
		// 메서드를 구현하면 Predator 인터페이스를 구현한 Tiger, Lion 등의 실제 클래스는 printFood 메서드를 구현하지 않아도
		// 사용할 수 있다. 그리고 디폴트 메소드는 오버라이딩이 가능하다. 즉 printFood 메서드를 실제 클레스에서 다르게 구현하여 사용할 수 있다.
		
		// 스태틱 메서드
		// 자바 8버전 이후부터는 인터페이스에 스태틱 메서드를 사용할 수 있다. 인터페이스에 스태틱 메서드를 구현하면 
		// 인터페이스명.스태틱메서드명 과 같이 사용하여 일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용할 수 있다.
		/*
		interface Predator {
			String getFood();
			
			default void printFood() {
				System.out.printf("my food is %s\n", getFood());
			}
			
			int LEG_COUNT = 4;  // 인터페이스 상수
			
			static int speed() {
				return LEG_COUNT * 30;
			}
		} */
		// 이렇게 스태틱 메서드를 추가하면 다음과 같이 사용할 수 있다
		// Predator.speed();
		
		
		
		
		
		

	}

}
