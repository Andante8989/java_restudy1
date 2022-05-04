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
		// 여러분 모두 계산기를 사용해 보았을 것이다. 계산기에 숫자 3을 입력하고 + 기호를 입력한 후 4를 입력하면
		// 결과값으로 7을 보여준다. 다시 한 번 + 기호를 입력한 후 3을 입력하면 기존 결과값 7에 3을 더해 10을 보여준다
		// 즉 계산기는 이전에 계산한 결과값을 항상 메모리 어딘가에 저장하고 있어야 한다
		
		System.out.println(Calculater1.add(3));  // 3출력
		System.out.println(Calculater1.add(4));  // 7출력
		// add메소드는 매개변수 num으로 받은 값을 이전에 계산한 결과값에 더한 후 돌려주는 메소드이다.
		// 이전에 계산한 결과값을 유지하기 위해서 result 전역 변수(static)를 사용했다.
		
		// 그런데 만일 2대의 계산기가 필요한 상황이 발생하면 어떻게 해야할까 
		// 각 계산기는 각가의 결과값을 유지해야하기 때문에 Calculator 클래스 하나만으로는 결과값을 따로 유지할 수 없다
		System.out.println(Calculater2.add(3)); // 3출력
		System.out.println(Calculater2.add(7)); // 10출력
		
		
		// 계산기 1의 결과값이 계산기 2에 아무 영향을 끼치지 않음을 확인할 수 있다. 하지만 계산기가 3개, 5개, 10개로
		// 점점 더 많이 필요해진다면 어떻게 해야 할까? 그때마다 클래스를 추가할 것인가
		// 여기에 빼하기 곱하기등의 긴으을 추가해야 한다면 상황은 점점 더 어려워질 것이다
		
		// 객체를 사용하면 다음과 같이 간단하게 해결할 수 있다
		
		Calculater1 car1 = new Calculater1(); // 계산기 1 객체를 생성한다. 
		Calculater2 car2 = new Calculater2(); // 계산기 2 객체를 생성한다.
		
		System.out.println(car1.add(3));
		System.out.println(car1.add(4));
		
		System.out.println(car2.add(3));
		System.out.println(car2.add(3));
		
		// Carclulater클래스로 만든 별계의 계산기 car1, car2 이것을 객체라고 부른다
		// 결과값 역시 다른 계산기의 결과값과 상관없이 독립적인 값을 유지한다.
		// 객체를 사용하면 계싼기 대수가 늘어나더라도 객체를 생성만 하면 되기 때문에 클래스만을 사용하는 경우와 달리 매우 간단해진다
		
		// 만약 빼기 기능을 추가하려면 sub메소드를 추가하면 된다.
		// int sub(int num) {
		//     result -= nu,;
		//     return result;
		// }
		
		
		
	}

}
