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
		//System.out.println(dog.name); // null ���
		
		// dog ��ü�� name ������ �ƹ��� ���� �������� �ʾұ� ������ null�� ��µ� ���̴�
		// �̷��� HouseDog Ŭ������ �ڵ��ϱ⿡ ���� ��ü���� name�� ���� ������ ���� �ְ� ���� ���� ���� �ִ�.
		// �׷��ٸ� name �̶�� ��ü������ ���� ������ �����ؾ߸� ��ü�� ������ �� �ֵ��� ������ �� �ִ� ����� ������?
		// �����ڸ� �̿��ϸ� �ȴ�
		
		// �������� ��Ģ
		// 1. Ŭ������� �޼ҵ���� �����ϴ�
		// 2. ����Ÿ���� �������� �ʴ´�.(void�� ������� �ʴ´�.)
		// �����ڴ� �޼ҵ�� ���������� �پ��� �Է��� ���� �� �ִ�.
		// �츮�� HouseDog Ŭ������ ���� �����ڴ� ������ ���� �Է°����� ���ڿ��� �ʿ�� �ϴ� �������̴�.
		
		HouseDog dog = new HouseDog("happy");
		// ���� ����ó�� �ڵ��ϸ� ������ ������ �߻��� ���̴�
		// HouseDog dog = new HouseDog();
		
		// ������ �߻��ϴ� ������ ��ü ���� ����� �������� ��Ģ�� ���� �ʱ� �����̴�. �����ڰ� ����� ��� �������� ��Ģ��θ�
		// ��ü�� ������ �� �ִ�.
		
		// HouseDog Ŭ������ ���� ���� �����ڸ� �����ϸ� new HouseDog() �� ����ϴ� main �޼ҵ忡�� ������ ������ �߻��� ���̴�
		
		// ����Ʈ ������
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
		// ù��° �ڵ�� �ι�° �ڵ��� �������� �����ϱ�? �ι� ° �ڵ忡�� �����ڰ� �����Ǿ� �ִ�. �������� �Է� �׸��� ����
		// ������ ���ο� �ƹ� ������ ���� ���� ���� �����ڸ� ����Ʈ �����ڶ�� �θ���.
		// ���� ���� ����Ʈ �����ڸ� �����ϸ� new Dog()�� Dog Ŭ������ ��ü�� ����� �� �� ���� ������ ����Ʈ �����ڰ�
		// ����� ���̴�. ���� Ŭ������ �����ڰ� �ϳ��� ���ٸ� �����Ϸ��� �ڵ����� ���Ͱ��� ����Ʈ �����ڸ� �߰��Ѵ�.
		// ������ ����ڰ� �ۼ��� �����ڰ� �ϳ��� �����Ǿ� �ִٸ� �����Ϸ��� ����Ʈ �����ڸ� �߰����� �ʴ´�.
		
		// ������ �����ε�
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
		// ���� HouseDog Ŭ������ �� ���� �����ڰ� �ִ�. �ϳ��� String �ڷ����� �Է����� �޴� �������̰� �ٸ� �ϳ��� int �ڷ�����
		// �Է����� �޴� �������̴�. �� �������� ���̴� �Է� �׸��̴�. �̷��� �Է� �׸��� �ٸ� �����ڸ� ���� �� ���� �� �ִµ� �̷� ��
		// �� ������ �����ε��̶�� �Ѵ�.
		
		
		
		

	}

}
