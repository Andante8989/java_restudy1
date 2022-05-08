package day5;

class Bouncer {
	void barkAnimal(Animal animal ) {
		if (animal instanceof Tiger) {
			System.out.println("����");
		} else if (animal instanceof Lion) {
			System.out.println("������");
		}
	}
}

public class Sample2 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);    // ���� ���
		bouncer.barkAnimal(lion);     // ������ ���
		// ��ü���� ���α׷����� Ư¡ �߿��� �������� �ִ�. ����ü �������� �����̰� �̰� �� �ʿ��� �ɱ�?
		// �������̽��� ������ implements �� �� �ִ�. 
		
		/*  �ٲ�� ��
		void barkAnimal(Animal animal ) {
		if (animal instanceof Tiger) {
			System.out.println("����");
		} else if (animal instanceof Lion) {
			System.out.println("������");
			}		
		} 
		�ٲ� ��
		void barkAnimal(Barkable animal) {
			animal.bark();
		}
		 */
		// �� �������� ����� tiger, lion��ü�� ���� Tiger,Lion Ŭ������ ��ü�̸鼭 Animal Ŭ������ ��ü�̱⵵ �ϰ�
		// Barkable, Predator�������̽��� ��ü�̱⵵ �ϴ�. �̷��� ������ barkAnimal �޼ҵ��� �Է� �ڷ����� Animal����
		// Barkable�� �ٲپ� ����Ҽ� �ִ� ���̴�
		
		//  interface BarkavlePredator extends Predator, Barkable {  }
		// ������ �������̽��� ����Ͽ� BarkavlePredator�� �������. ���� ���� �ϸ� BarkavlePredator�� Predator�� getFood�޼ҵ�
		// Barkable�� bark�޼ҵ带 �״�� ����� �� �ִ�. �������̽��� �Ϲ� Ŭ�����ʹ� �޸� extends�� �̿��Ͽ� 
		// �������� �������̽��� ���ÿ� ����� �� �ִ�.
		

	}

}
