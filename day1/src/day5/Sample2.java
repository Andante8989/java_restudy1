package day5;

class Bouncer {
	void barkAnimal(Animal animal ) {
		if (animal instanceof Tiger) {
			System.out.println("어흥");
		} else if (animal instanceof Lion) {
			System.out.println("으르렁");
		}
	}
}

public class Sample2 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);    // 어흥 출력
		bouncer.barkAnimal(lion);     // 으르렁 출력
		// 객체지향 프로그래밍의 특징 중에는 다형성이 있다. 도대체 다형성은 무엇이고 이게 왜 필요한 걸까?
		// 인터페이스는 여러개 implements 할 수 있다. 
		
		/*  바뀌기 전
		void barkAnimal(Animal animal ) {
		if (animal instanceof Tiger) {
			System.out.println("어흥");
		} else if (animal instanceof Lion) {
			System.out.println("으르렁");
			}		
		} 
		바뀐 후
		void barkAnimal(Barkable animal) {
			animal.bark();
		}
		 */
		// 위 예제에서 사용한 tiger, lion객체는 각각 Tiger,Lion 클래스의 객체이면서 Animal 클래스의 객체이기도 하고
		// Barkable, Predator인터페이스의 객체이기도 하다. 이러한 이유로 barkAnimal 메소드의 입력 자료형을 Animal에서
		// Barkable로 바꾸어 사용할수 있는 것이다
		
		//  interface BarkavlePredator extends Predator, Barkable {  }
		// 기존의 인터페이스를 상속하여 BarkavlePredator를 만들었다. 위와 같이 하면 BarkavlePredator는 Predator의 getFood메소드
		// Barkable의 bark메소드를 그대로 사용할 수 있다. 인터페이스는 일반 클래스와는 달리 extends를 이용하여 
		// 여러개의 인터페이스를 동시에 상속할 수 있다.
		

	}

}
