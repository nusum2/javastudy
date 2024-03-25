package chapter6.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		
		//싱글톤 패턴 클래스로 객체생성 불가능
		//Company com1 = new Company();
		
		//com1,2,3은 미리 생성된 동일한 객체의 주소를 갖게된다.
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		System.out.println(com1 == com2);
	}
}
