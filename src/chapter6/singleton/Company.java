package chapter6.singleton;

//디자인 패턴중 상글톤 패턴으로 구성하는 클래스이다.
//싱글톤 패턴 디자인 : 단 하나의 객체만 생성을 하고자 하는 목적
public class Company {
	//클래스안에서 자신을 private static 멤버로 객체생성
	//1)클래스안에서 자신은 private static 멤버로 객체 생성
	private static Company instance = new Company();
	
	//생성자
	//2)생성자를 디폴트생성자로 생성되지않게하고 private 접근자를 사용하라
	private Company(){}
	
	//3)public getter메소드 정의 : instance private이므로 클래스 외부에서 접근이 막아져있으므로 getter메소드 사용
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
