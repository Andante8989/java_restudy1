package day4;

class Updater {
	void update(int count) {
		count++;
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
		myUpdater.update(myCounter.count);
		System.out.println("after update : " + myCounter.count);

	}

}
