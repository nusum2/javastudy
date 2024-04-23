package chapter15.innerclass;

//외부클래스
class OutClass {
	private int num = 10;
	private static int sNum = 20; //객체생성전 객체생성과 상관없이 기억장소가 자동생성
	
	//내부클래스를 필드선언해서 사용가능
	private InClass inClass;
	//생성자
	public OutClass() {
		inClass = new InClass(); //내부클래스 객체생성
	}
	//내부클래스
	class InClass {
		int inNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 스태틱 변수)");
		}
	}
	//메소드
	public void usingClass() {
		inClass.inTest();
	}
	//내부클래스2
	static class InstaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //외부클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InstaticClass inNum = " + inNum + "(내부클래스의 인스턴스 변수사용)");
			System.out.println("InstaticClass sInNum = " + sInNum + "(내부클래스의 스태틱 변수사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 스태틱 변수사용)");
		}
		static void sTest() {
			//와부클래스의 인스턴스 멤버는 사용 불가능
			//num += 10;
			//내부클래스의 인스턴스 멤버는 사용 불가능
			//inNum += 10;
			
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 스태틱 변수사용)");
			System.out.println("InstaticClass sInNum = " + sInNum + "(내부클래스의 스태틱 변수사용)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		//인스턴스 내부클래스 객체 생성하는 다양한 방법
		
		//방법1 외부클래스 객체생성하면서 OutClass() 생성자가 호출되어 그 안에서 내부클래스 객체가 생성
		OutClass outClass = new OutClass(); //OutClass()생성자가 호출되어 내부클래스 객체가 생성
		System.out.println("외부클래스 이용하여 내부클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println();
		
		//방법2 외부클래스를 이용하여 내부클래스 객체생성
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부클래스 변수를 이용하여 내부클래스 생성");
		inClass.inTest();
		
		//스태틱 내부클래스 사용하는 방법
		//외부클래스 생성하지않고 바로 정적내부클래스 생성
		OutClass.InstaticClass sInClass = new OutClass.InstaticClass();
		System.out.println("정적 내부 클래스 일반메소드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InstaticClass.sTest();
	}

}
