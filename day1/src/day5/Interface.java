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
		
		
		
		
		
		
		

	}

}
