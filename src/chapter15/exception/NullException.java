package chapter15.exception;

class Person{
	int a;
}

public class NullException {

	public static void main(String[] args) {
		
		Person ps = null;
		//ps = new Person(); //이 구문이 실행이 되어야 힙영역에 int a 에 대한 기억장소가 생성된다
		//NullPointerException
		try {
		System.out.println(ps.a); //힙영역에 기억장소x, 없는 곳에 접근하고 있어 실행시 에러발생
		}catch (NullPointerException ex) { //Exception : 예외 관련 클래스 중 최상위 클래스
			System.out.println(ex);
			System.out.println("예외발생");
		}
		System.out.println("프로그램 종료");
		}

}
