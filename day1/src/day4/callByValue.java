package day4;

class Updater {
	void update(Counter counter) {
		counter.count++;
	}
}
 
class Counter {
	int count = 0; // 객체 변수
}

public class callByValue {

	public static void main(String[] args) {
		// 메소드에 값을 전달하는 것과 객체를 전달하는 것에는 큰 차이가 있다
		// 메소드에 객체를 전달할 경우 메소드에서 객체의 객체변수 값을 변경할 수 있따
		Counter myCounter = new Counter();
		System.out.println("before update : " + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("after update : " + myCounter.count);
		// Updater클래스는 전달받은 숫자를 1만큼 증가시키는 update라는 메소드를 가지고 있다
		// Counter클래스는 count라는 객체 변수를 가지고 있다. 
		// 하지만 실행하면 모두 0이 출력된다
		// 객체 변수 count의 값을 update메소드에 넘겨서 변경시키더라도 값에 변화가 없다. 그 이유는 이전 챕터에서 알아본 것과 같이
		// update 메소드는 값(int 자료형)을 전달받았기 때문이다
		
		
		// 이전 예제와의 차이점은 update메소드의 입력항목이다. 이전에는 int count 지금은 Counter counter
		// 이제 출력은 0 과 1이 된다
		
		// 이렇게 메소드의 입력으로 객체를 전달바든 경우에는 메소드가 입력받은객체를 그대로 사용하기 때문에 메소드가 객체의
		// 속성값을 변경하면 메소드 수행 후에도 객체의 변경된 속성값이 유지된다.

	}

}
