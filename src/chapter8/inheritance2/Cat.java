package chapter8.inheritance2;

public class Cat extends Animal {
	
	@Override
	void run() {
		//새로운 작업
		//super.run(); 부모클래스 내용을 호출
		System.out.println("고양이가 달린다.");
	}
	@Override
	void cry() {
		//새로운 작업
		System.out.println("고양이가 운다.");
	}
}
