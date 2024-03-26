package chapter8.inheritance;

//부모클래스(상위클래스) : 상속을 주는 클래스
public class Customer {
	
	//필드
	int customerId; //고객아이디
	String customerName; //고객이름
	String customerGrade; //고객등급
	int bonusPoint; //고객 보너스 포인트
	double bonusRatio; //보너스 포인트 적립비율
	
	//생성자
	public Customer() {
		customerGrade = "silver";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	//매개변수가 있는 생성자
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "silver";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int,String ) 생성자 호출");
	}
	//일반메소드
	public int calcPrice(int price) {
		System.out.println("Customer.calcPrice");
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	//getter 메소드 : 힙영역의 필드명으로 생성된 기억장소의 값을 읽어오는 목적, 접근자 public
	//setter 메소드 : 힙영역의 필드명으로 생성된 기억장소의 값을 변경하는 목적, 접근자 public
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
