package chapter11.wrapper;

//wrapper클래스
//기본데이터타입을 객체관점으로 사용할 때 기능을 제공한다
/*
기본데이터타입             Wrapper클래스
boolean                Boolean
byte                   Byte
char                   Character
short                  Short
int                    Integer
long                   Long
float                  Float
double                 Double
 
 */
public class IntegerTest {

	public static void main(String[] args) {
		
		//Boxing과 unBoxing
		//Boxing : 기본형을 객체형으로 변환 후 저장
		//Unboxing : 객체형을 기본형으로 꺼내오는 것
		
		//참조타입 클래스 = 기본데이터타입;
		Integer num = 100;
		int jNum = num.intValue();
		int num1 = 100;
	}

}
