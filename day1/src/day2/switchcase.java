package day2;

public class switchcase {

	public static void main(String[] args) {
		// switch/case문은 if문과 비슷하지만 좀 더 정형화된 조건 판단문이다.
		
		// switch(입력변수) {
		//      case 입력값1: ...
		// 			break;
		// 		case 입력값2: ...
		// 			break;
		// ...
		// default: ...
		// 			break;
		// }
		
		// 입력변수의 값과 일치하는 case 입력값이 있다면 해당 case문에 속한 문장들이 실행된다
		// 만약 break 문이 빠져있따면 그 다음의 case문이 실행된다
		
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
		
		// switch문의 입력이 1이면 "January"라는 문자열이, 12면 "December"라는 문자열이 출력되는 예제이다
		// month가 8로 고정되어 있기 때문에 "August"라는 문자열이 출력될 것이다
		// 만약 1에서 12사이 숫자가 아닌 다른 값이 저장되어 있다면 default: 문장이 수행된다.
		// 위와 같이 입력값이 정형화되어 있는 경우 if문보다는 switch/case문을 쓰는것이 가독성에서 좀 더 유리하다.

	}

}
