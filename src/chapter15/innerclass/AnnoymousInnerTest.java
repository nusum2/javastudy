package chapter15.innerclass;

//익명 내부 클래스 - 일회성 특징으로 사용하는 클래스

class Outer2 {
	
	//익명구현객체 : 클래스명 없이 객체를 생성하는형태 그리고 일회성목적으로 작업
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			
		}
	};
}
public class AnnoymousInnerTest {

	public static void main(String[] args) {

		
	}

}
