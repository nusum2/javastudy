package chapter5.exam;

public class Product {
	String name;
	String price;
	
	//생성자를 여러개 정의 가능하게 하는문법 메소드 오버로딩
	//동일한 생성자를 중복정의하는 문법 : 매개변수의 개수와 데이터타입을 다르게 해야한다.
	Product(String name, String price) {
		this.name = name;
		this.price = price;
	}
	Product(){}
}
