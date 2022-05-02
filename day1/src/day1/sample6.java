package day1;

public class sample6 {

	public static void main(String[] args) {
		// ���ڿ� ���� �޼ҵ�
		// equals
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false ���
		System.out.println(a.equals(c)); // true ���
		
		// ���ڿ� a�� ���ڿ� b�� "hello"�� "java"�� ���� ���� �ʴ�. ���� equals �޼ҵ� ȣ�� �� false�� �����Ѵ�
		// ���ڿ� a�� ���ڿ� c�� "hello"�� "hello"�� ���� ����. ����  true�� �����Ѵ�
		
		// ���ڿ��� ���� ���Ҷ��� �ݵ�� equals�� ����ؾ��Ѵ�. == �����ڸ� ����� ��� ������ ���� ��찡 �߻��� �� �ִ�
		String d = "hello";
		String e = new String("hello");
		System.out.println(d.equals(e)); // true
		System.out.println(d == e); // false
		
		// d��e�� ���� ������ ���� �ٸ� ��ü�̴�.== �� �ΰ��� �ڷ����� ������ ��ü������ �Ǻ��� �� ����ϴ� �������̱� ������ 
		// false�� �����Ѵ�
		
		// indexOf
		String g = "Hello Java";
		System.out.println(g.indexOf("Java")); // 6���
		// "Hello Java" ��� ���ڿ����� "Java"��� ���ڿ��� �ϰ���° ���� 'J'���� �����̴�.
		// ������� 6���� ���� ������ �ڹٴ� ���ڸ� 0���� ���� �����̴�
		
		// contains
		System.out.println(g.contains("Java")); // true ���
		// ���ڿ� g�� "Java"��� ���ڿ��� �����ϰ� �ֱ� ������ true���
		
		// charAt
		System.out.println(g.charAt(6)); // "J"���
		// "Hello Java"��� ���ڿ����� "J" ��� ���ڴ� �ϰ���° �����̴�. ������ 6���� ���ڸ� ã�ƾ��ϴ� �̴��� �ڹٴ�
		// ���ڸ� 0���� ���� �����̴�
		
		// replaceAll
		System.out.println(g.replaceAll("Java", "World")); // Hello World ���
		// "Hello Java"��� ���ڿ����� "Java"�� "World"�� �ٲ����
		
		// subString
		System.out.println(g.substring(0, 4)); // Hell ���
		// ��ó�� subString(������ġ, ����ġ)�� ���� ����ϸ� ���ڿ��� ������ġ���� ����ġ������ ���ڸ� �̾Ƴ��� �ȴ�
		// �� ����ġ�� ������ �ȵȴٴ� ���� ��������. �̰��� ������ ���� �����ǽİ� ����ϴ�
		// ������ġ <= g < ����ġ
		
		// toUpperCase
		System.out.println(g.toUpperCase()); // HELLO JAVA ���
		
		// split
		String h = "a : b : c : d";
		String[] result = g.split(":"); // result �� {"a", "b", "c", "d"}
		
		// ���ڿ� ������
		// 1. ���� �ٷδ���
		System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples. ���
		// ����ó�� ���ڿ��ȿ� ���� 3�� �����ϴ� ����� �����ش�. ���ڸ� �ְ� ���� �ڸ��� %d ���ڸ� �־��ְ� 
		// ������ ���� 3�� �ι�° �Ķ���ͷ� �����ߴ�. ���⿡�� %d�� ���ڿ� ���� �ڵ��� �θ���
		
		// 2. ���ڿ� �ٷ� ����
		System.out.println(String.format("I eat %s apples", "five")); // I eat five apples ���
		// ���ʹٸ��� %d�� �ƴ� %s�� ����. ��¼�� ��ġ ���� ���ڴ� ���� �����Ͽ��� ���̴�
		// ���ڸ� �ֱ� ���ؼ��� %d�� ��� �ϰ�, ���ڿ��� �ֱ� ���ؼ��� %s�� ��� �Ѵ�
		
		// 3. ���ڰ��� ��Ÿ���� ������ ����
		int number = 3;
		System.out.println(String.format("I eat %d apples.", number)); // I eat 3 apples ���
		
		// 4. 2�� �̻��� �� �ֱ�
		int num = 10;
		String day = "three";
		// I ate 10 apples. so I was sick for three days ���
		System.out.println(String.format("I ate %d apples. so I was sick for %s.", number, day ));
		
		
		

	}

}
