package day6;

class HouseLee {
	static String lastname = "��";
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
		// return new Singleton(); // ���� Ŭ�����̹Ƿ� ������ ȣ���� �����ϴ�
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
		// �̾� ������ ��Ÿ���� HouseLee Ŭ�����̴�. ���� ���� Ŭ������ ����� ��ü�� �����ϸ� ��ü���� ��ü����
		// lastname�� �����ϱ� ���� �޸𸮰� ������ �Ҵ�ȴ�. �����غ��� HouseLee Ŭ������ lastname�� � ��ü�̴���
		// ������ ���� "��"�̾�� �� �� ���� ������? �̷��� �׻� ���� ������������ static���� �޸� ������ ���� �� �ִ�
		
		// ���� static �߰�
		
		// ���� ���� lastname ������ staticŰ���带 ���̸� �ڹٴ� �޸� �Ҵ��� �� �ѹ��� �ϰ� �Ǿ� �޸� ��뿡 ������ �ִ�
		// static�� ���� ����� �� �� �ִ�. static���� �����Ǹ� ���� ���� �޸� �ּҸ��� �ٶ󺸱� ������ static�������� �����Ѵ�
		Counter c1 = new Counter();    // 1���   , static �߰����� 1���
		Counter c2 = new Counter();    // 1���   , static �߰����� 2���
		// c1.c2 ��ü ������ �����ڿ��� ��ü������ count���� 1�� �����ϴ���� c1�� c2count�� ���� �ٸ� �޸𸮸� ����Ű�� �ֱ� ������
		// ���ϴ� ����� �������ʴ´�. ��ü������ �׻� �������ΰ��� ���� �����̴� 
		// ���� ������ staticŰ����� ���α׷��ֽ� �޸��� ȿ�����ٴ� �����Ǹ������� �ξ� �� ���� ����Ѵ�
		System.out.println(Counter.getCount()); // ����ƽ �޼���� Ŭ������ �̿��Ͽ� ȣ��
		
		// Counter Ŭ������ getCount() ��� static �޼ҵ尡 �߰��Ǿ���. �޼ҵ� �տ� staticŰ���带 ���̸� 
		// Counter/getCount()���� ��ü �������� Ŭ������ ���� �޼ҵ带 ���� ȣ�� �� �� �ִ�.
		
		// �̱��� ����
		// �̹����� ������ ������ �ϳ��� �̱��濡 ���ؼ� �˾ƺ���. �������� static�� ���� ������ ����� ������ �̱����� �����ϴ°���
		// ����� �ʴ�. �̱����� �� �ϳ��� ��ü���� �����ϰ� �����ϴ� �����̴�
		
		Singleton singleton = Singleton.getInstance();
		
		// ���� ���� �ڵ带 �����ϸ� ���� getInstance��� static�޼ҵ带 �̿��Ͽ� SingletonŬ������ ��ü�� ������ �� �ִ�
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2); // true ���
		
		// SingletonŬ������ one�̶�� static ������ �ΰ� getInstance �޼ҵ忡�� one ���� null�� ��쿡�� ��ü��
		// �����ϵ��� �Ͽ� one��ü�� �� �ѹ��� ����������� �ߴ�
		// ���� getInstance�� ȣ�� �Ǹ� one�� null�̹Ƿ� new�� ���ؼ� ��ü�� ������ �ȴ�. �̷��� �ѹ� ���� �Ǹ� one��
		// static �����̱⶧���� �� ���ķδ� null�� �ƴϰ� �ȴ�. �׷� �Ŀ� �ٽ� getInstace�޼ҵ尡 ȣ��Ǹ� ���� one��
		// null�� �ƴϹǷ� �̹� ������� �̱��� ��ü�� one�� �׻� �����Ѵ�
		
		
		
		
		

	}

}
