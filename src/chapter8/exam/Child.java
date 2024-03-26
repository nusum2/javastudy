package chapter8.exam;

public class Child extends Parent {
	
	private int c;
	private int d;
	
	public Child() {
		//super();
		System.out.println("자식생성자 호출 : Child()");
	}
	//매개변수가 있는 생성자
	public Child(int a, int b) {
		super(a,b); //부모클래스의 생성자 호출
	}
	void methodC() {
		
	}
	void methodD() {
		
	}
	//컴파일러는 부모클래스의 메소드를 재정의하는 의미로 아래코드를 해석
	@Override //어노테이션 메소드 재정의
	void methodA() {
		super.methodA();
	}
}
