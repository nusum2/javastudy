package chapter16.stream.decorator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//직렬화 및 역직렬화 예제
//직렬화에 사용할 클래스는 반드시 java.io.serializable인터페이스를 상속
//상속 받은 객체는 직렬화 기본조건
class Person implements Serializable {
	
	
	//역직렬화시 클래스 상태가 다랄도 아래 serialVersionUID로 인하여 에러를 막을 수 있다.
	private static final long serialVersionUID = -3453004897960665710L;
	String name;
	String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public String toString() {
		return name + "," + job;
	}
}


public class SerializationTest {
	public static void main(String[] args) {
		
		//직렬화로 사용할 객체 생성
		Person personHong = new Person("홍길동", "의적");
	    Person personSon = new Person("손흥민", "축구선수");
	    
	    try(
	    		FileOutputStream fos = new FileOutputStream("serial.out");
	    		ObjectOutputStream oos = new ObjectOutputStream(fos); //직렬화작업으로 사용할 보조스트림
	    		
	    		) 
	    {
	    	//직렬화작업
	    	oos.writeObject(personHong); //personHong 객체상태를 "serial.out"에 저장
	    	oos.writeObject(personSon); //personSon 객체상태를 "serial.out"에 저장
	    	
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
