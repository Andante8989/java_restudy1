package day4;

class Updater {
	void update(Counter counter) {
		counter.count++;
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
		myUpdater.update(myCounter);
		System.out.println("after update : " + myCounter.count);
		// UpdaterŬ������ ���޹��� ���ڸ� 1��ŭ ������Ű�� update��� �޼ҵ带 ������ �ִ�
		// CounterŬ������ count��� ��ü ������ ������ �ִ�. 
		// ������ �����ϸ� ��� 0�� ��µȴ�
		// ��ü ���� count�� ���� update�޼ҵ忡 �Ѱܼ� �����Ű���� ���� ��ȭ�� ����. �� ������ ���� é�Ϳ��� �˾ƺ� �Ͱ� ����
		// update �޼ҵ�� ��(int �ڷ���)�� ���޹޾ұ� �����̴�
		
		
		// ���� �������� �������� update�޼ҵ��� �Է��׸��̴�. �������� int count ������ Counter counter
		// ���� ����� 0 �� 1�� �ȴ�
		
		// �̷��� �޼ҵ��� �Է����� ��ü�� ���޹ٵ� ��쿡�� �޼ҵ尡 �Է¹�����ü�� �״�� ����ϱ� ������ �޼ҵ尡 ��ü��
		// �Ӽ����� �����ϸ� �޼ҵ� ���� �Ŀ��� ��ü�� ����� �Ӽ����� �����ȴ�.

	}

}
