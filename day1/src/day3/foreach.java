package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class foreach {

	public static void main(String[] args) {
		// for each�� J3SE 5.0 ���� �߰��Ǿ���. for each��� Ű���尡 ���� �ִ� ���� �ƴϰ� ������ for�� �̿��Ѵ�
		
		String[] numbers = {"one", "two", "three"};
		for (String number : numbers) {
			System.out.println(number);
		}
		// for each���� ���⿡ �ſ� �������̴�
		// for each���� ������ ������ ����
		// for (type car : iterate) {
		//     body-of-loop
		// }
		
		// ������ iterate�� ������ ���� ��ü�̰� iterate ��ü���� �Ѱ��� ���������� var�� ���ԵǾ� for���� ����ȴ�
		// iterate�� ����� �� �ִ� �ڷ����� ������ ���� �� �ִ� �ڷ���(�迭 �� ArrayList��)�� �����ϴ�
		
		ArrayList<String> numberss = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String number : numberss) {
			System.out.println(number);
		}
		
		// ��, for each���� ���� �ݺ�ȸ���� ��������� �ִ°��� �Ұ����ϰ� 1���۾� ���������� �ݺ��ɶ��� ��밡���ϴٴ� ������ �ִ�.
		
		
		
		
		
		

	}

}
