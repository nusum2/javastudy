package chapter15.innerclass;

//지역내부클래스
class Outer {
	//전역변수
	int outNum = 100;
	static int sNum = 200;
	//메소드내부에 클래스를 정의
	Runnable getRunnable(int i) {
		int num = 100; //지역변수
		
		//스레드
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부클래스 정적 변수)");
			}
		}
			return new MyRunnable();
		
	}
	void methodA() {
		class A{}
		
		A a = new A();
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
