package chapter10.interfaceex;

//인터페이스
//추상메소드 목적으로 존재하는 것
//객체생성 불가능
//상속을 목적으로 한다.
public interface Animal {
	
	//필드 사용 불가능
//	String eyeColor;
//	String speed;
	
	//메소드 사용 불가능
//	void methodA() {}
	
	void run(); //public abstract 생략
	
	void cry();
}
