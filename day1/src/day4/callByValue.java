package day4;

class Updater {
	void update(int count) {
		count++;
	}
}
 
class Counter {
	int count = 0; // ��ü ����
}

public class callByValue {

	public static void main(String[] args) {
		// �޼ҵ忡 ���� �����ϴ� �Ͱ� ��ü�� �����ϴ� �Ϳ��� ū ���̰� �ִ�
		// �޼ҵ忡 ��ü�� ������ ��� �޼ҵ忡�� ��ü�� ��ü���� ���� ������ �� �ֵ�
		Counter myCounter = new Counter();
		System.out.println("before update : " + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter.count);
		System.out.println("after update : " + myCounter.count);

	}

}
