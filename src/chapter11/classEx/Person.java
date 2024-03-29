package chapter11.classEx;

public class Person {
	
	private String name;
	private int age;
	
	//기본생성자
	public Person() {}
	//필드사용
	public Person(String name) {
		this.name = name;
	}
	//매개변수
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	//게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
