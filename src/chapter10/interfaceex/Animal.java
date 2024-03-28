package chapter10.interfaceex;

//인터페이스
//추상메소드 목적으로 존재하는 것
//추상메소드 : 구현클래스에게 강제적으로 추상메소드를 구현하게 만든다. 즉, 기능에 해당하는 메소드 작업을 강제한다.
//객체생성 불가능
//상속을 목적으로 한다.
public interface Animal {
	
	//필드 사용 불가능
//	String eyeColor;
//	String speed;
	
	//메소드 사용 불가능
//	void methodA() {}
	//인터페이스 구성요소
	//추상메소드, 상수, 디폴트메소드, 정적메소드
	
	void run(); //public abstract 생략
	
	void cry();
}
