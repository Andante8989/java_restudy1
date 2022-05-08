package day5;


class Animals {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animals {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	HouseDog(String name) {
		this.setName(name);
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}

public class Constructor {

	public static void main(String[] args) {
		//HouseDog dog = new HouseDog();
		//System.out.println(dog.name); // null 출력
		
		// dog 객체의 name 변수에 아무런 값도 설정하지 않았기 때문에 null이 출력될 것이다
		// 이렇듯 HouseDog 클래스는 코딩하기에 따라 객체변수 name에 값을 설정할 수도 있고 설정 안할 수도 있다.
		// 그렇다면 name 이라는 객체변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제할 수 있는 방법은 없을까?
		// 생성자를 이용하면 된다
		
		// 생성자의 규칙
		// 1. 클래스명과 메소드명이 동일하다
		// 2. 리턴타입을 정의하지 않는다.(void도 사용하지 않는다.)
		// 생성자는 메소드와 마찬가지로 다양한 입력을 받을 수 있다.
		// 우리가 HouseDog 클래스에 만든 생성자는 다음과 같이 입력값으로 문자열을 필요로 하는 생성자이다.
		
		HouseDog dog = new HouseDog("happy");
		// 만약 다음처럼 코딩하면 컴파일 오류가 발생할 것이다
		// HouseDog dog = new HouseDog();
		
		// 오류가 발생하는 이유는 객체 생성 방법이 생성자의 규칙과 맞지 않기 때문이다. 생성자가 선언된 경우 생성자의 규칙대로만
		// 객체를 생성할 수 있다.
		
		// HouseDog 클래스에 위와 같이 생성자를 선언하면 new HouseDog() 을 사용하는 main 메소드에서 컴파일 오류가 발생할 것이다
		
		// 디폴트 생성자
		/*
		class Dog extends Animal {
			void sleep() {
				System.out.println(this.name + "zzz");
			}
		}
		class Dog extends Aniaml {
			Dog() {
				
			}
			void sleep() {
				System.out.println(this.name + " zzz");
			}
		}   */
		// 첫번째 코드와 두번째 코드의 차이점은 무엇일까? 두번 째 코드에는 생성자가 구현되어 있다. 생성자의 입력 항목이 없고
		// 생성자 내부에 아무 내용이 없는 위와 같은 생성자를 디폴트 생성자라고 부른다.
		// 위와 같이 디폴트 생성자를 구현하면 new Dog()로 Dog 클래스의 객체가 만들어 질 때 위에 구현한 디폴트 생성자가
		// 실행될 것이다. 만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 위와같은 디폴트 생성자를 추가한다.
		// 하지만 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않는다.
		
		// 생성자 오버로딩
		/*
		class HouseDog extends Dog {
			HouseDog(String name) {
				this.setName(name);
			}
			HouseDog(int type) {
				if (type == 1) {
					this.setName("yorkshire");
				} else if (type == 2) {
					this.setName("bulldog");
				}
			}
		} */
		// 위의 HouseDog 클래스는 두 개의 생성자가 있다. 하나는 String 자료형을 입력으로 받는 생성자이고 다른 하나는 int 자료형을
		// 입력으로 받는 생성자이다. 두 생성자의 차이는 입력 항목이다. 이렇게 입력 항목이 다른 생성자를 여러 개 만들 수 있는데 이런 것
		// 을 생성자 오버로딩이라고 한다.
		
		
		
		

	}

}
