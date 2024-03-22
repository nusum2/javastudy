package chapter5.hiding;

//default 필드는 동일한 패키지일 경우는 접근이 되고 다른 패키지에서는 접근이 안된다
public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.day = 1;
		date.month = 10;
		//date.year = 2024; private접근자로 되어있기 때문에 접근이 안되는 특징이 있다.
		
	}

}
