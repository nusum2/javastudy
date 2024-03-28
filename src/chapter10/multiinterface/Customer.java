package chapter10.multiinterface;

//클래스는 단일상속허용. 다중상속은 금지
//클래스가 인터페이스 상속은 다중상속이 가능하도록 설계
public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매");
	}

	@Override
	public void buy() {
		System.out.println("구매");
	}
	@Override
	public void order() {
		//부모 인터페이스의 default메소드 호출
		//Sell.super.order();
		//Buy.super.order();
	}
	
}
