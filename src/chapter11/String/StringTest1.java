package chapter11.String;

//String클래스 : 문자열 데이터를 관리
public class StringTest1 {

	public static void main(String[] args) {
		
		String str1 = new String();
		String str2 = new String();
		
		System.out.println(str1 == str2); //주소 비교로 false 출력
		System.out.println(str1.equals(str2)); //문자열 비교로 true 출력
		
		//이 표현형태로 사용하면 힙영역에 "abc"라는 문자열 데이터가 한번이라도 사용이 되어있으면 재사용한다.
		//주소가 동일하게 된다.
		String str3 = "abc";
		String str4 = "abc"; //"abc"기억장소를 재사용한다.
		
		System.out.println(str3 == str4); //true
		System.out.println(str3.equals(str4)); //true
	}

}
