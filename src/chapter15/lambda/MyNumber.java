package chapter15.lambda;

//함수형 인터페이스 : 추상메소드 단 1개를 가지고 있는 인터페이스
//@FunctionInterface : 인터페이스가 추상메소드를 1개만 가지고 있을 경우에만 사용가능
@FunctionalInterface //@이름 : Annotation
public interface MyNumber {
	
	//추상메소드, 하나이상 추가하면 에러발생
	int getMax(int num1, int num2);

}
