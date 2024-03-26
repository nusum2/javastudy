package chapter8.inheritance;

public class VIPCustomer extends Customer {
	
	//추가
	private int agentId; //담당 상담원 ID
	double saleRatio; //할인율
	
	//생성자
	public VIPCustomer() {
		//상속
		customerGrade = "vip";
		bonusRatio = 0.05;
		
		//자신것
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	//super : 상속관계에서 부모(상위)클래스를 가리키는 의미
	//매개변수가 있는 생성자
	public VIPCustomer(int customerId, String customerName, int agentId) {
		//부모의 매개변수가 있는 생성자 호출
		super(customerId, customerName );
		//부모상속
		customerGrade = "vip";
		bonusRatio = 0.05;
		//자신
		saleRatio = 0.1;
		this.agentId = agentId;
		
		System.out.println("VIPCustomer(int, String, int)생성자 호출");
	}
	//부모클래스에서 메소드이름만 사용하고 내용은 변경해서 작업하고자 할때
	//메소드 재정의 (overriding)
	@Override
	public int calcPrice(int price) {
		System.out.println("VIPCustomer.calcPrice");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	public int getAgentId() {
		return agentId;
	}
	
}
