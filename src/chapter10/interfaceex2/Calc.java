package chapter10.interfaceex2;

public interface Calc {
	
	//구성요소
	//상수, 추상메소드, default메소드, static메소드
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	//자바1.8부터 디폴트,스태틱메소드 지원
	default void description() {
		
	}
	static void myStaticMethod() {
		
	}
	
	//자바1.9 private 메소드 지원
	private void myMethod() {
		System.out.println("private 메소드입니다.");
	}
}
