package chapter11.String;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = "시작";
		
		//String클래스로 문자열 연결작업을 하면 새로운 기억장소를 생성하여 관리한다
		for (int i = 0; i < 100; i++) {
			str1 += i + " 번째 문자열\n";
		}
		System.out.println(str1);
		
		//처음 생성된 힙영역의 기억장소를 이용하여 문자열 데이터가 관리된다
		StringBuilder sb = new StringBuilder("시작");
		
		for (int i = 0; i <= 10; i++) {
			sb.append(i + " 번째 문자열\n");
			System.out.println(System.identityHashCode(sb));
		}
		System.out.println(sb);
	}

}
