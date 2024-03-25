package chapter6.staticEx;

//JVM이 운영체제로부터 메모리 할당을 위임받아서 자바프로그램을 실행할 때 사용되는 메모리의 영역을 학습하는 예제
//static area(method area) : 정적영역
//실제 개발에서는 필드는 private, public getter/setter 메소드 사용
public class Student {
	
	//필드선언
	//필드가 private접근자일때만 getter/setter메소드를 정의한다
	//문법 : 접근자 [static선택] 데이터타입 변수;
	//자바 프로그램이 실행될 때 JVM이 클래스의 내용을 보고 static 키워드를 사용하는 필드, 메소드에 대하여 static area 메모리 생성
	
	//static 필드(정적필드)
	static int serialNum;
	
	//인스턴스(instance)필드 : Student st1 = new Student(); 객체생성구문이 실행이 될때만 stack, heap 영역의 메모리를 사용
	int studentId;
	String studentName;
	int grade;
	String address;
	int count;
	
	//getter메소드 : studentName필드로 생성된 기억장소의 값을 읽어오기위한 목적의 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		//serialNum++; 메소드는 JVM이 자동으로 메모리를 생성 해주기때문에 인스턴스 메소드가 호출이 된다면 먼저 생성되어 있는 메모리 접근이 당연하므로 문제가 안된다
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getSerialNum() {
		serialNum++; 
		//static 필드는 클래스명.static필드로 기억장소를 접근한다.
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		
		//static 필드는 클래스명.static필드로 기억장소를 접근한다.
		Student.serialNum = serialNum;
	}
	
}
