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
	void feed(Tiger tiger) { // ȣ���̰� ���� ����� ���� �ش�
		System.out.println("feed apple");
	}
	void feed(Lion lion) {
		System.out.println("feed banana");
	}
}

public class Interface {

	public static void main(String[] args) {
		// �� �������� �������̴�
		// ���ĵ����� ������ �� ���̸� �����ش�
		// ȣ���̰� ���� ����� �����ش�
		// ���ڰ� ���� �ٳ����� �����ش�
		// �̷� ���̽��� �ڵ�� ��ƺ���
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);  // feed apple ���
		zookeeper.feed(lion);  // feed banana ���
		// ���� é�Ϳ��� ���Ҷ� Dog Ŭ������ ���������� Animal�� ����� Tiger�� Lion�� �����ߴ�. �׸��� ���� Ŭ������
		// ZookeeperŬ������ ��ó�� ���� �Ͽ���. ZooKeeperŬ������ ȣ���̰� ���� ��, ���ڰ� ���� �� ���� �ٸ� feed �޼ҵ尡 ȣ��ȴ�.
		
		// �������� �������� ��� �߰��ȴٸ� void feed �޼ҵ带 �߰��ؾߵȴ�,
		// �̷��� �߰��ɶ����� feed �޼ҵ带 �߰��ϸ� �󸶳� �����ٴ°� �̷��� �������̽��� ������ �ʿ��ϴ�
		
		
		
		
		
		
		

	}

}
