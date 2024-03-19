package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 문자형 데이터타입 char(2)
		// char 데이터타입으로 만든 기억장소 값은 작은 따옴표로 표현
		// 문자1개로 코딩해야함.
		// 문자로 저장되지만 내부적으로는 숫자의 의미
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력
		System.out.println((int)ch1); // 문자에 해당하는 숫자 출력
		
		// 숫자로 저장
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3); // 숫자 67 출력
		System.out.println((char)ch3);// 문자 C 출력
	}

}
