package day2;

import java.util.ArrayList;

public class iiff {

	public static void main(String[] args) {
		boolean money = true;
		if(money) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
		// ���ǹ��� �׽�Ʈ�ؼ� ���̸� if���� ���� ������� �����ϰ� ���ǹ��� �����̸� else���� ���� ������� �����Ѵ�.
		
		// ���ǹ��̶�?
		// if(���ǹ�)�� ����� ���ǹ��� ���� ������ �Ǵ��ϴ� �����̴�
		// ���� ���ÿ����� money �� true�̱� �빮�� "�ýø� Ÿ����"�� ��µȴ�
		
		// �񱳿�����
		// <, >, ==, !=, >=, <= 
		int x = 3;
		int y = 2;
		System.out.println(x > y); // true ���
		System.out.println(x == y); // false ���
		System.out.println(x != y); // true ���
		// ���ø� �ٲ㺸�� "���� 3000�� �̻��� ���� ������ ������ �ýø� Ÿ�� �׷��� ������ �ɾ��"
		int money2 = 2000;
		if(money2 >= 3000) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
		// money >= 3000 �̶� ���ǹ��� ������ �Ǳ� ������ else ���� ������ ����Ǿ� "�ɾ��"�� ��µȴ�
		
		// and(&&), or(||), not(!)
		// x || y - x�� y �� ��� �ϳ��� ���̸� ���̴�
		// x && y - x�� y ��� ���̾�� ���̴�
		// !x - x�� �����̸� ���̴�
		
		boolean hasCard = true;
		if(money2 >= 3000 || hasCard) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
		// money�� 2000���� 3000���� ������ hasCard�� true�̱� ������ money >= 3000 || hasCard ���ǹ���
		// ���̵Ǿ� "�ýø� Ÿ�� ����"�� ��µȴ�

		// contains
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
		// pocket����Ʈ �ȿ� money�� �����Ƿ� ���̵Ǿ� "�ýø� Ÿ�� ����"�� ��µȴ�
		
		// else if(�������� �Ǵ�)
		if(pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			if (hasCard) {
				System.out.println("�ýø� Ÿ�� ����");
			} else {
				System.out.println("�ɾ��");
			}
		}
		// if�� else�� ������ ���Ǿ� �����ϱ� ��ƴ� �̷��� else if�� ����Ѵ�
		if(pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else if (hasCard) {
			System.out.println("�ýø� Ÿ����");
		} else {
			System.out.println("�ɾ��");
		}
		// else if �� ���� ���ǹ��� ������ �� ����ȴ�. 
		// else if �� ������ ���� ���� ��� �� �� �ִ�.
		
		
		
		
		
		
		
		
		
		
	}

}
