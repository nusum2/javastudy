package chapter15.exception2;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		
		try(AutoCloseObj obj2 = obj) {
			//예외발생
			throw new Exception(); //이 구문이 예외를 발생시키는 가능을 하게된다. 
			//그리고 obj.close() 메소드가 호출되어 힙영역의 주소를 더이상 참조하지 않게된다.
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}

}
