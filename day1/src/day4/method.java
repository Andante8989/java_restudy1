package day4;

public class method {
	int sum(int a , int b) {  // a, b �Ű�����
		return a + b;
	}

	public static void main(String[] args) {
		// �ٸ� ���α׷��� ���� �Լ���� ���� ������ �����Ѵ�. ������ �ڹٴ� Ŭ������ ���� �����ϴ� ���� 
		// ���� �� ���� ������ �ڹ��� �Լ��� ���� �������� �ʰ� Ŭ���� ���� �����Ѵ�.
		// �ڹٴ� �̷��� Ŭ���� ���� �Լ��� �޼ҵ��� �θ���
		
		// �޼ҵ带 ����ϴ� ����?
		// ���� ���α׷����� �ϴ� ���� �Ȱ��� ������ �ڽ��� �ݺ��ؼ� ���� �ִ� ���� �߰��� ���� �ִ�. �� ���� �ٷ� �޼ҵ尡
		// �ʿ��� ���̴�. ���� �� �ں��ؼ� ���ȴٴ� ���� ������ �Ǵٽ� ����� ���� ��ġ�� �ִ� �κ��̶�� ���̴�.
		
		int a = 3;      // 3, 4 �� �μ�
		int b = 4;
		method method = new method();
		int c = method.sum(a, b);
		
		// �� �ڵ�� sum�޼ҵ忡 3,4��� �Է°��� �����ϸ� 7�̶�� ���� �����޴� ���̴�.
		
		// �Ű������� �μ�
		// �谳������ �μ��� ȫ���ؼ� ���Ǵ� �򰥸��� ����̹Ƿ� �� ����� ����. �Ű������� �޼ҵ忡 �Է����� ���޵� ����
		// �޴� ������ �ǹ��ϰ� �޼ҵ带 ȣ���� �� �����ϴ� �Է°��� �ǹ��Ѵ�.
		
		// �޼ҵ��� �Է°��� ���ϰ�
		// �Է°� ---> �޼ҵ�() -----> ���ϰ�
		// �޼ҵ��� ����
		// �����ڷ��� �޼ҵ�� (�Է��ڷ���1 �Ű�����1, �Է��ڷ���2 �Ű�����2...) {
		//    return ���ϰ�;  // �����ڷ����� void�� ��쿡�� return ���� �ʿ����
		// }
		
		// �����ڷ����� �޼ҵ� ���� �� ������ ���� �ڷ����� �ǹ��Ѵ�. �޼ҵ��� ���ϰ��� return�̶�� ������ ����Ѵ�
		
		// �Ϲ����� �޼ҵ�
		// �Է� �� = int �ڷ��� a, int �ڷ��� b
		// ���� �� = int �ڷ���
		
		// ���ϰ� ���� ���� = ��ü.�޼ҵ��(�Է��μ�1, �Է��μ�2, ....)
		// sum �޼ҵ��� ��� ���� ������ ����
		method sample = new method();
		int result = sample.sum(3, 4);
		// ������ ������ sample.sun(3,4) ȣ�� �� ���ϰ��� �����ϴ� result�� �ڷ����� int�� �ؾ߸� �Ѵ�. 
		// �ֳ��ϸ� sum �޼ҵ��� ����Ÿ���� int�� �Ǿ� �ֱ� �����̴�. sum �޼ҵ��� ����Ÿ���� int sum(int a, int b) {...
		// ���� ������ �޼ҵ�� (sum)�ٷ� ������ ǥ���ϵ��� �Ǿ��ִ�.
		
		
		
		
		
		

	}

}