package chapter15.stream;

import java.util.*;

//Stream클래스의 reduce()메소드 사용하기
//개발자가 기능을 직접 구현 해야함
//배열을 Stream클래스로 사용하기
//사용법 : Arrays.stream(배열), 컬렉션객체.stream()
//reduce()메소드 : 컬렉션의 요소들의 값을 비교하고자 할때 사용
public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~", "hello", "Good Morning", "반갑습니다"};
		
		//위의 String배열을 대상으로 Stream API 작업을 할 경우에는 Arrays.stream(String배열)
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			//람다식 문법
			//s1 매개변수에 "" 대입이 되고, s2 매개변수 "안녕하세요~~"가 대입이 된다
			//s1의 바이트 길이와 s2의 바이트 길이를 if문에서 대소 비교하여 클 길이의 문자열을 s1에 저장
			//그리고 다시 바이트 길이 대소비교를 반복한다.
			System.out.println("데이터 : " + s1);
			System.out.println("데이터 : " + s2);
			
			System.out.println("s1 : " + s1.getBytes().length);
			System.out.println("s2 : " + s2.getBytes().length);
			
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
	}

}
