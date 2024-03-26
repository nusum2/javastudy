package chapter8.casting;

//원형
public class Circle extends Shape {

	
	//부모클래스의 draw메소드를 재정의
	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	void Circle() {
		System.out.println("원 입니다.");
	}
	void method1() {
		super.draw(); //부모의 draw()메소드를 호출
	}
}
