package day6;

public class AccessModifer {

	public static void main(String[] args) {
		// ���� ������
		// private
		// default
		// protected
		// public
		// ������ �Ʒ������� ���� ���� ������ ����Ѵ�
		
		// private
		// ���� ������ private���� �����Ǿ��ٸ� ����, �޼ҵ�� �ش� Ŭ���������� ������ �����ϴ�
		/*
		public class Sample {
			private String secret;
			private String getSecret() {
				return this.secret;
			}
		} */
		// secret ������ getSecret �޼ҵ�� ���� Sample Ŭ���������� ������ �����ϰ� �ٸ� Ŭ���������� ������ �Ұ����ϴ�
		// default ���� �����ڸ� ������ �������� �ʴ´ٸ� ���� �����ڰ� ���� ����, �޼ҵ�� default ���� �����ڰ� �Ǿ�
		// �ش� ��Ű�� �������� ������ �����ϴ�
		
		/* package house; ��Ű���� �����ϴ�
		public class HouseKim {
			String lastname = "park"; // lastname�� default ���� �����ڷ� �����ȴ�.
			
			public static void main(String[] args) {
				HouseKim kim = new HouseKim();
				System.out.println(kim.lastname); // HouseKim Ŭ������ lastname ������ ����� �� �ֵ�.
			}
		} */
		
		// protected
		// ���������ڰ� protected�� �����Ǿ��ٸ� protected�� ���� ����, �޼ҵ�� ���� ��Ű���� Ŭ���� �Ǵ� �ش� Ŭ������
		// ��ӹ��� �ٸ� ��Ű���� Ŭ���������� ������ �����ϴ�
		/*
		package house;  // ��Ű���� ���� �ٸ���
		
		public class HousePark {
			protected String lastname = "park";
		}
		
		package house.person; // ��Ű���� ���� �ٸ���
		
		import house.HousePark;
		
		public class EungYongPark extends HousePark {   // HousePark�� ����ߴ�
			public static void main(String[] args) {
				EungYongPark eyp = new EungYongPark();
				System.out.println(eyp.lastname);  // ����� Ŭ������ protected ������ ������ �����ϴ�
			}
		} */
		// HousePark Ŭ������ ����� EungYongPark Ŭ������ ��Ű���� house.person���� HousePark�� ��Ű���� house�� 
		// �ٸ����� HousePark�� lastname ������ protected�̱� ������ eyp.lastname�� ���� ������ �����ϴ�
		// ���� lastname�� ���������ڰ� protected�� �ƴ� default ���������ڿ��ٸ� eqy.lastname ������ ������ ���� �߻�
		
		// public
		// ���������ڰ� public���� ������������� ����, �޼ҵ�� � Ŭ���������� ������ �����ϴ�
		

		
		
		
		
	}

}
