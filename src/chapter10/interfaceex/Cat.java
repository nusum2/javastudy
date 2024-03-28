package chapter10.interfaceex;

//인터페이스를 상속받는 클래스는 implements 사용
//구현클래스
public class Cat implements Animal{
	
	//부모 인터페이스의 추상메소드를 구현
	@Override
	public void run() {
		System.out.println("고양이가 달린다.");
	}

	@Override
	public void cry() {
		System.out.println("고양이가 운다.");
	}
	
}
