package day3;

	class Calculater1 {
		static int result = 0;
		
		static int add(int num) {
			result += num;
			return result;
		}
	}
	class Calculater2 {
		static int result = 0;
		
		static int add(int num) {
			result += num;
			return result;
		}
	}

public class objectOrented {
	
	public static void main(String[] args) {
		// ������ ��� ���⸦ ����� ������ ���̴�. ���⿡ ���� 3�� �Է��ϰ� + ��ȣ�� �Է��� �� 4�� �Է��ϸ�
		// ��������� 7�� �����ش�. �ٽ� �� �� + ��ȣ�� �Է��� �� 3�� �Է��ϸ� ���� ����� 7�� 3�� ���� 10�� �����ش�
		// �� ����� ������ ����� ������� �׻� �޸� ��򰡿� �����ϰ� �־�� �Ѵ�
		
		System.out.println(Calculater1.add(3));  // 3���
		System.out.println(Calculater1.add(4));  // 7���
		// add�޼ҵ�� �Ű����� num���� ���� ���� ������ ����� ������� ���� �� �����ִ� �޼ҵ��̴�.
		// ������ ����� ������� �����ϱ� ���ؼ� result ���� ����(static)�� ����ߴ�.
		
		// �׷��� ���� 2���� ���Ⱑ �ʿ��� ��Ȳ�� �߻��ϸ� ��� �ؾ��ұ� 
		// �� ����� ������ ������� �����ؾ��ϱ� ������ Calculator Ŭ���� �ϳ������δ� ������� ���� ������ �� ����
		System.out.println(Calculater2.add(3)); // 3���
		System.out.println(Calculater2.add(7)); // 10���
		
		
		// ���� 1�� ������� ���� 2�� �ƹ� ������ ��ġ�� ������ Ȯ���� �� �ִ�. ������ ���Ⱑ 3��, 5��, 10����
		// ���� �� ���� �ʿ������ٸ� ��� �ؾ� �ұ�? �׶����� Ŭ������ �߰��� ���ΰ�
		// ���⿡ ���ϱ� ���ϱ���� ������ �߰��ؾ� �Ѵٸ� ��Ȳ�� ���� �� ������� ���̴�
		
		// ��ü�� ����ϸ� ������ ���� �����ϰ� �ذ��� �� �ִ�
		
		Calculater1 car1 = new Calculater1(); // ���� 1 ��ü�� �����Ѵ�. 
		Calculater2 car2 = new Calculater2(); // ���� 2 ��ü�� �����Ѵ�.
		
		System.out.println(car1.add(3));
		System.out.println(car1.add(4));
		
		System.out.println(car2.add(3));
		System.out.println(car2.add(3));
		
		// CarclulaterŬ������ ���� ������ ���� car1, car2 �̰��� ��ü��� �θ���
		// ����� ���� �ٸ� ������ ������� ������� �������� ���� �����Ѵ�.
		// ��ü�� ����ϸ� ��ѱ� ����� �þ���� ��ü�� ������ �ϸ� �Ǳ� ������ Ŭ�������� ����ϴ� ���� �޸� �ſ� ����������
		
		// ���� ���� ����� �߰��Ϸ��� sub�޼ҵ带 �߰��ϸ� �ȴ�.
		// int sub(int num) {
		//     result -= nu,;
		//     return result;
		// }
		
		
		
	}

}
