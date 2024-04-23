package chapter15.lambda2;

//원본 자바파일에는 인터페이스, 클래스 코드가 함께 작성되어있지만
//컴파일 되면 인터페이스 내용은 class파일이 따로 생성된다

interface PrintString {
	//추상메소드
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		//인터페이스명 변수 = 추상메소드를 구현한 람다식 문법;
		PrintString lambdaStr = s -> System.out.println(s); //매개변수가 1개일때는 괄호 생략가능
		
		//showString()메소드 호출하면 위의 람다식이 실행된다.
		lambdaStr.showString("hello lambda 1");
		
		showMyString(lambdaStr);
		
		PrintString reStr = returnString(); //(str) -> System.out.println(str + "world");
		reStr.showString("hello ");
	}
	//함수형인터페이스를 메소드의 매개변수로 사용하기
	public static void showMyString(PrintString p) {
		p.showString("hello lambda 2"); //s -> System.out.println(s); 실행된다.
		
	}
	//함수형인터페이스를 메소드의 리턴 타입으로 사용하기
	public static PrintString returnString() {
		
		// void showString(String str); 메소드에 대한 람다식 문법을 리턴으로 코드작성
		return (str) -> System.out.println(str + "world");
	}
}
