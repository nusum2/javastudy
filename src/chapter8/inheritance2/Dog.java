package chapter8.inheritance2;

public class Dog extends Animal {

	//run()메소드의 내용을 내 클래스의 용도에 맞게 새롭게 구성
	//상속관계에서 부모클래스의 메소드명 그대로 사용하여 내용을 재구성하는 작업 - overriding
	@Override
	void run() {
		//새로운 작업
		//super.run(); 부모클래스 내용을 호출
		System.out.println("개가 달린다.");
	}
	@Override
	void cry() {
		//새로운 작업
		System.out.println("개가 운다.");
	}
}
