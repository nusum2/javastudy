package chapter15.lambda;

public class TestMyNumber {
	public static void main(String[] args) {
		
		//함수형인터페이스일 경우에만 람다식문법으로 추상메소드 구현
		//함수형 인터페이스의 추상메소드를 람다식 문법으로 표현
		//인터페이스 변수 = 추상메소드를 구현한 람다식 문법코딩
		MyNumber max = (x,y) -> (x>=y) ? x:y;
		System.out.println(max.getMax(10, 20));
	}
}
