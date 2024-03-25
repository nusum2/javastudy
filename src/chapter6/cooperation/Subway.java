package chapter6.cooperation;

//학생이 통학수단으로 사용하는 지하철 - 지하철 호선, 인원수, 수입
public class Subway {
	
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	//매개변수가 있는 생성자, 지하철 노선 초기화
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은" + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
