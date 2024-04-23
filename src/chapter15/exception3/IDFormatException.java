package chapter15.exception3;

//사용자 정의 제외 - 기업체의 업무적인 기능을 구현하면 동작할 때 발생되는 특징을 처리하기위한 목적

public class IDFormatException extends Exception{
	
	//매개변수가 있는 생성자
	public IDFormatException(String message) {
		super(message);
	}
}
