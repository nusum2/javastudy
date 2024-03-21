package chapter5.classpart;

// 메소드 정의하기
// 메소드 : 기능을 구현하는 코드로 구성된 것
public class FunctionTest {
    
	// main()메소드 : 자바에서 프로그램을 실행하기위한 목적으로 만들어준것
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int sum = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum + "입니다");
		
		int sum2 = substract(n1, n2);
		System.out.println(n1 + " - " + n2 + " = " + sum2 + "입니다");
		
		int sum3 = multiply(n1, n2);
		System.out.println(n1 + " * " + n2 + " = " + sum3 + "입니다");
		
		double sum4 = divide(n1, n2);
		System.out.println((n1 + n2) + " / " + 2 + " = " + sum4 + "입니다");
		
	}
	// 메소드 기본구조
	/*
	 * 리턴타입 메소드이름(매개변수 선언){
	 * 
	 * 
	 * return 사용유무;
	 * }
	 */
	// 정수형 숫자 2개의 값을 매개변수로 제공받아 더한 값을 리턴하는 메소드
	public static int add(int num1, int num2) {
		
		//2개의 값을 더하는 코드 작성
		int result = num1 + num2;
		
		return result;
	}
	// 뺄셈
	public static int substract(int num1, int num2) {
		
		int result = num1 - num2;
		
		return result;
	}
	// 곱셈
	public static int multiply(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
    // 나눗셈
	public static double divide(int num1, int num2) {
		
		// 정수끼리 연산하면 결과는 정수 예) 정수 + 정수 = 정수
		// 정수와 실수끼리 연산하면 결과는 실수 예) 정수 + 실수 = 실수, 해석 : (실수데이터타입)정수 + 실수
		// 실수끼리 연산하면 결과는 실수 예) 실수 + 실수 = 실수
		double result = (num1 + num2) / 2.0;
		
		return result;
	}
}
