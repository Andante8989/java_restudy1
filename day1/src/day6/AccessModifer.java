package day6;

public class AccessModifer {

	public static void main(String[] args) {
		// 접근 제어자
		// private
		// default
		// protected
		// public
		// 위에서 아래순으로 보다 많은 접근을 허용한다
		
		// private
		// 접근 제어자 private으로 설정되었다면 변수, 메소드는 해당 클래스에서만 접근이 가능하다
		/*
		public class Sample {
			private String secret;
			private String getSecret() {
				return this.secret;
			}
		} */
		// secret 변수와 getSecret 메소드는 오직 Sample 클래스에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능하다
		// default 접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메소드는 default 접근 제어자가 되어
		// 해당 패키지 내에서만 접근이 가능하다
		
		/* package house; 패키지가 동일하다
		public class HouseKim {
			String lastname = "park"; // lastname은 default 접근 제어자로 설정된다.
			
			public static void main(String[] args) {
				HouseKim kim = new HouseKim();
				System.out.println(kim.lastname); // HouseKim 클래스의 lastname 변수를 사용할 수 있따.
			}
		} */
		
		// protected
		// 접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지의 클래스 또는 해당 클래스를
		// 상속받은 다른 패키지의 클래스에서만 접근이 가능하다
		/*
		package house;  // 패키지가 서로 다르다
		
		public class HousePark {
			protected String lastname = "park";
		}
		
		package house.person; // 패키지가 서로 다르다
		
		import house.HousePark;
		
		public class EungYongPark extends HousePark {   // HousePark을 상속했다
			public static void main(String[] args) {
				EungYongPark eyp = new EungYongPark();
				System.out.println(eyp.lastname);  // 상속한 클래스의 protected 변수는 접근이 가능하다
			}
		} */
		// HousePark 클래스를 상속한 EungYongPark 클래스의 패키지는 house.person으로 HousePark의 패키지인 house와 
		// 다르지만 HousePark의 lastname 변수가 protected이기 때문에 eyp.lastname과 같은 접근이 가능하다
		// 만약 lastname의 접근제어자가 protected가 아닌 default 접근제어자였다면 eqy.lastname 문장은 컴파일 오류 발생
		
		// public
		// 접근제어자가 public으로 설저오디었따면 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다
		

		
		
		
		
	}

}
