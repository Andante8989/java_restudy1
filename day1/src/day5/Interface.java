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
		/*
		class ZooKeeper {
			void feed(Predator predator) {
				System.out.println("feed apple");
			}
		} */
		// feed�޼ҵ��� �Է����� Tiger, Lion�� ���� �ʿ�� ������ ���� �̰��� Predator ��� �������̽��� ��ü�� �� �ְ� �Ǿ���
		// tiger, lion�� ���� Tiger, Lion�� ��ü�̱⵵ ������ Predator�������̽��� ��ü�̱⵵ �ϱ� ������ ���Ͱ���
		// Predator�� �ڷ����� Ÿ������ ����� �� �ִ� ���̴�. ��ӿ��� �����ߴ� IS-A���谡 �������̽����� ���������� ����ȴ�
		// ���� � ���ĵ����� �߰��Ǵ��� ZooKeeper�� feed�޼ҵ带 �߰��� �Ƿ氡 ����. �ٸ� ���ĵ����� �߰� �� ������
		// ������ ���� Predator�������̽��� ������ Ŭ������ �ۼ��ϱ⸸ �ϸ� �Ǵ� ���̴�.
		
		// ��ġ�� �����ٸ� ���� �� �������̽��� �ʿ����� ���� ����� ���̴�. ���� �߿� Ŭ������ �ۼ��ϴ� �����̶�� (���⼭��
		// ZooKeeper�� �߿��� Ŭ�����̴�) Ŭ������ ����ü�� ������� �������̽��� �������� �߿� Ŭ���� �ۼ��ؾ߸� �Ѵ�. ����ü��
		// �þ�� ������ �������̽��� �ϳ��̱� �����̴�.
		
		// �������̽��� �ٽɰ� ����
		// ���� �������� ������ŭ�� feed �޼ҵ尡 �ʿ��ߴ� ZooKeeperŬ������ Predator �������̽����� �̿��Ͽ� �����ߴ��� �� �Ѱ���
		// feed �޼ҵ�� ������ ����������. ���⼭ �߿��� ���� �޼ҵ��� ������ �پ������� ���� �ƴ϶� ZooKeeper Ŭ������ ��������
		// ������ �������� Ŭ�������� �������� ������ ������� �������� Ŭ������ �Ǿ��ٴ� ���̴�. �ٷ� ������ �������̽��� �ٽ��̴�
		
		// �̹����� �� �� ���������� �������̽��� �����غ���
		// �Ƹ��� �������� ��ǻ���� usb��Ʈ�� ���ؼ� �˰� ���� ���̴�. usb ��Ʈ�� ������ �� �ִ� ���� �ϵ��ũ, �޸𸮽�ƽ, ����Ʈ��
		// ��ô����. �ٷ� �� usb��Ʈ�� ������ ������ �������̽���� �� �� �ִ�. usb��Ʈ�� �԰ݸ� �˸� � ��⵵ ���� �� �ִ�.
		// �� ��ǻ�ʹ� usb��Ʈ�� �����ϰ� � ��Ⱑ ��������� �� �Ű� �� �ʿ䰡����. �ٷ� ������ �������̽��� �ſ� ����ϴ�.
		
		// ������ ����     �ڹ� ����
		// ��ǻ��         ZooKeeper
		// USB ��Ʈ      Predator
		// �ϵ��ũ,..   Tiger,Lion, Crocodile..
		
		// ����Ʈ �޼���
		// �ڹ� 8���� ���ĺ��ʹ� ����Ʈ ��带 ����� �� �ִ�. �������̽��� �޼���� ������ ���� �� ������ 
		// ����Ʈ �޼��带 ����ϸ� ���� ������ ������ �޼��带 ���� �� �ִ�.
		/*
		interface Predator {
			String getFood();
			
			default void printFood() {
				System.out.printf("my food is %s\n", getFood());
			}
		}   */
		// ����Ʈ �޼���� �޼ҵ�� ���� �տ� "default"��� ǥ���ؾ��Ѵ�. �̷��� Predator �������̽��� printFood ����Ʈ
		// �޼��带 �����ϸ� Predator �������̽��� ������ Tiger, Lion ���� ���� Ŭ������ printFood �޼��带 �������� �ʾƵ�
		// ����� �� �ִ�. �׸��� ����Ʈ �޼ҵ�� �������̵��� �����ϴ�. �� printFood �޼��带 ���� Ŭ�������� �ٸ��� �����Ͽ� ����� �� �ִ�.
		
		// ����ƽ �޼���
		// �ڹ� 8���� ���ĺ��ʹ� �������̽��� ����ƽ �޼��带 ����� �� �ִ�. �������̽��� ����ƽ �޼��带 �����ϸ� 
		// �������̽���.����ƽ�޼���� �� ���� ����Ͽ� �Ϲ� Ŭ������ ����ƽ �޼��带 ����ϴ� �Ͱ� �����ϰ� ����� �� �ִ�.
		/*
		interface Predator {
			String getFood();
			
			default void printFood() {
				System.out.printf("my food is %s\n", getFood());
			}
			
			int LEG_COUNT = 4;  // �������̽� ���
			
			static int speed() {
				return LEG_COUNT * 30;
			}
		} */
		// �̷��� ����ƽ �޼��带 �߰��ϸ� ������ ���� ����� �� �ִ�
		// Predator.speed();
		
		
		
		
		
		

	}

}
