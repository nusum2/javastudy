package chapter5.classpart;


public class PersonTest {

	public static void main(String[] args) {
		
		//Person클래스 사용
		Person ps1 = new Person();
		
		//ps1 객체가 가리키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = false;
		
		System.out.println("이름 : " + ps1.name);
    	System.out.println("신장(키) : " + ps1.height);
    	System.out.println("몸무게 : " + ps1.weight);
    	System.out.println("성별 : " + ps1.gender);
    	System.out.println("결혼유무 : " + ps1.married);
		
		ps1.getPersonInfo();
		
		Person ps2 = new Person();
		
		ps2.name = "김";
		ps2.height = 170;
		ps2.weight = 70;
		ps2.gender = 'M';
		ps2.married = false;
		
		Person ps3 = new Person();
		
		ps3.name = "이";
		ps3.height = 185;
		ps3.weight = 90;
		ps3.gender = 'M';
		ps3.married = true;
		
		Person ps4 = new Person();
		
		ps4.name = "최";
		ps4.height = 155;
		ps4.weight = 50;
		ps4.gender = 'W';
		ps4.married = false;
		
		Person ps5 = new Person();
		
		ps5.name = "박";
		ps5.height = 150;
		ps5.weight = 45;
		ps5.gender = 'W';
		ps5.married = true;
	}

}
