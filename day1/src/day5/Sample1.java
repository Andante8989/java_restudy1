package day5;

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name); // poppy 출력
	}
	
	// 클래스 상속을 위해서는 extends라는 키워드를 사용한다
	// 이제 Dog 클래스는 Animal 클래스를 상속하게 되었다. Dog 클래스에 name이라는 객체변수와 setName 이라는 메소드를
	// 만들지 않았지만 Animal 클래스를 상속했기 때문에 그대로 사용이 가능하다
	
	// 부모 클래스의 기능을 확장
	// 이제 Dog클래스는 Animal 클래스보다 좀 더 많은 기능(sleep메소드가 추가되었다)을 가지게 되었다. 이렇듯 보통 
	// 부모클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 더하여 좀 더 많은 기능을 갖도록 작성한다
	
	// IS-A 관계
	// Dog 클래스는 Animal클래스를 상속했다. 즉, Dog는 Animal의 하위 개념이라고 할 수 있다. 이런 경우 Dog는 Animal에
	// 포함되기 때문에 "개는 동물이다" 라고 표현할 수 있다
	// 자바는 이러한 관계를 IS-A 관계라고 표현한다. 즉 "Dog is a Animal"과 같이 말할수 있는 관계를 IS-A 관계라고 한다
	// 이렇게 IS-A관계에 있을 때 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다.
	
	Animal dog = new Dog();  // dog is a Animal
	// Dog dog = new Animal();  // 컴파일 오류 : 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.
	
	// 개로 만든 객체는 동물 자료형이다
	// 동물로 만든 객체는 개 자료형이다  개념적으로 보아도 두번째 문장이 성립되지 않는다는 것을 알 수 있다.
	
	// 메소드 오버라이딩
	// 이번ㅇ에는 Dog클래스를 좀 더 구체화 시키는 HouseDog 클래스를 만들어 보자. HouseDog 클래스는 Dog클래스를 상속하여
	// 다음과 같이 만들 수 있다
	HouseDog houseDog = new HouseDog();
	//HouseDog.setName("happy");
	//houseDog.sleep(); // happy zzz 출력
	// 여기서 happy zzz in house를 출력해야한다고 가정하면 어떻게 해야할까
	// Dog 클래스에 있는 sleep 메소드를 HouseDog에 내용만 조금 변경하여 재 구현하고 실행하니 다음처럼 원하던 결과값을 얻을 수 있다
	// HouseDog 클래스에 Dog 클래스와 동일한 형태( 입출력이 동일)의 sleep메소드를 구현하면 HouseDog 클래스의 sleep 메소드가
	// Dog 클래스의 sleep 메소드보다 더 높은 우선순의를 갖게 되어 HouseDog 클래스의 sleep 메소드가 호출되게 된다.
	
	
	// 메소드 오버로딩
	// 이번에는 HouseDog 클래스에 다음과 같은 메소드를 추가해 보자.("변경"이 아니라 "추가"임에 주의하자.)
	// 이미 sleep이라는 메소드가 있지만 동일한 이름의 sleep메소드를 또 생성할 수 있다. 단, 메소드의 입력항목이 다를 경우만 
	// 가능하다. 새로 만든 sleep메소드는 입력항목으로 hour라는 int자료형이 추가되었다.
	// 이렇듯 입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩이라고 부른다
	
	// houseDog.sleep(3); // happy zzz in house for 3 hours 출력
	
	
	// 다중 상속
	// 다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는것을 뜩한다. C++, 파이썬 등 많은 언어들이 다중 상속을 지원하지만 
	// 자바는 다중 상속을 지원하지 않는다
	// 만약 자바가 다중 상속을 지원한다면 다음과 같은 코드가 만들어 질 수 있을 것이다.
	/*
	 class A {
	 	public void msg() {
	 		System.out.println("A message");
	 	}
	 }
	 
	 Class B {
	 	public void msg() {
	 		System.out.println("B message");
	 	}
	 }
	 
	 Class C extends A, B {
	 	public void static main(String[] args) {
	 		C test = new C();
	 		test.msg();
	 	}
	 }
	 자바가 다중 상속을 지원한다고 가정하고 A,B 라는 클래스를 위와 같이 동시에 상속(extends A,B)하도록 했다.
	 위 main 메소드에서 test.msg(); 실행 시 A클래스의 msg메소드를 실행해야할까? 아니면 B 클래스의 msg 메소드를 실행해야 할까
	 다중 상속을 지원하게 되면 이렇듯 애매모호한 부분이 생기게 된다. 자바는 이러한 불명확한 부분을 애초에 잘라 낸 언어이다
	 */
	
	
	

}
