package day2;

public class switchcase {

	public static void main(String[] args) {
		// switch/case���� if���� ��������� �� �� ����ȭ�� ���� �Ǵܹ��̴�.
		
		// switch(�Էº���) {
		//      case �Է°�1: ...
		// 			break;
		// 		case �Է°�2: ...
		// 			break;
		// ...
		// default: ...
		// 			break;
		// }
		
		// �Էº����� ���� ��ġ�ϴ� case �Է°��� �ִٸ� �ش� case���� ���� ������� ����ȴ�
		// ���� break ���� �����ֵ��� �� ������ case���� ����ȴ�
		
		int month = 8;
		String monthString = "";
		switch (month) {
		case 1: monthString = "January";
				break;
		case 2: monthString = "February";
				break;
		case 3: monthString = "March";
				break;
		case 4: monthString = "April";
				break;
		case 5: monthString = "May";
				break;
		case 6: monthString = "June";
				break;
		case 7: monthString = "July";
				break;
		case 8: monthString = "August";
				break;
		case 9: monthString = "September";
				break;
		case 10: monthString = "October";
				break;
		case 11: monthString = "Nobember";
				break;
		case 12: monthString = "December";
				break;
		default: monthString = "Invalid month";
				break;
		
		}
		System.out.println(monthString);
		
		// switch���� �Է��� 1�̸� "January"��� ���ڿ���, 12�� "December"��� ���ڿ��� ��µǴ� �����̴�
		// month�� 8�� �����Ǿ� �ֱ� ������ "August"��� ���ڿ��� ��µ� ���̴�
		// ���� 1���� 12���� ���ڰ� �ƴ� �ٸ� ���� ����Ǿ� �ִٸ� default: ������ ����ȴ�.
		// ���� ���� �Է°��� ����ȭ�Ǿ� �ִ� ��� if�����ٴ� switch/case���� ���°��� ���������� �� �� �����ϴ�.

	}

}
