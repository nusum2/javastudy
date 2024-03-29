package chapter11.String;

//문자열 데이터끼리 결합을 하면 새로운 기억장소로 관리가 된다.
public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		//"javaandroid"새로운 문자열로 기억장소 새로 생성
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr); //javaandroid
		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		
	}

}
