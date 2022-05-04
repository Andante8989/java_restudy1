package day2;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		// "���"�� ���� ��� �������� "�̸�" = "ȫ�浿" ������ ������ �� �ִ�
		// �ڹ��� ��(map)�� �̷��� �������踦 ���� ǥ���� �� �ְ� �� �ִ� �ڷ����̴�. �̰��� ���� ������ ��κ��� ���鵵
		// ���� �ִ� �ڷ������� Associative array, Hash��� �Ҹ���
		
		// ��(Map)�� ����(dictionary)�� ����ϴ�. ��, people �̶� �ܾ "���", baseball �̶�� �ܾ
		// "�߱�"��� ���� ���յǵ��� Map�� Key�� Value�� �� ������ ���� �ڷ����̴�
		
		// map�� ����Ʈ�� ������ó�� ���������� �ش� ��Ұ��� ������ �ʰ� key�� ���� value�� ��´� 
		// HashMap
		// map���� List�� ���������� �������̽��̴�. Map �������̽��� ������ Map�ڷ�������
		// HashMap, LinkedHashMap, TreeMap���� �ִ�.
		
		// put
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "���");
		map.put("baseball", "�߱�");
		
		// get
		System.out.println(map.get("people"));  // "���" ���
		// ���� key�� �ش��ϴ� value�� ���� ��쿡 get�޼ҵ带 ����ϸ� ����ó�� null�� �����Ѵ�
		System.out.println(map.get("java"));   // null ���
		// �̶� null ��� ����Ʈ ���� ��� ���� ��쿡�� getOrDefault �޼��带 ����Ѵ�.
		System.out.println(map.getOrDefault("java", "�ڹ�"));  // "�ڹ�" ���
		
		
		// containsKey
		System.out.println(map.containsKey("people"));  // "people"�̶�� Ű�� �����ϹǷ� true ���
		
		// remove
		System.out.println(map.remove("people"));  // "people"�� �ش�Ǵ� ������"���"�� ������ �� "���"�� ���
		
		// size
		System.out.println(map.size());  // people�� ���������Ƿ� 1 ���
		
		// keySet
		System.out.println(map.keySet()); // remove�ȉ�ٴ� �����Ͽ� [baseball, people] ��� 
		
		
		
		

	}

}
