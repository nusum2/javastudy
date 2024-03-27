package chapter9.abstractex;

//추상클래스는 abstract 키워드를 사용해야 한다.
//특징 : 1.객체생성 불가능(new 생성자()), 2.상속을 목적, 3.상속을 받는 자식클래스는 강제적 구현
//바디가 없는 메소드(추상메소드) : 메소드의 기능을 정의할 필요가 없다고 결정됐을 때 추상클래스로 구성
public abstract class Animal {
	
	//필드
	String eyeColor;
	String speed;
	//메소드
	
	//추상메소드 : 몸통(body)가 없는 메소드
	abstract void run();
	
	abstract void cry();
}
