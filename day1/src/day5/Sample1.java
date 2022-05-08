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
		System.out.println(dog.name); // poppy ���
	}
	
	// Ŭ���� ����� ���ؼ��� extends��� Ű���带 ����Ѵ�
	// ���� Dog Ŭ������ Animal Ŭ������ ����ϰ� �Ǿ���. Dog Ŭ������ name�̶�� ��ü������ setName �̶�� �޼ҵ带
	// ������ �ʾ����� Animal Ŭ������ ����߱� ������ �״�� ����� �����ϴ�
	
	// �θ� Ŭ������ ����� Ȯ��
	// ���� DogŬ������ Animal Ŭ�������� �� �� ���� ���(sleep�޼ҵ尡 �߰��Ǿ���)�� ������ �Ǿ���. �̷��� ���� 
	// �θ�Ŭ������ ��ӹ��� �ڽ� Ŭ������ �θ� Ŭ������ ��ɿ� ���Ͽ� �� �� ���� ����� ������ �ۼ��Ѵ�
	
	// IS-A ����
	// Dog Ŭ������ AnimalŬ������ ����ߴ�. ��, Dog�� Animal�� ���� �����̶�� �� �� �ִ�. �̷� ��� Dog�� Animal��
	// ���ԵǱ� ������ "���� �����̴�" ��� ǥ���� �� �ִ�
	// �ڹٴ� �̷��� ���踦 IS-A ������ ǥ���Ѵ�. �� "Dog is a Animal"�� ���� ���Ҽ� �ִ� ���踦 IS-A ������ �Ѵ�
	// �̷��� IS-A���迡 ���� �� �ڽ� Ŭ������ ��ü�� �θ� Ŭ������ �ڷ����� ��ó�� ����� �� �ִ�.
	
	Animal dog = new Dog();  // dog is a Animal
	// Dog dog = new Animal();  // ������ ���� : �θ� Ŭ������ ���� ��ü�� �ڽ� Ŭ������ �ڷ������� ����� �� ����.
	
	// ���� ���� ��ü�� ���� �ڷ����̴�
	// ������ ���� ��ü�� �� �ڷ����̴�  ���������� ���Ƶ� �ι�° ������ �������� �ʴ´ٴ� ���� �� �� �ִ�.
	
	// �޼ҵ� �������̵�
	// �̹������� DogŬ������ �� �� ��üȭ ��Ű�� HouseDog Ŭ������ ����� ����. HouseDog Ŭ������ DogŬ������ ����Ͽ�
	// ������ ���� ���� �� �ִ�
	HouseDog houseDog = new HouseDog();
	//HouseDog.setName("happy");
	//houseDog.sleep(); // happy zzz ���
	// ���⼭ happy zzz in house�� ����ؾ��Ѵٰ� �����ϸ� ��� �ؾ��ұ�
	// Dog Ŭ������ �ִ� sleep �޼ҵ带 HouseDog�� ���븸 ���� �����Ͽ� �� �����ϰ� �����ϴ� ����ó�� ���ϴ� ������� ���� �� �ִ�
	// HouseDog Ŭ������ Dog Ŭ������ ������ ����( ������� ����)�� sleep�޼ҵ带 �����ϸ� HouseDog Ŭ������ sleep �޼ҵ尡
	// Dog Ŭ������ sleep �޼ҵ庸�� �� ���� �켱���Ǹ� ���� �Ǿ� HouseDog Ŭ������ sleep �޼ҵ尡 ȣ��ǰ� �ȴ�.
	
	
	// �޼ҵ� �����ε�
	// �̹����� HouseDog Ŭ������ ������ ���� �޼ҵ带 �߰��� ����.("����"�� �ƴ϶� "�߰�"�ӿ� ��������.)
	// �̹� sleep�̶�� �޼ҵ尡 ������ ������ �̸��� sleep�޼ҵ带 �� ������ �� �ִ�. ��, �޼ҵ��� �Է��׸��� �ٸ� ��츸 
	// �����ϴ�. ���� ���� sleep�޼ҵ�� �Է��׸����� hour��� int�ڷ����� �߰��Ǿ���.
	// �̷��� �Է��׸��� �ٸ� ��� ������ �̸��� �޼ҵ带 ���� �� �ִµ� �̸� �޼ҵ� �����ε��̶�� �θ���
	
	// houseDog.sleep(3); // happy zzz in house for 3 hours ���
	
	
	// ���� ���
	// ���� ����� Ŭ������ ���ÿ� �ϳ� �̻��� Ŭ������ ��ӹ޴°��� ���Ѵ�. C++, ���̽� �� ���� ������ ���� ����� ���������� 
	// �ڹٴ� ���� ����� �������� �ʴ´�
	// ���� �ڹٰ� ���� ����� �����Ѵٸ� ������ ���� �ڵ尡 ����� �� �� ���� ���̴�.
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
	 �ڹٰ� ���� ����� �����Ѵٰ� �����ϰ� A,B ��� Ŭ������ ���� ���� ���ÿ� ���(extends A,B)�ϵ��� �ߴ�.
	 �� main �޼ҵ忡�� test.msg(); ���� �� AŬ������ msg�޼ҵ带 �����ؾ��ұ�? �ƴϸ� B Ŭ������ msg �޼ҵ带 �����ؾ� �ұ�
	 ���� ����� �����ϰ� �Ǹ� �̷��� �ָŸ�ȣ�� �κ��� ����� �ȴ�. �ڹٴ� �̷��� �Ҹ�Ȯ�� �κ��� ���ʿ� �߶� �� ����̴�
	 */
	
	
	

}
