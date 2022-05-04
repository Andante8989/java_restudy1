package day2;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		// "사람"을 예로 들면 누구든지 "이름" = "홍길동" 등으로 구분할 수 있다
		// 자바의 맵(map)은 이러한 대응관계를 쉽게 표현할 수 있게 해 주는 자료형이다. 이것은 요즘 나오는 대부분의 언어들도
		// 갖고 있는 자료형으로 Associative array, Hash라고도 불린다
		
		// 맵(Map)은 사전(dictionary)과 비슷하다. 즉, people 이란 단어에 "사람", baseball 이라는 단어에
		// "야구"라는 뜻이 부합되듯이 Map은 Key와 Value를 한 쌍으로 갖는 자료형이다
		
		// map은 리스트나 ㅐㅂ열처럼 순차적으로 해당 요소값을 구하지 않고 key를 통해 value를 얻는다 
		// HashMap
		// map역시 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한 Map자료형에는
		// HashMap, LinkedHashMap, TreeMap등이 있다.
		
		// put
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		// get
		System.out.println(map.get("people"));  // "사람" 출력
		// 맵의 key에 해당하는 value가 없을 경우에 get메소드를 사용하면 다음처럼 null이 리턴한다
		System.out.println(map.get("java"));   // null 출력
		// 이때 null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메서드를 사용한다.
		System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
		
		
		// containsKey
		System.out.println(map.containsKey("people"));  // "people"이라는 키가 존재하므로 true 출력
		
		// remove
		System.out.println(map.remove("people"));  // "people"에 해당되는 아이템"사람"이 삭제된 후 "사람"이 출력
		
		// size
		System.out.println(map.size());  // people이 삭제됬으므로 1 출력
		
		// keySet
		System.out.println(map.keySet()); // remove안됬다는 가정하에 [baseball, people] 출력 
		
		
		
		

	}

}
